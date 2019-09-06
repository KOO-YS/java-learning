package edu.ch13.poly.example6;

import java.util.Scanner;

public class Triangle extends AreaImpl{
	@Override
	public void make() {
//		삼각형의 넓이 구하기
		Scanner input = new Scanner(System.in);
		System.out.print("가로 :");
		int x = input.nextInt();
		System.out.print("세로 :");
		int y = input.nextInt();
		
		int res = x*y/2;
		
		setResult(String.valueOf(res));
	}
	@Override
	public void print() {
		System.out.print("삼각형의 ");
		super.print();
	}
}
