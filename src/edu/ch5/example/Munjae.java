package edu.ch5.example;

import java.util.Scanner;

public class Munjae {
	Scanner input = new Scanner(System.in);
	public void test1() {
		System.out.print("korean : ");
		int kr = input.nextInt();
		System.out.print("english : ");
		int en = input.nextInt();
		System.out.print("math : ");
		int mt = input.nextInt();
		
		int sum = kr + en + mt;
		int avg = sum/3;
		if(avg>=60) {
			if(kr>=40 && en>=40 && mt>=40) {
				System.out.println("국어 :"+kr+" 영어 : "+en+" 수학: "+mt+"합격");
			}else {
				System.out.println("불합격");
			}
		}else {
			System.out.println("불합격");
		}
	}
	public void test2() {
		System.out.print("*** 초기 메뉴 ***\r\n" + 
				"1. 입력\r\n" + 
				"2. 수정\r\n" + 
				"3. 조회\r\n" + 
				"4. 삭제\r\n" + 
				"7. 종료\r\n" + 
				"메뉴번호 입력 :");
		int num = input.nextInt();
		switch(num) {
		case 1:
			System.out.println("입력 메뉴가 선택되었습니다.");
			break;
		case 2:
			System.out.println("수정 메뉴가 선택되었습니다.");
			break;
		case 3:
			System.out.println("조회 메뉴가 선택되었습니다.");
			break;
		case 4:
			System.out.println("삭제 메누가 선택되었습니다.");
			break;
		case 7:
			System.out.println("프로그램이 종료됩니다.");
			break;
		default:
			System.out.println("번호가 잘못 입력되었습니다.\n다시 입력하십시오");
			test2();
		}
	}
	public void test3() {
		System.out.print("input number");
		int num = input.nextInt();
		if(num > 0) {
			System.out.println("양수다");
		}else {
			System.out.println("양수가 아니다");
		}
	}
	public void test4() {
		System.out.print("input number : ");
		int num = input.nextInt();
		if(num>0) {
			if(num%2==0) {
				System.out.println("짝수다");
			}else {
				System.out.println("홀수다");
			}
		}
	}
	public void inputTest() {
		System.out.print("이름 : ");
		String name = input.nextLine();
		System.out.print("나이 : ");
		int age = input.nextInt();
		System.out.print("키 : ");
		double height = input.nextDouble();
		if(name != null && name.length()>0 && age>0 && height>0) {
			System.out.println("이름 : "+name
							+"나이 : "+age
							+"키 : "+height+"\n"
							+name+"의 나이는 "+age+"세이고, 키는 "+height+"cm이다.");
		}
	}
	
	public void test6() {
		System.out.print("first :");
		int one = input.nextInt();
		System.out.print("second :");
		int two = input.nextInt();
		
		if(one>0 && two>0) {
			System.out.println(one+"+"+two+"="+(one+two));
			System.out.println(one+"-"+two+"="+(one-two));
			System.out.println(one+"*"+two+"="+(one*two));
			System.out.println(one+"/"+two+"="+(one/two));
			System.out.println(one+"%"+two+"="+(one%two));
		}
	}
	public void test7() {
		int num = input.nextInt();
		char ch = ' ';
		if(num>90) {
			ch = 'A';
		}else if(num>80) {
			ch = 'B';
		}else if(num>70) {
			ch = 'C';
		}else if(num>60) {
			ch = 'D';
		}else {
			ch = 'F';
		}
		System.out.println("점수 : "+num +" 학점 : "+ch);
		
		
	}
	
}
