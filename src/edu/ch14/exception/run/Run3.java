package edu.ch14.exception.run;

import java.util.Scanner;

import edu.ch14.exception.customEx.MyException;


public class Run3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("정수 하나 입력: ");
		try {
			checkNum(input.nextInt());
		} catch (MyException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	public static void checkNum(int num) throws MyException {
		if(num<10) {
			MyException m = new MyException(num+"은 10보다 작은 수"); // -> 예외 메세지로 출력된다
			throw m;	// 직접 생성한 예외를 던진다.
			/*[단축 가능] throw new MyException(); */
		} else {
			System.out.println(num+"은 10보다 큰 수");
		}
	}
}
