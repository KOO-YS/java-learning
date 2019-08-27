package edu.ch7.forLoop;

import java.util.Scanner;

public class ForTest01 {
	public static void main(String[] args) {
		ForTest01.testFor5();
	}
	
	public static void testFor() {
		//0~10 출력
		// for(초기식; 조건식; 증감식){}
		for(int i=0; i<=10; i++) {
			System.out.println("i : "+i);
		}
	}
	public static void testFor2() {
		for(int i=10; i>=0; i--) {
			System.out.println("i : "+i);
		}
	}
	public static void testFor2_2() {
		//증감식 -> 반드시 1씩 증감될 필요는 없다
		for(int i=0; i<10; i+=2) {	//2씩 증가
			System.out.println("i : "+i);
		}
		// 조건식은 1개(AND연산 가능)
		// 초기식, 증감식은 1개 이상 가능
		for(int i=0, j=10; i<10 && j>0; i++,j--) {
			System.out.println("i : "+i);
			System.out.println("j : "+j);
		}
	}
	public static void testFor2_3() {
		for(char ch='a'; ch<='z'; ch++) {
			System.out.print(ch);
		}
	}
	public static void testFor2_4() {
		
//		for(int i=1; i<10; i++) {
//			System.out.println("i : "+i);
//		}
		/* 초기식, 조건식, 증감식 을 빈칸으로 두고 실행문 안에서 조건주기 */
		int i=1;
		for(;;) {
			System.out.println("i : "+i);
			i++;
			if(i==10) {
				break;
			}
		}
	}
	public static void testFor3() {
		// 정수하나 키보드로 입력 받고,
		// 그 수가 양수일때만 그 수의 구구단을 출력
		// 양수가 아니면 반드시 1~9사이 양수 입력! 출력
		Scanner input = new Scanner(System.in);
		System.out.print("구구단 몇단?");
		int dan = input.nextInt();
		if(dan>=1 && dan <=9) {
			for(int i=1; i<10; i++) {
				System.out.println(dan+"*"+i+"= "+dan*i);
			}
		}else {
			System.out.println("1~9 사이 양수 입력");
		}
	}
	public static void testFor4() {
		/* Math.random() -> 0~1사이 랜덤값 */
		/* Math.random()*100 -> 0~99.9999999  */
		/* (int)(Math.random()*100) -> 0~99 */
		/* (int)(Math.random()*100)+1 -> 1~100 */
		int rand = (int)(Math.random()*100)+1;
		int sum =0;
		for(int i=0; i<=rand; i++) {
			sum+=i;
		}
		System.out.println(rand+"-> randon value\n"+sum+"-> sum");
	}
	public static void testFor5() {
		// 정수 두개 입력(키보드)
		// 작은 수 ~ 큰수까지의 합
		Scanner input = new Scanner(System.in);
		System.out.print("first :");
		int one = input.nextInt();
		System.out.print("second :");
		int two = input.nextInt();
		
		int sum = 0, max,min;
		if(one>two) {
			max = one;
			min = two;
		}else {
			max = two;
			min = one;
		}
		for(int i=min; i<=max; i++) {
			sum +=i;
		}
		System.out.println("sum from "+min+" to "+max+" :: "+sum);
	}
}
