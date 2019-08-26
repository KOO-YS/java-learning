package edu.ch2.method;

public class MethodTest01 {
	public static void main(String[] args) {
		// static 메서드 -> [ static 은 프로그램 구동시 바로 대기 ]
		publicMethod();
		protectedMethod();
		defaultMethod();
		privateMethod();
		
		
		// non-static -> 객체를 통해서 호출 가능 -> [ 객체를 통해 호출시에만 대기상태로 올라옴 ]
		MethodTest01 test = new MethodTest01();
		test.NonStaticMethod();
	}
	// public 접근제한자 : 언제 어디서나 접근, 참조 가능
	public static void publicMethod() {
		System.out.println("public method");
	}
	// protected 접근제한자 : 상속일 경우 상속된 곳	* 상속이 아닌경우 같은 패키지 내에서만  
	protected static void protectedMethod() {
		System.out.println("protected method");
	}
	// defalut 같은 패키지 내에서
	static void defaultMethod() {
		System.out.println("default method");
	}
	// private 현재 같은 "클래스" 내에서만 
	private static void privateMethod() {
		System.out.println("private method");
	}
	public void NonStaticMethod() {
		System.out.println("non static method");
	}
}
