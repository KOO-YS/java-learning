package edu.ch10.object.method;

public class NonStaticMethodTest {
	//매개변수, 반환값 유무에 따른 구분
	//1. 매개변수가 없고 반환값이 없는 메소드
	public void method1() {
		System.out.println("매개변수와 반환값 둘다 없는 메소드");
		return;	//생략(JVM이 자동 생성)
	}
	//2. 매개변수가 없고 반환값이 있는 메소드
	public String method2() {
		return "매개변수가 없고 반환값이 있는 메소드";
	}
	//3. 매개변수가 있고 반환값이 없는 메소드
	public void method3(int num1, int num2) {
		// 호출하는 쪽의 괄호 안에 인자로 넘긴 값을 받기위해 선언하는것이 매개변수다
		int sum = num1 + num2;
		System.out.println("method2의 sum : "+sum);
	}
	//4. 매개변수가 있고 반환값이 있는 메소드
	public int method4(int num1, int num2) {
		// return 타입에 맞는 데이터를 넘겨야한다
		return num1+num2;
	}
}