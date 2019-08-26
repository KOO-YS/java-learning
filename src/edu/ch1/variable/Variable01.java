package edu.ch1.variable;

/*
 * 	타입 변수명 = 값
 *	타입: 생성할 변수에 어떤 종류의 값이 들어갈지
 *	변수명 : 변수의 이름
 *	값:data, 변수에 들어갈 데이터	
 */
public class Variable01 {
	int num =10;
	public static void main(String[] args) {
		// 타입 변수명 = data;
		Variable01 test = new Variable01();
		
		test.decVariable();
		test.num = 10;
	}
	public void decVariable() {
		//정수형
		byte bnum;
		short snum;
		int inum;
		long lnum;
		// 실수형
		float fnum;
		double dnum;
		// 논리형
		boolean isTrue;
		// 문자
		char ch;
		// 문자열
		String str;
	/*------------------------------------------------------------------------------*/
		bnum = 1;
		snum = 2;
		inum = 4;
		lnum = 8L;		//L은 필수는 아니지만 표시를 해준다
		
		fnum = 4.0f; 	// float은 경우 f 필수
		dnum = 8.0;		// double은 기본형이기에 d 표시 필요없다
		
		isTrue = true;
		isTrue = false;
		
		ch = 'A';
		str = "A";
		
		System.out.println("bnum의 값:" + bnum);
		System.out.println("snum의 값:" + snum);
		System.out.println("inum의 값:" + inum);
		System.out.println("lnum의 값:" + lnum);
		System.out.println("fnum의 값:" + fnum);
		System.out.println("dnum의 값:" + dnum);
		System.out.println("isTrue의 값:" + isTrue);
		System.out.println("ch의 값:" + ch);
		System.out.println("str의 값:" + str);
	}
	public void initVariable() {
		// 변수 선언과 동시에 초기화
		// 정수형
		byte bnum =1;
		short snum = 2;
		int inum =4;
		long lnum =8L;
		
		// 실수
		float fnum = 4.0f;
		double dnum = 8.0;
		
		// 논리형
		boolean isTrue = true;
		
		// 문자형
		char ch = 'A';
		
		// 문자열
		String str = "A";
		
		System.out.println("bnum의 값 : " + bnum);
		System.out.println("snum의 값 : " + snum);
		System.out.println("inum의 값 : " + inum);
		System.out.println("lnum의 값 : " + lnum);
		System.out.println("fnum의 값 : " + fnum);
		System.out.println("dnum의 값 : "+ dnum);
		System.out.println("isTrue의 값 : "+ isTrue);
		System.out.println("ch의 값 : "+ ch);
		System.out.println("str의 값 : "+ str);
	}
}
