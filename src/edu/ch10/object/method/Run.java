package edu.ch10.object.method;

public class Run {
	public static void main(String[] args) {
		System.out.println("*** non - static ***");
		NonStaticMethodTest test = new NonStaticMethodTest();
		// 매개변수와 반환값이 없는 메소드 호출
		test.method1();
		
		// 매개변수가 없고 반환값이 있는 메소드 호출
		// 리턴타입과 일치하는 자료형의 변수에 반환결과를 담아서 사용
		String msg = test.method2();
		System.out.println(msg);
		
		// 매개변수가 있고 반환값이 없는 메소드  호출
		test.method3(2, 3);

		// 매개변수가 있고 반환값도 있는 메소드 호출
		System.out.println(test.method4(5, 7));
		
		System.out.println("*** static ***");
		StaticMethodTest.staticMethod1();
		System.out.println(StaticMethodTest.staticMethod2());
		StaticMethodTest.staticMethod3("KIM");
		System.out.println(StaticMethodTest.staticMethod4("PARK"));
	}
}
