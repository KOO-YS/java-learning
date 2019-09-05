package edu.ch11.objectArr.run;

import java.util.Scanner;

import edu.ch11.objectArr.model.Book;

public class ObjectArrayTest {
	public static void main(String[] args) {
		// 1. 기본 자료형 배열
//		int[] arr = new int[3];
//		arr[0] = 0;
//		arr[1] = 1;
//		arr[2] = 2;
//		
//		System.out.println(arr);
//		System.out.println(arr[0]);
//		
//		// 2. 객체 배열
//		Book[] bk = new Book[3];
//		
//		// 초기화
//		bk[0] = new Book("자바의 정석","홍길동","나무",30000);
//		bk[1] = new Book("program","HHH","KH",30000);
//		bk[2] = new Book("test","RRR","KH",30000);
//		
		// 선언 및 할당과 동시에 초기화
		Book[] bk = {
					new Book("자바의 정석","홍길동","나무",30000),
					new Book("program","HHH","KH",30000),
					new Book("test","RRR","KH",30000)
				}; // 잊지말고 세미콜론
		
//		System.out.println(bk); 				//=> Book[](참조자료형 == 주소값)
//		// toString을 선언해놓았을때 값이 출력되고, 기본적으로 주소값이 출력된다
//		System.out.println(bk[0]);				//=> Book (참조자료형 == 주소값)
//		System.out.println(bk[0].getTitle()); 	//=> String 기본자료형 == 실제값
		
		System.out.print("도서 갯수 : "+bk.length);
		
		for(int i=0; i<bk.length; i++) {
			System.out.println(bk[i].information());
		}
		// 도서 검색
		Scanner input = new Scanner(System.in);
		System.out.print("검색할 도서 입력 :");
		String findTitle = input.nextLine();
		for(int i=0; i<bk.length; i++) {
			if(bk[i].getTitle().equals(findTitle)) {
				System.out.println(bk[i].information());
			}
		}
	}
}
