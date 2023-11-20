package com.example.demo;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class RegexoTest {
	@Test
	public void regexoTest() {
		String str = "0912-345-678";
		// String pattern ="\\d\\d\\d\\d-\\d\\d\\d-\\d\\d\\d" ;
		String pattern = "\\d{4}-\\d{3}-\\d{3}";
		// String pattern ="\\d{4}(-\\d{3}){2}" ;
		System.out.println(str.matches(pattern));

	}

	@Test
	public void regexoTest1() {
		// String pattern = "(\\d{2}\\d{8})";
		String pattern0 = "\\(\\d{2}\\)\\d{7}";
		String pattern1 = "\\(\\d{2}\\)\\d{8}";
		String pattern2 = "\\(\\d{2}\\)\\d{8}";

		// String pattern = "\\(\\d{2}\\)\\d{7}||\\(\\d{2}\\)\\d{8})";

		// String patternA = "\\(\\d{2}\\)(\\d{7}||\\d{8})";

		String patternB = "\\(\\d{2}\\)(\\d{7,8})";

		String patternE = "(\\(\\d{2}\\)||\\d{2}-)\\d{7,8}";

		System.out.println("輸入電話號碼");
		System.out.println("(xx)xxxxxxx");
		System.out.println("");

		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		if (input.matches(patternE)) {
			System.out.println(input + "合格式");
		}

	}

	@Test
	public void regexoTest2() {
		Scanner scan = new Scanner(System.in);
		System.out.println("輸入身分證");
		String input = scan.next();

		String pattern = "[A-Za-z][1,2]\\d{8}";
		String pattern1 = "[A-Z&&[^ABDEFH]][1,2]\\d{8}";

		System.out.println(input.matches(pattern));
		System.out.println(input.matches(pattern1));

	}
}
