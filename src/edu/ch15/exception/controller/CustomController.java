package edu.ch15.exception.controller;

import java.util.Scanner;

import edu.ch15.exception.customEx.CustomException;


public class CustomController {
	public CustomController() {}
	
	public void throwEx(){
		Scanner input = new Scanner(System.in);
		System.out.print("영문을 입력하세요(대문자 입력 시 오류) :");

		try {
			findUpper(input.next());
			
		} catch (CustomException e) {
			System.out.println(e.getMessage());
//			return ; 생략 :: 리턴해도 finally가 실행
			System.exit(0); 	// 자바 클래스가 강제 종료
		}finally {
			System.out.println("프로그램 종료");
		}
		
	}
	public void findUpper(String input) throws CustomException{
		for(int i=0; i<input.length(); i++) {
			if(input.charAt(i)>='A' && input.charAt(i)<='Z') {
				throw new CustomException(input.charAt(i));
			}
		}
	}
	
	
	
}
