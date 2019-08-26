package edu.ch3.operator;

import java.util.Scanner;

public class Operator05 {
	/*
	 * &&	AND
	 * ||	OR
	 * ~	NOT
	*/	
	public static void main(String[] args) {
		Operator05 op = new Operator05();
		op.opTest1();
	}
	public void opTest1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나 입력: ");
		int num = sc.nextInt();
		
		System.out.println("1부터 100 사이인지 확인 : "+ (num>=1 && num<= 100));
		
		System.out.print("문자 하나 입력 : ");
		char ch = sc.next().charAt(0);
		
		System.out.println("대문자 확인 : "+(ch >= 'A' && ch <='Z'));
		
		System.out.print("프로그램 종료?(y) : ");
		char ch2 = sc.next().charAt(0);
		System.out.println("y인 지 확인: "+(ch2 == 'y'||ch2 == 'Y'));
	}
}
