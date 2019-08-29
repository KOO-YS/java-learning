package edu.ch8.array;

public class MainArgumentTest2 {
	public static void main(String[] args) {
		// 이름 성별 나이 키 몸무게를 입력받아서 출력해보자
		String name = args[0];
		char gender = args[1].charAt(0);
		// parsing 기본자료형으로 변형하는 것
		int age = Integer.parseInt(args[2]);
		double height = Double.parseDouble(args[3]);
		double weight = Double.parseDouble(args[4]);
		
		System.out.println("name : "+name);
		System.out.println("gender : "+gender);
		System.out.println("age : "+age);
		System.out.println("height : "+height);
		System.out.println("weight : "+weight);
	}
}
