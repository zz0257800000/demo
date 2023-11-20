package com.example.demo;

import static org.mockito.Mockito.CALLS_REAL_METHODS;

import java.util.ArrayList;
import java.util.Scanner;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.Test;
import org.springframework.util.StringUtils;

import com.example.demo.entity.Dog;

public class StringTest {
	private static final String sys = null;
	@Test
	public void stringTest() {
		
	String str = "ABC";
	String str1 = new String("ABC");
	String str2 = "ABC";
	System.out.println(str ==str1);
	System.out.println(str ==str2);
	System.out.println("==========");
	System.out.println(str.equals(str1));
	System.out.println(str.equals(str2));
	System.out.println("==========");
	String str3 = "aBC";
	System.out.println(str.equals(str3));
	System.out.println(str.equalsIgnoreCase(str3));


	
	}
	@Test
	public void stringTest1() {
		String str = "ABC";
		String str1 = "";
		String str2 = "  ";
		System.out.println(str.length());
		System.out.println("str1 isEmpty"+str1.length());
		System.out.println("str1 isEmpty"+str2.length());
		System.out.println("==========");
		System.out.println("str1 isEmpty :"+str1.isEmpty());
		System.out.println("str2 isEmpty :"+str2.isEmpty());
		//isEmpty():看字串長度是否0
		System.out.println("==========");
		//isBlank():長度0,字串全空白:滿足條件1或2回傳true
		System.out.println("str1 isBlank :"+str1.isBlank());
		System.out.println("str2 isBlank :"+str2.isBlank());

	}
	@Test
	public void stringTest2() {
		Dog dog = new Dog();
		String name = dog.getName();
		String color = dog.getColor();
		System.out.println(name);
		System.out.println(color);
		System.out.println("==========");
		System.out.println(name.length());
		System.out.println(color == null);
		System.out.println("==========");
		if( color == null || color.isBlank()) {
			System.out.println("color是空字串!!");
		}else {
			System.out.println("color不是空字串!!");
		}
		System.out.println("==========");
		System.out.println(StringUtils.hasLength("   "));
		System.out.println(StringUtils.hasText("   "));
		System.out.println("==========");
		color = "";
		if( color.isBlank()) {
			System.out.println("color 沒內容!!");
		}else {
			System.out.println("color 有內容!!");
		}
		System.out.println("==========");

		if( StringUtils.hasText(color)) {
			System.out.println("color 沒內容!!");
		}else {
			System.out.println("color 有內容!!");
		}
		
	}
	@Test
	public void stringTest3() {
		   String str = "神鵰俠侶是楊過與小龍女的故事,不喜歡小龍女,雖然小龍女在楊過眼中是清新脫俗";
		    int index = str.indexOf("小龍女");
		    int count = 0;
		    while (index != -1) { // 当仍然能够找到 "小龍女" 时，继续执行以下操作
		        count++; // 增加计数器，表示找到了一个 "小龍女"
		        index = str.indexOf("小龍女", index + "小龍女".length()); // 找到下一个 "小龍女" 的位置
		    }
		    System.out.println("小龍女 出现的次数为: " + count);
	}
	
	@Test
	public void replaceTest() {
		   String str = "神鵰俠侶是楊過與小龍女的故事,我不喜歡小龍女的甲仙,"
				   +"雖然小龍女在楊過眼中是清新脫俗";
		   str.replace("小龍女", "小龍包");
		   System.out.println(str);
			System.out.println("==========");
			str = str.replaceAll("小龍包", "小龍湯包");
			   System.out.println(str);


		
	}
	@Test
	public void splitTest() {
		String str = "神鵰俠侶是楊過與小龍女的故事,我不喜歡小龍女的甲仙,"
				   +"雖然小龍女在楊過眼中是清新脫俗";
		String[] array = str.split(",");
				
				for(String item : array) {
		System.out.println(item);
	}
	System.out.println("======");
	String str1 = "ABCD";
	String[] array1 = str1.split("");
			for(String item : array1) {
				System.out.println(item);
			}
	}
	
	@Test
	public void trimTest() {
		String str = "ABC DEF";
		String str1 = " ABC DEF";
		System.out.println(str == str1);
		System.out.println(str.equals(str1));
		str = str.trim();
		str1 = str1.trim();
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str == str1);
		System.out.println(str.equals(str1));
		System.out.println("=====");
		str = str.replace("  ", "");
		System.out.println(str);	
	}
	
	@Test
	public void substringTest() {	String str = "神鵰俠侶是楊過與小龍女的故事";
		String substr = str.substring(5);
		String substr1 = str.substring(5,11);
		System.out.println(substr);
		System.out.println(substr1);
	}
	@Test
	public void repalaceTest() {
		
		String str = "ABACADEF";
		int index = str.lastIndexOf("A");
		String lastString = str.substring(index); //adef
		lastString = lastString.replace("A","W"); //wdef
		str = str.substring(0,index) + lastString; //abac+wdef
		System.out.println(str);

	}
	@Test
	public void strBufferTest() {
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入文字");
		String str = scan.next();
		StringBuffer sb = new StringBuffer(str);
		if(str.equals(sb.reverse().toString())){
			System.out.println(str+" 是迴文");
		}else {
			System.out.println(str+" 不是迴文");
		}	
	}
	
	
	@Test
	public void listTest() {
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入文字");
		int inputInt = scan.nextInt();
		inputInt++;
		String str = String.valueOf(inputInt);
		String[] strArray = str.split("");
		System.out.println(new ArrayList<>(Arrays.asList(strArray)));
		
		
	}
	
}


