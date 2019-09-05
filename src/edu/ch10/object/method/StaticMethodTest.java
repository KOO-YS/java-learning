package edu.ch10.object.method;

public class StaticMethodTest {
	public static void staticMethod1() {
		int num1 = 10;
		int num2 = 20;
		System.out.println("num1과 num2의 합은 : "+(num1+num2));
		
	}
	public static int staticMethod2() {
		int num1 = 10;
		int num2 = 20;
		return num1+num2;
	}
	public static void staticMethod3(String name) {
		System.out.println(name+"님의 생일을 축하합니다");
	}
	public static String staticMethod4(String name) {
		return name+"님의 생일을 축하합니다";
	}
}
