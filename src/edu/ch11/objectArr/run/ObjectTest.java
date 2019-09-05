package edu.ch11.objectArr.run;

import java.util.Scanner;

import edu.ch11.objectArr.model.Book;

public class ObjectTest {
	public static void main(String[] args) {
		// 객체로만 실습
		// 객체 배열 사용 X 	->배열을 여러개 사용할 때  번거롭다
		Book bk1 = new Book("자바의 정석","홍길동","나무",30000);
		Book bk2 = new Book("program","HHH","KH",30000);
		Book bk3 = new Book("test","RRR","KH",30000);
		
		System.out.println(bk1.information());
		System.out.println(bk2.information());
		System.out.println(bk3.information());
		
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 책 제목 : ");
		String findTitle = sc.nextLine();
		
		if(bk1.getTitle().equals(findTitle)) {
			System.out.println(bk1.information());
		} else if(bk2.getTitle().equals(findTitle)) {
			System.out.println(bk2.information());
		} else if(bk3.getTitle().equals(findTitle)) {
			System.out.println(bk3.information());
		} else {
			System.out.println("찾으시는 책이 없습니다.");
		}
		
	}
}
