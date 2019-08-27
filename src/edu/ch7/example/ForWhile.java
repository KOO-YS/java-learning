package edu.ch7.example;

import java.util.Scanner;

public class ForWhile {

	Scanner input = new Scanner(System.in);
	
	public void printStar1() {
		System.out.print("정수 하나 입력 : ");
		int num = input.nextInt();
		
		for(int i=1; i<=num; i++) {
			String line = "";
			for(int j=1; j<=i; j++) {
				if(i==j) {
					line += i;
				}else {
					line += "*";
				}
			}
			System.out.println(line);
		}
	}
	
	public void printStar2() {
		System.out.print("정수 입력 : ");
		int num = input.nextInt();
		String line = "";
		if(num>0) {
			for(int i=0; i<num; i++) {
				line ="";
				for(int j=0; j<=i; j++) {
					line+="*";
				}
				System.out.println(line);
			}
		}else if(num<0) {
			for(int i=num; i<0; i++) {
				line="";
				for(int j=0; j>i; j--) {
					line+="*";
				}
				System.out.println(line);
			}
		}else {
			System.out.println("출력 기능이 없습니다.");
		}
	}
	public void selectMenu() {
		//영수증
		String receipt ="\r\n\r\n\r\n* 주문하신 정보는 다음과 같습니다. *\r\n" + 
		"-----------------------------------------------\r\n";				
		char res;		//추가주문 여부
		int total =0;	// 총 가격
		
		do{
			System.out.print("*** 메뉴를 선택하세요 ***\r\n" + 
					"\r\n" + 
					"햄버거 ***************\r\n" + 
					"1. 불고기버거	3500원\r\n" + 
					"2. 치킨버거	3200원\r\n" + 
					"추가 ****************\r\n" + 
					"3. 감자튀김	1000원\r\n" + 
					"4. 치즈스틱	400원\r\n" + 
					"5. 샐러드		2000원\r\n" + 
					"음료수 ***************\r\n" + 
					"6. 콜라		700원\r\n" + 
					"7. 에이드		1200원\r\n" + 
					"8. 커피		1000원\r\n" + 
					"********************\r\n" + 
					"메뉴 선택 :");
			int menu = input.nextInt();
			/* 변수 초기화 */
			String item ="";
			int price=0; 
			switch(menu) {
			case 1:
				item="불고기버거"; price=3500; break;
			case 2:
				item="치킨버거"; price=3200; break;
			case 3:
				item="감자튀김"; price=1000; break;
			case 4:
				item="치즈스틱"; price=400; break;
			case 5:
				item="샐러드"; price=2000; break;
			case 6:
				item="콜라"; price=700; break;
			case 7:
				item="에이드"; price=1200; break;
			case 8:
				item="커피"; price=1000; break;
			}
			System.out.println(item+"을(를) 선택하셨습니다.");
			
			System.out.print("수량은?");
			int count = input.nextInt();
			System.out.println(count+"개 주문하셨습니다.");
			
			receipt += item+" : "+count+"개 - "+price*count+"원\n";
			total += price*count;
			
			System.out.print("추가 주문하시겠습니까?(y/n)");
			res = input.next().charAt(0);
		} while(res=='y'||res=='Y');
		
		receipt += "-----------------------------------------------\r\n";
		receipt += "총 가격 : "+total;
		System.out.println(receipt);
	}
	
	public void countInputCharacter() {
		System.out.print("문자열 입력 : ");
		String sentence = input.nextLine();
		/* 
		 * method matches() 영문자 유효성 검사 
		 *  definition -> https://fruitdev.tistory.com/72
		 */		
		if(sentence.matches("[a-zA-Z]+")) {
			
			System.out.print("문자 입력 : ");
			char ch = input.next().charAt(0);
			
			int count = 0;
			for(int i=0; i<sentence.length(); i++) {
				if(sentence.charAt(i)==ch) {
					count++;
				}
			}	
			System.out.println("포함된 갯수 : "+count+"개");
		}else {
			System.out.println("영문자가 아닙니다.");
		}
	}
	public void exercise1() {
		/*
		  1  2  3  4  5
		  6  7  8  9  10
		  11 12 13 14 15
		  16 17 18 19 20
		  21 22 23 24 25
		  X 값 더하기
		 */
		int sum =0;
		int count = 0;
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				++count;
				if(i==j){
//					System.out.println(i*10+j);
					sum += count;
				}
				else if((i+j)==6) {
//					System.out.println(i*10+j);
					sum += count;
				}
			}
		}
		System.out.println("X자 합: "+sum);
	}
	public void exercise2() {
		/* 숫자 맞추기 : 
		 * 1~100 난수 발생시킨뒤 그 숫자를 맞추기
		 * 입력한 숫자가 난수보다 작으면 "작다", 크면 "크다" 출력
		 * 정답을 맞추게 되면 몇번만에 맞춘건지 출력
		 * 정답입니다. *회만에 정답을 맞추셨습니다.
		*/
		int rand = (int)(Math.random()*100)+1;
		int count=0;
		while(true) {
			System.out.print("정수 입력 : ");
			int num = input.nextInt();
			count++;
			if(num==rand) {
				System.out.println("정답입니다. "+count+"회 만에 정답을 맞추셨습니다.");
				break;
			}else if(num<rand) {
				System.out.println("입력하신 정수보다 큽니다.");
			}else {
				System.out.println("입력하신 정수보다 작습니다.");
			}
			
		}
		
	}
}
