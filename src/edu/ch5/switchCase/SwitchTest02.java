package edu.ch5.switchCase;

import java.util.Scanner;

public class SwitchTest02 {
	Scanner input = new Scanner(System.in);
	public void test() {
		// 정수 두개와 연산기호 문자 1개입력
		// 연산기호 문자에 해당하는 case 실행해서
		// 결과 출력
		System.out.print("숫자 1 : ");
		int a = input.nextInt(); 
		System.out.print("숫자 2 : ");
		int b = input.nextInt();
		System.out.print("연산 기호 :");
		char op = input.next().charAt(0);
		int res;
		switch(op) {
		case '+':
			res = a+b;
			System.out.println(res);
			break;
		case '-':
			res = a-b;
			System.out.println(res);
			break;
		case '*':
			res = a*b;
			System.out.println(res);
			break;
		case '/':
			res = a/b;
			System.out.println(res);
			break;
		}
		
		
	}
	public void test2() {
		int month = input.nextInt();
		switch(month) {
		
			case 4: case 6: case 9: case 11:
			System.out.println("30");
			break;
			case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
			System.out.println("31");
			break;
			case 2:
			System.out.println("28");
			break;
		}
	}
}
