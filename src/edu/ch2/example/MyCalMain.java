package edu.ch2.example;

public class MyCalMain {
	public static void main(String[] args) {
		MyCal.sum(5, 7);
		int sub = MyCal.sub(10, 7);
		System.out.println("sub : "+sub);
		
		double mul = MyCal.mul(5, 7);
		System.out.println("mul : "+mul);
		
		MyCal.div(10, 7);
		
		int a =1;
		int b= 2;
		int c,d =0;
		
		c=(a++)+(++b);
		System.out.println(a+"/"+b+"/"+c+"/"+d);
		d=(c++)+(--a);
		System.out.println(a+"/"+b+"/"+c+"/"+d);
	}
}
