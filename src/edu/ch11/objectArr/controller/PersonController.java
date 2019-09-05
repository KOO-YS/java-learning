package edu.ch11.objectArr.controller;

import java.util.Scanner;

import edu.ch11.objectArr.model.Person;

public class PersonController {
	// == 필드 ==
		private Person[] people = new Person[2];
		Scanner input = new Scanner(System.in);
		
		// == 생성자 ==
		public PersonController() {}
		
		// == 메서드 (기능) ==
//		회원 추가
		public void insertPerson() {
			for(int i=0; i<people.length; i++) {
				System.out.println("회원정보 입력");
				System.out.print("이름 : ");
				String name = input.next();
				System.out.print("나이 : ");
				int age = input.nextInt();
				System.out.println("키 : ");
				int height = input.nextInt();
				
				people[i] = new Person(name,age,height);
			}
		}
//		조회
		public void printPerson() {
			for(int i=0; i<people.length; i++) {
				System.out.println(people[i].information());
			}
		}
//		평균 키
		public void avgHeight() {
			int sum =0;
			for(int i=0;i<people.length; i++) {
				sum += people[i].getHeight();
			}
			System.out.println("평균 키: "+(sum/people.length));
		}
//		이름으로 검색
		public void searchPerson() {
			System.out.print("검색할 이름 : ");
			String name = input.next();
			
			for(int i=0; i<people.length; i++) {
				if(people[i].getName().equals(name)) {
					System.out.println(people[i].information());
				} else {
					//System.out.println("검색된 회원이 없습니다.");
				}
			}
		}
}
