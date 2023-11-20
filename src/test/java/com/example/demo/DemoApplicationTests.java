package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void firstTest() {
		int a = 12345678;
		long b = 1233456789125L;
		System.out.println(a);
		System.out.println(b);
		
		String str = "abc";
		System.out.println("str:"+str);

		
	}

}
