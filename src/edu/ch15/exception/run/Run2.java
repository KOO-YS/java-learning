package edu.ch15.exception.run;

import java.io.IOException;

public class Run2 {
	public static void main(String[] args) throws IOException {	// main은 예외를 JVM으로 던져준다.
		try {
			methodA();
		} catch (Exception e) {
			System.out.println("ddd");
		}
		
	}
	public static void methodA() throws IOException {
		methodB();
	}
	public static void methodB() throws IOException {
		methodC();
	}
	public static void methodC() throws IOException {
		throw new IOException();	// 예외 던져주기
	}
}
