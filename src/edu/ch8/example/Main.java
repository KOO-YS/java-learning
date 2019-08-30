package edu.ch8.example;

public class Main {
	public static void main(String[] args) {
		/* char 배열 출력 */
		int[] test1 = {1,2,4,5,6};
		char[] test2 = {'a','s','d'};
		
		System.out.println(test1);
		/*  char 타입 배열은 반복문을 사용하지 않고도 
		 * print, println으로 배열에 저장된 문자를 출력할 수 있다 */
		
		ArraySample as = new ArraySample();
		as.test1();
		
		as.test5();
	}
}
