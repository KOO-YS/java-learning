package edu.ch1.variable;

import java.util.Scanner;

public class Variable03 {
	public static void main(String[] args) {
		Variable03 test = new Variable03();
		test.changeValue();
	}
	public void changeValue() {
		//변수 선언
		String name;
		char gender;
		int age;
		double height;
		
		// 초기화
		name = "김땡떙";
		gender = 'F';
		age = 22;
		height = 165.4;
		
		System.out.println(name + "님의 개인정보");
		System.out.println("gender : "+gender);
		System.out.println("age : "+ age);
		System.out.println("height : "+height);
		
		// 입력값으로 변경
		Scanner input = new Scanner(System.in);
		System.out.print("이름을 입력하세요: ");
		name = input.nextLine();
		System.out.print("성별을 입력하세요: ");
		gender = input.next().charAt(0);	//char type
		System.out.print("나이를 입력하세요: ");
		age = input.nextInt();
		System.out.print("키를 입력하세요:" );
		height = input.nextDouble();
		
		System.out.println(name + "님의 개인정보");
		System.out.println("gender : "+gender);
		System.out.println("age : "+ age);
		System.out.println("height : "+height);
		
	}
}
