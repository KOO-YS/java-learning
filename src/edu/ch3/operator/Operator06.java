package edu.ch3.operator;

import java.util.Scanner;

public class Operator06 {
	public static void main(String[] args) {
		Operator06 op = new Operator06();
		op.opTest();
	}
	public void opTest() {
		Scanner input = new Scanner(System.in);
		System.out.println("정수 하나 입력 :");
		int num = input.nextInt();
		// 삼항 연산자
		String res = (num>0)?("양수다"):("양수가 아니다");
		// 중첩사용 가능 -> 삼항연산자 안에 또 삼항연산자
		res = (num>0)?("양수다"):((num ==0)?("0이다"):("양수가 아니다"));
		System.out.println(res);
	}
}
