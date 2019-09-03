package edu.ch10.object.accessModifier;

public class PublicClassTest {
	public void test() {
		// default 클래스는 와 다르게 다른 패키지에서도 호출 가능
		// import 사용해 클래스 위치를 메인함수가 구분 
		System.out.println("public 클래스 내에서 test() 호출");
	}
}
