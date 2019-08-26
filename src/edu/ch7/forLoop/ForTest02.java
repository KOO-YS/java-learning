package edu.ch7.forLoop;

import java.util.Scanner;

public class ForTest02 {
	public static void main(String[] args) {
		ForTest02 test = new ForTest02();
		test.testFor4();
	}
	public void testFor1() {
		// 중첩 사용 예시 구구단
		// 단
		for(int dan=2; dan<10; dan++) {
			// 수
			for(int su=1; su<10; su++) {
				System.out.println(dan+"*"+su+"="+dan*su);
			}
			System.out.println();
		}
		
	}
	public void testFor2() {
	// 시계
		for(int hour=0; hour<24; hour++) {
			for(int min=0; min<60; min++) {
				for(int sec=0; sec<60; sec++) {
					System.out.println(hour+"시 "+min+"분 "+sec+"초");
				}
			}
		}
	}
	public void testFor3() {
		Scanner input = new Scanner(System.in);
		System.out.print("출력할 별 수 입력: ");
		int row =input.nextInt();
		
		for(int i=1; i<=row; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void testFor4() {
		/* 
		 	1****
		 	*2***		 	
		 	**3**
		 	***4*
		 	****5
		*/
		for(int i=1; i<=5; i++) {
			// 한줄마다 초기화
			String line ="";
			for(int j=1; j<=5; j++) {
				if(i==j) {
					line += i;
				}else {
					line += "*";
				}
			}
			System.out.println(line);
		}
		
		/* 
		 	1***1
		 	*2*2*		 	
		 	**3**
		 	*4*4*
		 	5***5
	 	*/
		for(int i=1; i<=5; i++) {
			// 한줄마다 초기화
			String line ="";
			for(int j=1; j<=5; j++) {
				if(i==j || i==(6-j)) {
					line+=i;
				}
				else {
					line+="*";
				}
			}
			System.out.println(line);
		}
	}
}
