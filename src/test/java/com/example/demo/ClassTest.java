package com.example.demo;

import java.util.Random;

import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import com.example.demo.entity.Dog;
import com.example.demo.entity.TaipeiBank;

public class ClassTest {
	@Test
	public void classTest(){
		Dog yourDog = new Dog();
		System.out.println(yourDog.getName());
		yourDog.setName("cat");
		System.out.println("=====");
		Dog myDog = new Dog();
		System.out.println(myDog.getName());
		myDog.setName("monkey");
		System.out.println(yourDog.getName());
		System.out.println(myDog.getName());
		System.out.println("=====");

		
	}
	@Test
	public void classTest1(){
		Dog dog = new Dog();
		dog.setAttributes(null, null, 0);
	

	}
	@Test
	public void classTest2(){
		TaipeiBank bank = new TaipeiBank();
		System.out.println(bank.getBalance());
		
		Assert.isTrue(bank.getBalance() == 1000, "saving error!!");
		
		bank.saving(-500);
		Assert.isTrue(bank.getBalance() == 1000, "saving error!!");

		System.out.println(bank.getBalance());
		bank.saving(500);
		Assert.isTrue(bank.getBalance() == 1000, "saving error!!");

		System.out.println(bank.getBalance());

	

	}
	
	@Test
	public void classTest6(){
	Dog dog = new Dog();
	dog.setName("Lily");
	dog.setColor("blue");
	dog.setAge(2);
	System.out.println("===========");
	Dog dogg = new Dog("QQQ","GGG",3);
	System.out.println("===========");
	System.out.println(dogg);

	}
//	@Test
//	public void classTest7(){
//	Dog dg = new Dog();
//	dog.setAttributes();
//	Dog.setAttributes2();
//	System.out.println("===========");
//	Math.random();
//	Random ran = new Random();
//	ran.nextInt();
//	System.out.println("===========");
//	int a = 100;
//	aaaa = 200;
//	final int b = 50;
//	bbbb = 100 ;
//	
//
//	}
}
