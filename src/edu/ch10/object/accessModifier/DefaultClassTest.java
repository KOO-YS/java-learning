package edu.ch10.object.accessModifier;
//default class -> default 명시하면 에러
/*public*/ class DefaultClassTest {
	 public void test() {
		// default 클래스는 패키지 외부에서 접근이 불가능
		// 같은 패키지 내부에서 호출 가능
		 System.out.println("default 클래스 내의 test() 호출");
	 }
	 
}