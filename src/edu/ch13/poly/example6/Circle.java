package edu.ch13.poly.example6;

import java.util.Scanner;

public class Circle extends AreaImpl{

	@Override
	public void make() {
		Scanner input = new Scanner(System.in);
		System.out.print("반지름 : ");
		int r = input.nextInt();
		
		double res = r*r*Math.PI;
		
		setResult(String.format("%.2f", res));	// String으로 변환
	}
	public void print(){
		System.out.print("원의 ");
		super.print();
	}

}
