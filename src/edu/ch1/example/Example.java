package edu.ch1.example;

import java.util.Scanner;

public class Example {
Scanner input = new Scanner(System.in);
	
	public void example1() {
		
		System.out.print("첫번째 수를 입력하세요:");
		int first = input.nextInt();
		System.out.print("두번째 수를 입력하세요:");
		int second = input.nextInt();
		
		//합
		System.out.println("합 : "+(first+second));
		//차
		System.out.println("차 : "+(first-second));
		//곱
		System.out.println("곱 : "+(first*second));
		//나누기
		System.out.println("나누기 : "+(first/second));
		//나머지
		System.out.println("나머지 : "+(first%second));
	}
	
	public void example2() {

		System.out.print("키보드 가로 치수를 입력하세요:");
		double width = input.nextDouble();
		System.out.print("키보드 세로 치수를 입력하세요:");
		double height = input.nextDouble();
		
		System.out.println("면적 : "+(width*height));
		System.out.println("둘레 : "+(width*2+height*2));
	}
	
	public void example3() {
		
		System.out.print("문자열을 입력하시오: ");
		String str = input.nextLine();
		
		System.out.println("첫번째 문자: "+str.charAt(0));
		System.out.println("두번째 문자: "+str.charAt(1));
		System.out.println("세번째 문자: "+str.charAt(2));
		
	}

}
