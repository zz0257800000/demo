package com.example.demo;
import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;


@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class DemoApplication {

	public static void main(String[] args) {
//		SpringApplication.run(DemoApplication.class, args);
		
//		System.out.println(x);
//		System.out.println("");
//		System.out.printf("x = %d",x);
//		System.out.println(true);
//		int x = 5;
//		long y ;
//		x = 103;
//		System.out.println(+ x );
//		x = 0b111;
//		System.out.println(+ x );
//		y = 022;
//		System.out.println(+ y );
//		y = 0x2B;
//		System.out.println(+ y );
//		
//		int x = 120;
//		int y = 9000*12;
//		
//		int z = x * 8 *300;
//		int s = z - y;
//		System.out.println(+ s );
//		System.out.println(+ z );
		
//		String x = "x";
//		String y = "y";
//
//	System.out.println(5<4 ? x:y );
		
//		int x,y,value;
//		x= y =10;
//		value = ++x *10;
//	System.out.println(+ value );
//	value = y++ *10;
//	System.out.println(+ value );
//
//	System.out.println("x=" + x + "\ty= " + y );
		Scanner scan = new Scanner(System.in);
		int x,y;
		String str;
		x = scan.nextInt();
		y = scan.nextInt();
		str = scan.next();

	System.out.println(x +"\t" + y + "\t" + str);

		
	}

}
