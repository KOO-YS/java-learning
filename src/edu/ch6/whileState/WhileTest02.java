package edu.ch6.whileState;

import java.util.Scanner;

public class WhileTest02 {
	public static void main(String[] args) {
		testDoWhile2();
	}
	public static void testDoWhile() {
		int i = 1;
		do {
			System.out.println(i);
			i++;
		}while(i<10);
	}
	public static void testDoWhile2() {
		// 키보드로 영어 문자열을 입력받아 출력
		// 단, exit 입력하면 doWhile문 종료
		Scanner input = new Scanner(System.in);
		String str = "";
		do {
			System.out.print("입력 : ");
			str = input.nextLine();
			System.out.println("str : "+str);
			if(!str.equals("exit")) {
				continue;
			}
			System.out.println("end");
			break;
//			if(str.equals("exit")) {
//				break;
//			}
		}while(true);
	}
	
}
