package edu.ch3.operator;

import java.util.Scanner;

public class Operator01 {
	public static void main(String[] args) {
		testMethod();
		
	}
	public static void testMethod() {
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		
		System.out.println("입력한 정수가 짝수? "+(num%2==0));
		System.out.println("입력한 정수가 홀수 ?"+!(num%2!=0));
		System.out.println("양수인가?"+(num>0));
		System.out.println("음수인가?"+(num<0));
	}
}
