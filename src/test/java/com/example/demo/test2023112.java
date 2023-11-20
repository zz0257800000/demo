package com.example.demo;

import java.util.Random;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class test2023112 {

//	@Test
//	public void loopTest2() {
//		
//		for( int i =1; i <= 9; i++) {
//			for( int j =1; j <= 9; j++) {
//				System.out.printf("%d*%d=%2d   ",i,j,(i*j));
//	}System.out.println("  ");
//			}	
//			
//	
//	}
//	
//	@Test
//	public void loopTest3() {
//		//1-99 區間上限值90  ,下限值1
//		double random = Math.random()*(99-1+1)+1;
//		//20-50 區間上限值50,下限值201
//		double random1 = Math.random()*(50-20+1)+20;
//		
//		System.out.println(random);
//
//		System.out.println(random1);
//
//	}

	@Test
	public void loopTest4() {

		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("輸入號碼:");
			int random = (int) (Math.random() * (98 - 2) + 2);
			System.out.println(random);
			int input = 0;
			int big = 98;
			int small = 2;

			while (input != random) {
				input = scan.nextInt();

				if (input < small || input > big) {
					System.out.println("請猜範圍內");
					continue;
				}
				if (input == random) {
					System.out.println("猜對了");
					break;
				}

				if (input > random) {
					big = input;
					System.out.println("請往下猜");

				}
				if (input < random) {
					small = input;
					System.out.println("請往上猜");

				}

			}
		}

	}

}
