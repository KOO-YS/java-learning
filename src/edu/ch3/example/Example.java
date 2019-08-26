package edu.ch3.example;

import java.util.Scanner;

public class Example {
	Scanner input = new Scanner(System.in);
	
	public void sample1() {
		System.out.print("Korean : ");
		int kr = input.nextInt();
		System.out.print("English : ");
		int en = input.nextInt();
		System.out.print("Math : ");
		int mt = input.nextInt();
		
		int sum = kr + en + mt;
		double avg = sum/3.0;
		System.out.println("합계점수 : "+sum);
		System.out.println("평균점수 : "+avg);
		
		String str = "";
		str = (kr>=40 && en>=40 && mt>=40 && avg>=60)?("합격"):("불합격");
		
//		if( kr>=40 && en>=40 && mt>=40 && avg>=60) {
//			str = "합격";
//		}else { 
//			str = "불합격";
//		}
		System.out.println(str);
	}
	
	public void sample2() {
		System.out.print("이름 : ");
		String name = input.nextLine();
		System.out.print("학년 : ");
		int grade = input.nextInt();
		System.out.print("반 : ");
		int cs = input.nextInt();
		System.out.print("번호 : ");
		int num = input.nextInt();
		System.out.print("성별(M/F) : ");
		char gender = input.next().charAt(0);
		String gk = (gender == 'M' || gender == 'm')?("남학생"):("여학생");
		System.out.print("성적 :");
		double score = input.nextDouble();
		
		System.out.println(grade+"학년 "+cs+"반 "+num+"번 "+gk+" "+name+"은 성적이 "+score+"이다.");
	}
	public void sample3() {
		System.out.print("숫자 : ");
		int num = input.nextInt();
		String str = (num>0)?("양수"):("양수가 아니다");
		System.out.println(str);
	}
	public void sample4() {
		System.out.print("숫자 : ");
		int num = input.nextInt();
		String str = (num%2==0)?("짝수다"):("홀수다");
		System.out.println(str);
	}
	
	public void extra() {
		int i = 65;
		char ch = 'a';
		double d = 10.0;
		
		// true false 예시 만들어보기
		boolean flag = true;
		// 1
		flag = i>d;
		System.out.println(flag);
		// 2
		flag = (i != ch);
		System.out.println(flag);
		// 3
		flag = (i != d) ;
		System.out.println(flag);
		// 4
		flag = (ch != d);
		System.out.println(flag);
		// 5
		flag = (ch == 97);
		System.out.println(flag);
		// 6
		flag = (d ==10);
		System.out.println(flag);
		// 7
		flag = (i == 65.0);
		System.out.println(flag);
		// 8
		flag = ('a'<'b');
		System.out.println(flag);
		// 9
		flag = (d%2 == 0);
		System.out.println(flag);
		
	}
	
}
