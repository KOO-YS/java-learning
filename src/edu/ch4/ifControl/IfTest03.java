package edu.ch4.ifControl;

import java.util.Scanner;

public class IfTest03 {
	public static void main(String[] args) {
		/* 
		 * 	if (조건식1){
		 * 		실행문1
		 * 	} else if(조건식2){
		 * 		실행문2
		 * 	} else (조건식3){
		 * 		실행문3
		 * 	}
		 * */
		
	}
	
	Scanner input = new Scanner(System.in);

	public void test() {
		int i =10;
		int j =20;
		if(i>j) {
			System.out.println("i>j");
		}else if (i ==j) {
			System.out.println("i==j");
		}else {
			System.out.println("i<j");
		}
	}
	public void testIfElseIf() {
		// 점수하나를 입력받아서 등급을 나눠 점수와 등급을 출력
		System.out.println("점수 입력 : ");
		int num = input.nextInt();
		char grade = ' ';
		if(num>=90) {
			grade ='A';
		}else if(num>=80) {
			grade = 'B';
		}else if(num>=70) {
			grade = 'C';
		}else if(num>=60) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		System.out.println("grade: "+grade+"\nscore: "+num);
	}
	public void testIfElseIf2() {
		System.out.println("점수 입력 : ");
		int num = input.nextInt();
		String grade = "";
		if(num>=90) {
			grade ="A";
			if(num>=95) {
				grade += "+";
			}
		}else if(num>=80) {
			grade = "B";
			if(num>=85) {
				grade += "+";
			}
		}else if(num>=70) {
			grade = "C";
			if(num>=75) {
				grade += "+";
			}
		}else if(num>=60) {
			grade = "D";
			if(num>=65) {
				grade += "+";
			}
		}else {
			grade = "F";
		}
		System.out.println("grade: "+grade+"\nscore: "+num);
	}
}
