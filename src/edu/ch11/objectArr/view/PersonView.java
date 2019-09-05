package edu.ch11.objectArr.view;

import java.util.Scanner;

import edu.ch11.objectArr.controller.PersonController;

public class PersonView {
	public void mainMenu() {
		Scanner input = new Scanner(System.in);
		PersonController pc = new PersonController(); 
		while(true) {
			System.out.println("====MENU====");
			System.out.println("1. 회원 추가");
			System.out.println("2. 회원 전체 조회");
			System.out.println("3. 평균 키 조회");
			System.out.println("4. 회원 이름으로 검색");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 선택 : ");
			int menu = input.nextInt();
			
			switch(menu) {
			case 1:
				pc.insertPerson();
				break;
			case 2:
				pc.printPerson();
				break;
			case 3:
				pc.avgHeight();
				break;
			case 4:
				pc.searchPerson();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다");
				return;
			default:
				System.out.println(" 다른 값을 입력해주세요");
					
			}
		}
		
	}
}
