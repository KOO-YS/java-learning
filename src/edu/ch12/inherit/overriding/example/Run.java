package edu.ch12.inherit.overriding.example;

public class Run {
	public static void main(String[] args) {
		BBB b1 = new BBB();
		b1.setAbc(1); 	// 조상 클래스인 AAA의 메소드
		b1.setB(2);
		System.out.println(b1.getAbc()+" + "+b1.getB()+" = "+b1.getSum());
		System.out.println();
		
		BBB b2 = new BBB(3);
		b2.setB(4);
		System.out.println(b2.getAbc()+" + "+b2.getB()+" = "+b2.getSum());
		System.out.println();
		
		BBB b3 = new BBB(5, 6);
		System.out.println(b3.getAbc()+" + "+b3.getB()+" = "+b3.getSum());
		System.out.println();
		
		System.out.println("BBB prn 호출");
		b1.prn();
		System.out.println();
		
		System.out.println("AAA prn 호출");
		AAA a1 = new AAA();
		a1.prn();
		System.out.println();
		
		System.out.println("AAA객체를 BBB로 생성??? prn 호출");
		AAA a2 = new BBB();	// 객체는 AAA로 분류되지만 BBB 생성자를 사용하여 객체 생성 -> 다형성
		a2.prn();	
	}
}
