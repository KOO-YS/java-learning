package edu.ch5.switchCase;

import java.util.Scanner;

public class SwitchTest01 {
	/*
	 * switch(변수) {
	 *  case 1 : 실행문1; break;
	 *  case 2 : 실행문2; break; 
	 *  default : 실행문3; break; }
	 */
	public void test01() {
		int i = 2;
		switch(i) {
		case 1:	
			System.out.println("1 입니다.");
			break;
		case 2: 
			System.out.println("2 입니다.");
			break;
		default:
			System.out.println("다른 숫자임다");
		}
		
	}
	public void test02() {
		char ch = 'b';
		switch(ch) {
		case 'a':
			System.out.println("a");
			break;
		case 'b':
			System.out.println("b");
			break;
		default :
			System.out.println("default");
		}
	}
	public void test03() {
		int num = 4;
		switch(num) {
		case 1: case 3:
			System.out.println("홀수");
			break;
		case 2: case 4:
			System.out.println("짝수");
			break;
		default :
			System.out.println("다른 숫자입니다.");
		}
	}
	public void test04() {
	String str = "";
		switch(str)	{
		case "한국":
			System.out.println("korea");
			break;
		case "미국":
			System.out.println("usa");
			break;
		case "중국":
			System.out.println("china");
			break;
		}
	}
	public void test05() {
		Scanner input = new Scanner(System.in);
		System.out.print("몇월?");
		int mon = input.nextInt();
		switch(mon) {
		case 12: case 1: case 2:
			System.out.println("겨울");
			break;
		case 3: case 4: case 5:
			System.out.println("봄");
			break;
		case 6: case 7: case 8:
			System.out.println("여름");
			break;
		case 9: case 10: case 11:
			System.out.println("가을");
			break;
		default:
			System.out.println("1~12 사이의 값만 입력");
			test05();
			
		}
		
	}
}
