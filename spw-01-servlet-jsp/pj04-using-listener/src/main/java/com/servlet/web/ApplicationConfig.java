package com.servlet.web;

import java.util.Map;

import javax.sql.DataSource;

import org.hibernate.jpa.HibernatePersistenceProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.servlet.web.base.BaseRepoImpl;
import com.zaxxer.hikari.HikariDataSource;

import jakarta.persistence.EntityManagerFactory;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "com.servlet.web.repo", repositoryBaseClass = BaseRepoImpl.class)
@ComponentScan(basePackages = "com.servlet.web")
public class ApplicationConfig {
	
	@Bean
	DataSource dataSource() {
		var bean = new HikariDataSource();
		bean.setJdbcUrl("jdbc:mysql://localhost:3306/testdb");
		bean.setUsername("root");
		bean.setPassword("mit@123");
		bean.setDriverClassName("com.mysql.cj.jdbc.Driver");
		return bean;
	}
	
	@Bean
	LocalContainerEntityManagerFactoryBean entityManagerFactory() {
		var bean = new LocalContainerEntityManagerFactoryBean();
		bean.setDataSource(dataSource());
		bean.setPackagesToScan("com.servlet.web.entity");
		bean.setPersistenceProviderClass(HibernatePersistenceProvider.class);
		bean.setJpaPropertyMap(Map.of(
				"hibernate.hbm2ddl.auto","update",
				"hibernate.show_sql","true",
				"hibernate.format_sql", "true"
				));
		return bean;
	}
	
	@Bean
	PlatformTransactionManager transactionManager(EntityManagerFactory emf) {
		var bean = new JpaTransactionManager(emf);
		return bean;
	}

}
