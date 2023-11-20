package com.example.demo.entity;

public class Bird extends Animal {

	public Bird() {
		super();
		System.out.println("Bird建構方法");	
		}
	@Override
	public void eat() {
		System.out.println(super.getName() +"邊吃玩");
	}
	@Override

	public void sleep() {
		System.out.println(super.getName() +"邊吃睡");
	}
	public void flying() {
		System.out.println(super.getName() + "Bird 正在飛");
	}
}
