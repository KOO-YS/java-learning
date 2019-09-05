package edu.ch10.object.method;

public class Overloading {
	public int test() {
		return 0;
	}
	public int test(int a) {
		return 0;
	}

	/* 리턴타입은 오버로딩에 적용되지 않는다 */
//	public void test(int a){
//		ERROR : 리턴타입 void 타입으로 변경		
//	}
	public int test(int a, String s) {
		return 0;
	}
	public int test(int a, int b) {
		return 0;
	}
//	ERROR : 매개변수명 상관없이 자료형의 갯수와 순서가 다르게 작성되어야한다
//	public int test(int b, int a) {
//		return 0;
//	}
	/* 접근제한자는 오버로딩에 적용되지 않는다 */
//	private int test(int a){
//		ERROR : 접근제한자 private로 변경
//	}
}
