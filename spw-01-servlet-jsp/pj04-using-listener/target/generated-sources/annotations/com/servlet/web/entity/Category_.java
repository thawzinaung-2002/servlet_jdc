package com.servlet.web.entity;

import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Category.class)
public abstract class Category_ {

	public static final String NAME = "name";
	public static final String ID = "id";

	
	/**
	 * @see com.servlet.web.entity.Category#name
	 **/
	public static volatile SingularAttribute<Category, String> name;
	
	/**
	 * @see com.servlet.web.entity.Category#id
	 **/
	public static volatile SingularAttribute<Category, Integer> id;
	
	/**
	 * @see com.servlet.web.entity.Category
	 **/
	public static volatile EntityType<Category> class_;

}

