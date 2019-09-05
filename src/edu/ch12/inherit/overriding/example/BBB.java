package edu.ch12.inherit.overriding.example;

public class BBB extends AAA{
	private int b;

	public BBB() {
//		super();
		System.out.println("BBB 생성");
	}
	public BBB(int b) {
		super(b);
		this.b = b;
		System.out.println("BBB(b) 조상클래스 abc에도 b 입력");
	}
	public BBB(int abc, int b) {
		super(abc);
		this.b = b;
		System.out.println("BBB(abc,b) 메서드 생성");
	}
	
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getSum() {
		int sum = super.getAbc() + this.b;
		return sum;
	}
	@Override		// 재정의  	<-> overroad : 재사용
	public void prn() {
		super.prn();
		System.out.println("BBB.prn");
	}
	
}
