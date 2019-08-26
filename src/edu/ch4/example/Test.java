package edu.ch4.example;

import java.util.Scanner;

public class Test {
	Scanner input = new Scanner(System.in);
	public void test01(int num){
//		System.out.print("input number: ");
//		num = input.nextInt();
		if(num%5==0) {
			System.out.println("5의 배수입니다.");
		}else {
			System.out.println("5의 배수가 아닙니다");
		}
		
	}
	public void test02(int num) {
		if(num%2==0 && num%3==0) {
			System.out.println("2와 3의 배수");
		}else {
			System.out.println("2와 3의 배수가 아닙니다.");
		}
	}
	public void test03(char ch) {
//		if(ch>='a') {
//			System.out.println("Small letter");
//		}else {
//			System.out.println("Capital letter");
//		}
		if(Character.isLowerCase(ch)) {
			System.out.println("Small letter");
		}else {
			System.out.println("Capital letter");
		}
	}
	public void test04() {
		System.out.print("두자리 정수를 입력하세요(10~99)");
		int num = input.nextInt();
		if(num>=10 && num<100) {
			if((num/10)==(num%10)) {
				System.out.println(num+"은 10의 자리와 1의 자리가 같습니다.");
			} else {
				System.out.println(num+"은 10의 자리와 1의 자리가 같지 않습니다.");
			}
		}else {
			System.out.println("범위에 맞지않습니다 다시입력하세요");
			test04();
		}
	}
	public void test05() {
		System.out.print("korean : ");
		int kr = input.nextInt();
		System.out.print("english : ");
		int en = input.nextInt();
		System.out.print("math : ");
		int mt = input.nextInt();
		
		int avg = (kr+en+mt)/3;
		String res = "";
		if(avg>=50) {
			if(kr>=35 && en>=35 && mt>=35) {
				res = "합격입니다.";
			}
			else {
				if(kr<35) {
					res += "국어 ";
				}
				if (en<35){
					res += "영어 ";
				}
				if (mt<35){
					res +="수학 ";
				}
				res += "과락으로 불합격입니다.";
			}
		}else {
			res = "평균점수 미달로 불합격입니다.";
		}
		System.out.println(res);
	}
	
	public void test06() {
		System.out.print("주민번호 입력(-제외): ");
		String num = input.nextLine();
		char city = num.charAt(7);
		if(city == '0') {
			System.out.println("서울");
		}else if(city == '1') {
			System.out.println("경기, 인천");
		}else if(city == '2') {
			System.out.println("강원");
		}else if(city == '3') {
			System.out.println("충북");
		}else if(city == '4') {
			System.out.println("충남, 대전");
		}else if(city == '5') {
			System.out.println("전북");
		}else if(city == '6') {
			System.out.println("전남, 광주");
		}else if(city == '7') {
			System.out.println("경북, 대구");
		}else if(city == '8') {
			System.out.println("경남, 부산");
		}else if(city == '9') {
			System.out.println("제주");
		}
	}
}
