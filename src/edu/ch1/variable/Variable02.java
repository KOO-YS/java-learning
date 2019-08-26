package edu.ch1.variable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Variable02 {
	// java.io 패키지 안의 클래스를 이용하여 키보드 입력 테스트
	
		public static void main(String[] args) {
			Variable02 test = new Variable02();
			test.inputTest1();
		}
		public void inputTest1() {
			//타입변수명 = 데이터
			// 클래스 변수명 = new 클래스();
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("정수 값 하나 입력하세요: ");
			try {
				String value = br.readLine();
				//System.out.println("계산 결과 : "+(value)*3));
				int num = Integer.parseInt(value);
				System.out.println("계산 결과 : "+ num*3);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
		public void inputTest2() {
			Scanner sc = new Scanner(System.in);
			System.out.print("이름: ");
			String name = sc.nextLine();			// 한줄을 읽어온다
			System.out.print("나이: ");
			int age =sc.nextInt();					// 정수값을 읽어온다
			System.out.print("키 소수점 첫째자리까지 :");	
			double height = sc.nextDouble();		// 실수값을 읽어온다
			sc.close();
			System.out.println(name + "은 " + age + "세 이고, 키는 "+height+"cm 이다.");
		}
}
