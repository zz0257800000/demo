package com.example.demo;

import org.junit.jupiter.api.Test;

import com.example.demo.entity.A1;
import com.example.demo.entity.Animal;
import com.example.demo.entity.Bird;
import com.example.demo.entity.C;
import com.example.demo.entity.Car;
import com.example.demo.entity.Cat;
import com.example.demo.entity.Dog;



public class ExtendsTest {

	
	@Test
	public void extendsTest() {
		Animal anim = new Animal();
		System.out.println("父類別  Animal name "+anim.getName());
		anim.eat();
		anim.sleep();
		Bird bird = new Bird();
		bird.setName("阿賢");
		System.out.println("子類別  Bird name "+bird.getName());
		bird.eat();
		bird.sleep();
		bird.flying();
	}
	@Test
	public void extendsTest1() {
		A1 a1 = new A1();
		a1.getC().getCity();
		System.out.println(a1);
		
	}
	@Test
	public void extendsTest2() {
		A1 a1 = new A1();
		a1.setC(new C());
		C c = a1.getC();
		c.setCity("qqqq");
		String city = c.getCity();
		System.out.println(city);
	}
	@Test
	public void extendsTest3() {
		C c= new C("AAA","BBB","CCC");
		A1 a1 = new A1();
		a1.setC(c);
		a1.setAddress("DDD");
		System.out.println("====");
		System.out.println("city " + a1.getC().getCity());
		System.out.println("country " + a1.getC().getCounty());
		System.out.println("state " + a1.getC().getState());
		System.out.println("Address " + a1.getAddress());
	}
	@Test
	public void extendsTest4() {
		Animal anim = new Animal();
		anim.eat();
		Bird bird = new Bird();
		bird.eat();
		Cat cat = new Cat();
		cat.eat();
		System.out.println("====");
		Animal animm = new Animal();
		animm.eat();
		Bird birdd = new Bird();
		birdd.eat();
		Cat catt = new Cat();
		catt.eat();	
	}


@Test
public void interfaceTest() {
	Car car = new Car();
	car.run();
	Dog dog = new Dog();
	dog.run();
}
@Test
public void interfaceTest1() {
	Car car = new Car();
	car.run();
	Dog dog = new Dog();
	dog.run();
}
}
