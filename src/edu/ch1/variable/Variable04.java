package edu.ch1.variable;

public class Variable04 {
	public static void main(String[] args) {
		// 상수
		int age;
		final int AGE;
		
		//초기화
		age=20;
		AGE=20;
		
		System.out.println("age: "+age);
		System.out.println("AGE: "+AGE);
		
		// 값을 변경
		age =30;
		/* AGE=30; */
		
		System.out.println("변경 후 age: "+age);
		System.out.println("변경 후 AGE: "+AGE);
	}
}
