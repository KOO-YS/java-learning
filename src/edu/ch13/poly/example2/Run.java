package edu.ch13.poly.example2;

import java.util.Scanner;

/*동적 바인딩 - 실행시 메모리할당을 하면서 메소드를 동적으로 연동하는 방식*/
public class Run {
	public static void main(String[] args) {
		System.out.println("선택[1.고양이 2. 송아지 3.강아지]");
		Scanner input = new Scanner(System.in);
		int no = input.nextInt();
		
		// Base 타입의 레퍼런스 생성
		Base base = null;
		switch (no) {
		case 1:
			base = new Cat();
			break;
		case 2:
			base = new Cow();
			break;
		default:
			base = new Dog();
			break;
		}
		base.start();
		base.stop();
	}
}
