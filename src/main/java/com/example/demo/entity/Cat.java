package com.example.demo.entity;

public class Cat {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void eat() {
		System.out.println("Cat 正在吃");
	}
	
	public void sleep() {
		System.out.println("Cat 正在睡");
	}
	public void barking() {
		System.out.println("Cat 正在飛");
	}
}
