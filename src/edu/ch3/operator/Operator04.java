package edu.ch3.operator;

public class Operator04 {
	// 관계 연산자 (비교 연산자)
		/*
		 * 	<  
		 * 	> 
		 * 	== 
		 * 	!= 
		 * 	<= 
		 * 	>=
		 * 
		 */
		public static void main(String[] args) {
			opTest();
		}
		public static void opTest() {
			int a = 10, b=20;
			boolean result1, result2, result3;
			
			result1 = (a == b);
			result2 = (a <= b);
			result3 = (a >= b);
			
			System.out.println(result1);
			System.out.println(result2);
			System.out.println(result3);
		}
}
