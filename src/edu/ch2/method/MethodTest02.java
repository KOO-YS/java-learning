package edu.ch2.method;

public class MethodTest02 {
	public static void main(String[] args) {
		// method 호출 
		// 1. static method : class.method();
		MethodTest01.publicMethod();
		MethodTest01.protectedMethod();
		MethodTest01.defaultMethod();
		// MethodTest01.privateMethod(); -> 같은 패키지가 아니다 -> error
		
		// 2. non-static method : class 변수명 = new class(); 
		MethodTest01 test = new MethodTest01();
		test.NonStaticMethod();
	}
}
