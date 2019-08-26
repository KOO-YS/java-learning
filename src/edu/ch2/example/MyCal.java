package edu.ch2.example;

public class MyCal {
	//접근제한자 메모리 리턴타입 메소드명 (매개변수)
		public static void sum(int i, int j) {
			// 두 수를 더하는 기능
			int result = i + j;
			System.out.println("i : "+i);
			System.out.println("j : "+j);
			System.out.println("result : "+ result);
		}
		//접근제한자 메모리 리턴타입 메소드명 (매개변수)
		public static int sub(int i, int j) {
			int res =i-j;
			return res;
		}
		public static double mul(double i, double j) {
			double res = i * j;
			return res;
		}
		public static void div(int i, int j) {
			// 나눠서 몫 출력
			int value = i/j;
			System.out.println("몫 : "+value);
			// 나눠서 나머지 출력
			int rest = i%j;
			System.out.println("나머지 : "+rest);
		}
}
