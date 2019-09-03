package edu.ch10.object.constructor;

import java.util.Date;

public class Run {
	public static void main(String[] args) {
		// 기본 생성자 사용
		User u1 = new User();
		System.out.println(u1.toString());
		// 매개변수 생성자 
		User u2 = new User("user01","1234","Kim");
		System.out.println(u2.toString());
		
		User u3 = new User("user2","5678","Lee", new Date());
		System.out.println(u3.toString());
	}
}