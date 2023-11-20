package com.example.demo.entity;

import com.example.demo.service.ifs.RunService;

public class Dog implements RunService {

	private String name = "PIG";

	private String color;

	private int age;
	
	
	



	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dog(String name, String color, int age) {
		super();
		this.name = name;
		this.color = color;
		this.age = age;
	}






	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public void setAttributes(String name,String color,int age) {
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("ª¯¦b¶]!");
		
	}
	

}
