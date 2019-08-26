package edu.ch6.whileState;

public class WhileTest03 {
	public static void prn01() {
		int i=100;
		while(i>0) {
			System.out.println(i);
			i--;
		}
	}
	public static void prn02() {
		int i = 1;
		while (i<=100) {
			if(i%2==0) {
				System.out.println(i);
				i++;
			}
		}
	}
	public static void prn03() {
		int count=0;
		int sum =0;
		int i=1;
		while (i<=100) {
			if(i%7==0) {
				System.out.println(i);
				count++;
				sum += i;
			}
			i++;
		}
		System.out.println("count :"+count);
		System.out.println("sum :"+sum);
	}
}
