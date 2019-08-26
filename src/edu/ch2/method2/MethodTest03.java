package edu.ch2.method2;

import edu.ch2.method.MethodTest01;

public class MethodTest03 {
	//다른 패키지에서 테스트를 해보자
	public static void main(String[] args) {
		// public, protected, defalut, private
		
		MethodTest01.publicMethod();
		/* test.protectedMethod(); */
		/* test.defaultMethod(); */
		/* test.privateMethod(); */
		
		//
		MethodTest01 test = new MethodTest01();
		test.NonStaticMethod();	// public 이기 때문에 접근이 가능한 것!
	}
}
