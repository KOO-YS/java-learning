package edu.ch14.basicApi.example;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Run3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("영어를 입력하세요 (띄어쓰기 포함) : ");
		String str1 = input.nextLine();
		
		StringTokenizer st = new StringTokenizer(str1," ");
		String str2;
		
		
		while(st.hasMoreTokens()) {
			str2 = st.nextToken();
			for(int i=0; i<str2.length(); i++) {
				if(i==0) {
					System.out.print(str2.toUpperCase().charAt(0));
				} else {
					System.out.print(str2.charAt(i));
				}
			}
			System.out.print(" ");
		}
	}
}
