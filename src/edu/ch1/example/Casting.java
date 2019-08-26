package edu.ch1.example;

import java.util.Scanner;

public class Casting {
	Scanner input = new Scanner(System.in);
	public void printUniCode() {
		System.out.print("Any character: ");
		char ch = input.next().charAt(0);
		System.out.println(ch+" is unicode : "+(int)ch);
	}
	public void calculatorScore() {
		System.out.print("korea is : ");
		double kr = input.nextDouble();
		System.out.print("english is :");
		double en = input.nextDouble();
		System.out.print("math is :");
		double mt = input.nextDouble();
		
		int add = (int)(kr + en + mt);
		int avg = add/3;
		
		System.out.println("총점 : "+add);
		System.out.println("평균 : "+avg);
	}
}
