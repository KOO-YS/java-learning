package edu.ch10.object.field;

public class KindOfValue {	// 클래스 영역의 시작
//	클래스 영역 안에 작성하는 변수 : 필드 
//	-> 멤버변수(클래스가 가지는 멤버라는 의미) & 전역 변수(클래스 전역에서 사용할 수 있는 변수)	
	private int globalNum;
	
	// 메소드 괄호 안에 선언된 변수 : 매개변수	-> 일종의 지역변수
	public void testMethod(int num) {	// 메소드 영역의 시작
		
		// 메소드 영역안에 작성하는 변수 : 지역변수 
		int localNum;
		System.out.println(num);
//		System.out.println(localNum);	// 지역변수는 초기화가 필요하다 :: 기본값 X
		System.out.println(globalNum);
		
	}	// 메소드 영역의 끝
	
	public void testMethod2() {	// 메소드 영역의 시작
		// 새로운 지역변수를 만들어 접근
		System.out.println(globalNum);
//		System.out.println(localNum);
		// 지역변수는 선언을 한 블럭 안 에서만 사용이 가능하다
	}
}	// 클래스 영역의 끝
