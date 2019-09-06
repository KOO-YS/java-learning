package edu.ch13.poly.example7;

import java.util.Scanner;


public class Run {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Controller ct = new Controller();
		
		System.out.print("아이디 입력 :");
		String name = input.nextLine();
		ct.startPlay(name);
	}
}
