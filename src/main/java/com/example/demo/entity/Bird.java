package com.example.demo.entity;

public class Bird extends Animal {

	public Bird() {
		super();
		System.out.println("Bird�غc��k");	
		}
	@Override
	public void eat() {
		System.out.println(super.getName() +"��Y��");
	}
	@Override

	public void sleep() {
		System.out.println(super.getName() +"��Y��");
	}
	public void flying() {
		System.out.println(super.getName() + "Bird ���b��");
	}
}
