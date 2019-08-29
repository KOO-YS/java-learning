package edu.ch0.note;

import java.util.Scanner;

public class Study {
	public static void main(String[] args) {
		star();
	}
	public static void star() {
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("숫자를 입력하세요 :: ");
		int num = input.nextInt();
		String line ="";
		System.out.println();
		for(int i=0; i<num; i++) {
			line = "";
			for(int j=0; j<num; j++) {
				if(i==0) {
					line += "@";
				}else if(i==(num-1)) {
					line += "@";
				}else {
					if(j==(num-i-1)) {
						line += "@";
					}else {
						line += " ";
					}
				}
			}
			System.out.println(line);
		}
		
	}
}
