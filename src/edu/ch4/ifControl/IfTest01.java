package edu.ch4.ifControl;

import java.util.Scanner;

public class IfTest01 {
public static void main(String[] args) {
//		IfTest01 test = new IfTest01();
//		test.testIf();
		new IfTest01().testIf(); 
	}
	public void testIf() {
		Scanner input = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = input.nextInt();
		if(num%2==0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
	}
}
