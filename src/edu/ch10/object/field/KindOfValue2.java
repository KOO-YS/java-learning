package edu.ch10.object.field;

//static 예약어에 대한 구분
public class KindOfValue2 {
	// public 접근제한자에 static, final 키워드와 함께 사용하면 '상수필드'라고 한다
//	public static final int STATIC_NUM; -> 선언 동시에 초기화를 해줘야한다
	
//	전역변수에 static 키워드 사용가능
	public static int staticint;
	
	public static final int STATIC_NUM = 1;
	public final static int STATIC_NUM2 = 1;	// 순서 상관없다
	
	public void methodTest() {
//		static int localStaticNum = 1;
//		nonstatic 메소드는 객체 인스턴스가 만들어져야지 접근이 가능하기 때문에 static 키워드 사용이 불가능하다. -> 순서 X
	}
	
	public static void methodTest2() {
//		static int localStaticnum;
	}
}
