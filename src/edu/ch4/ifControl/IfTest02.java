package edu.ch4.ifControl;

import java.util.Scanner;

public class IfTest02 {
	Scanner input = new Scanner(System.in);

	public void test() {
		int i = 10;
		if(i>5) {
			System.out.println("크다");
		}else {
			System.out.println("작다");
		}
	}
	public void test2() {
		int num = 0;
		if(num%2==0) {
			System.out.println("짝수");
		}
		else {
			System.out.println("홀수");
		}
	}
	public void testIfElse() {
		// 숫자 하나 입력받아 홀수 짝수인지 출력
		
		int num = input.nextInt();
		if(num%2==0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
	}
	public void testIfElse2() {
		// 50보다 큰 수에서 홀짝
		System.out.print("정수 입력 : ");
		int no = input.nextInt();
		
		if(no>50) {
			if(no%2 ==0) {
				System.out.println("짝수");
			} else {
				System.out.println("홀수");
			}
		}else {
			System.out.println("작다");
		}
	}
	public void testIfElse2_2() {
		// 숫자 입력받아서 양수인지 음수인지 출력
		// 단 0, 입력할 경우 0입니다 출력
		int no = input.nextInt();
		
		if(no>0) {
			System.out.println("양수");
		} else if(no==0) {
			System.out.println("0입니다");
		} else {
			System.out.println("음수");
		}
	}
	public void testIfElse3() {
		// 정수 두개를 키보드로 입력받는다
		// 단 1~100 사이 수
		// 둘중 하나라도 범위에 속하지 않으면 "값은 1~100 사이여야합니다"
		System.out.print("first : ");
		int first = input.nextInt();
		System.out.print("second : ");
		int second = input.nextInt();
		
		if(first>0 && first <= 100) {
			if(second>0 && second <=100) {
				/* System.out.println(first+"/"+second); */
				System.out.println(first+"+"+second+"="+(first+second));
				System.out.println(first+"-"+second+"="+(first-second));
				System.out.println(first+"*"+second+"="+(first*second));
				System.out.println(first+"/"+second+"="+(first/second));
			}else { 
				System.out.println("값은 1~100 사이여야합니다");
			}
		}
		else { 
			System.out.println("값은 1~100 사이여야합니다");
		}
		
	}
}
