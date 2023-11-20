package com.example.demo;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class ConditionTest {

//	@Test
//	public void ifTest() {
//		int a = 6;
//		if (a > 5) {
//			System.out.println("========");
//
//		} else {
//			System.out.println("-------");
//
//		}
//
//	}
//	@Test
//	public void switchTest() {
//		int a = 95;
//		double b = 95.0/10; //電腦預設i n t 為整數 要+(.0 )才能印出小數
//		System.out.println(b);
//	}
//	@Test
//	public void scannerTest() {
//		Scanner scan = new Scanner(System.in); //可以在Console輸入東西
//		System.out.println("輸入文字:");
//		String a = scan.next();
//		System.out.println("輸入文字是:" + a);
//	}
//	@Test
//	public void scannerTest1() {
//		Scanner scan = new Scanner(System.in); //可以在Console輸入東西
//		System.out.println("輸入文字:");
//		String a = scan.next();
//		String b = scan.next();
//		System.out.println("輸入文字是:"+ a  + b);
//	}
//	@Test
//	public void scannerTest2() {
//		Scanner scan = new Scanner(System.in); //可以在Console輸入東西
//		System.out.println("輸入文字:");
//		String a = scan.nextLine();
//		System.out.println("輸入文字是:" + a);
//	}
//	@Test
//	public void scannerTest3() {
//		Scanner scan = new Scanner(System.in); //可以在Console輸入東西
//		System.out.println("輸入數字:");
//		int a = scan.nextInt();
//		System.out.println("輸入數字是:" + a);
//	}
//	
//	

//	@Test
//	public void switchTest1() {
//	
//		Scanner scan = new Scanner(System.in);
//		System.out.println("輸入成績:");
//		int input = scan.nextInt();
//		switch(input/10) {
//			case 10 :
//				System.out.println("AA");
//					break;
//			case 9 :
//				System.out.println("A");
//					break;
//			case 8 :
//				System.out.println("B");
//					break;
//			case 7 :
//				System.out.println("C");
//					break;
//			case 6 :
//				System.out.println("D");
//					break;
//			case 5 :
//				default:
//				System.out.println("E");
//
//		}
//		
//	}

	@Test
	public void switchTest1() {

		Scanner scan = new Scanner(System.in);
		System.out.println("今天是星期幾:");
		String x = scan.next();
//		int input = scan.nextInt();
		System.out.println("幾天後");
		int y = scan.nextInt();
		int z = 0; 
		switch(x) {
			case "天":
				z = 1 ;
				break;
			case "一":
				z = 2 ;
				break;
			case "二":
				z = 3 ;
				break;
			case "三":
				z = 4 ;
				break;
			case "四":
				z = 5 ;
				break;
			case "五":
				z = 6 ;
				break;
			case "六":
				z = 7 ;
				break;
		
		
		}
		
		switch ((z+ y) % 7) {
		case 1:
			System.out.println("星期日");
			break;
		case 2:
			System.out.println("星期一");
			break;
		case 3:
			System.out.println("星期二");
			break;
		case 4:
			System.out.println("星期三");
			break;
		case 5:
			System.out.println("星期四");
			break;
		case 6:
			System.out.println("星期五");
			break;
		case 7:
		default:
			System.out.println("星期六");

		}
		
	}
}
