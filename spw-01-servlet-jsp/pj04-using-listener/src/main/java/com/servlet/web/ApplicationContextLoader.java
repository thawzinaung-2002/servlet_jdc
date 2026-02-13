package com.servlet.web;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class ApplicationContextLoader implements ServletContextListener{

	private ConfigurableApplicationContext applicationContext;
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		sce.getServletContext().setAttribute("applicationContext", applicationContext);
		System.out.println("""
				================================
				  IoC Container is Initialized
				================================
				""");
		
		Runtime.getRuntime().addShutdownHook(new Thread(() -> {
			
			applicationContext.close();
			
			System.out.println("""
					================================
					 IoC Container is shutting down!
					================================
					""");
		}));
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		
		System.out.println("""
				================================
				  IoC Container is Closed
				================================
				""");
		
		if(null != applicationContext) {
			applicationContext.close();
		}
	}
	
}
