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
	/*  커맨드라인에서 실행방법
	 * https://superblo.tistory.com/entry/%EC%BB%A4%EB%A7%A8%EB%93%9Ccmd%EC%97%90%EC%84%9C-%EC%9E%90%EB%B0%94-%EC%BB%B4%ED%8C%8C%EC%9D%BC%ED%95%98%EA%B8%B0-%EB%B0%8F-%EC%8B%A4%ED%96%89-%EB%B0%A9%EB%B2%952
	 *  
	 *  */
}
