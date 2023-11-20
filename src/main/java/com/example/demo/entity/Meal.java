package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "meal")
@IdClass(value =  MealId.class)
public class Meal {
	@Id
	@Column(name = "name")
	private String name;
	@Id
	@Column(name = "cooking_style")
	private String cookingStyle;
	
	@Column(name = "price")
	private int price;

	
	public Meal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Meal(String name, String cookingStyle, int price) {
		super();
		this.name = name;
		this.cookingStyle = cookingStyle;
		this.price = price;
	}


	public String getCookingStyle() {
		return cookingStyle;
	}


	public void setCookingStyle(String cookingStyle) {
		this.cookingStyle = cookingStyle;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}
