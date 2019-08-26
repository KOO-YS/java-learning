package edu.ch3.operator;

public class Operator07 {
	/*
	 * 	다른 연산자와 대입연산자를 함께 사용 
	 * 	산술 대입 연산자 +=, -=, *=, /=, %=
	 * 	연산속도가 더 빠르다, 메모리에 직접 수행
	 */
	//연산속도가 더 빠르다, 메모리에 직접 수행
	public static void main(String[] args) {
		Operator07.opTest();
	}
	public static void opTest() {
		int num = 12;
		
		System.out.println("num : "+num);
		
		num = num+3;
		System.out.println("1.num : "+num);
		
		num += 3;	
		System.out.println("2.num : "+num);
		
		num -= 5;
		System.out.println("num : "+num);
		
		num *= 2;
		System.out.println("num : "+num);
		
		num /= 2;
		System.out.println("num : "+num);
	}
}
