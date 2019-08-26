package edu.ch1.variable;


public class Variable06 {
	public static void main(String[] args) {
		/*
		 * (바꿀자료형)값 or (바꿀자료형)변수 
		 * 형변환 : 자동형변환, 강제형변환(명시적)
		 */
		Variable06 test = new Variable06();
		//test.rule1();
		test.rule3();
	}
	public void rule1() {
		boolean flag = true;
		
		//자동 형변환
		int num = 'A';
		System.out.println("num : "+num);
		
		/* char < int */
		char ch = 97; 
		System.out.println("ch : "+ch);

		//강제 형변환
		char ch2 = (char)num;
		System.out.println("ch2 : "+ch2);
		
		int num2 = -97;
		char ch3 = (char)num2;
		System.out.println("ch3 : "+ch3);
	}
	public void rule2() {
		int inum = 10;
		long lnum = 100L;
		// int isum = inum + lnum; 
		// -> wrong
		long isum = inum + lnum;
		
		int isum2 = (int)(inum + lnum);
		
		int isum3 = inum + (int)lnum;
		
		//byte & short의 연산결과는 무조건 int
		byte bnum =1;
		short snum =2;
		int sno = bnum + snum;
		short ssum = (short)(bnum + snum);
	}
	public void rule3() {
		// 정수 -> 실수 (자동 형변환)
		long lnum = 100;
		float fnum = lnum;	// 자동 형변환
		System.out.println("fnum : "+fnum);
		// 실수 -> 정수 (강제 형변환)
		double dnum = 10.5;
		//int inum =dnum;
	}
	public void dataLoss() {
		double dnum = 1234.567;
		System.out.println("dnum : "+dnum);
		
		int inum = (int)dnum;
		System.out.println("inum : "+ inum);
		System.out.println("dnum : "+dnum);
	}
}
