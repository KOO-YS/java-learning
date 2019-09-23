package edu.ch15.exception.customEx;

public class MyException extends Exception {
	// 예외 클래스 -> Exception을 상속
	public MyException() {
		System.out.println("내가 만든 예외 클래스");
	}
	public MyException(String str) {
		super(str);
	}

}
