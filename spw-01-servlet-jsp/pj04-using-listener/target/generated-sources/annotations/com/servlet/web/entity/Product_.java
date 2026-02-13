package com.servlet.web.entity;

import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Product.class)
public abstract class Product_ {

	public static final String IMAGE = "image";
	public static final String PRICE = "price";
	public static final String NAME = "name";
	public static final String ID = "id";
	public static final String CATEGORY = "category";

	
	/**
	 * @see com.servlet.web.entity.Product#image
	 **/
	public static volatile SingularAttribute<Product, String> image;
	
	/**
	 * @see com.servlet.web.entity.Product#price
	 **/
	public static volatile SingularAttribute<Product, Integer> price;
	
	/**
	 * @see com.servlet.web.entity.Product#name
	 **/
	public static volatile SingularAttribute<Product, String> name;
	
	/**
	 * @see com.servlet.web.entity.Product#id
	 **/
	public static volatile SingularAttribute<Product, Integer> id;
	
	/**
	 * @see com.servlet.web.entity.Product#category
	 **/
	public static volatile SingularAttribute<Product, Category> category;
	
	/**
	 * @see com.servlet.web.entity.Product
	 **/
	public static volatile EntityType<Product> class_;

}

