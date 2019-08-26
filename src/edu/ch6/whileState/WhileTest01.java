package edu.ch6.whileState;

import java.util.Scanner;

public class WhileTest01 {
	public static void main(String[] args) {
		testWhile4_2();
	}
	public static void testWhile() {
		int i =1;
		while(i<10) {
			System.out.println(i+"번째 반복중...");
			i++;
		}
		System.out.println("while이 종료된 후 i의 값 : "+i);
	}
	public static void testWhile2() {
		// 문자를 입력받아서 인덱스별로 문자를 출력
		Scanner input = new Scanner(System.in);
		System.out.print("문자열 입력: ");
		String str = input.nextLine();
		int index = 0;
		while(index<str.length()) {
			char ch = str.charAt(index);
			System.out.println(ch);
			++index;
		}
	}
	public static void testWhile3() {
		Scanner input = new Scanner(System.in);
		int num =input.nextInt();
		int i =1;
		int sum = 0;
		while(i<=num) {
			sum = sum +i;
			i++;
		}
		System.out.println("1부터 "+num+"까지의 합: "+sum);
	}
	public static void testWhile4() {
		int i =1;
		while(true) {
			System.out.println(i);
			i++;
			if(i ==10) {
//				break;
			}
			
		}
	}
	public static void testWhile4_2() {
		// 키보드로 4를 입력 받을때까지 반복
		// 4입력되면 while 문 종료
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.print("input num : ");
			int num = input.nextInt();
			System.out.println("num ::"+num);
			if(num == 4) {
				System.out.println("system end");
				break;
			}
		}
	}
}
