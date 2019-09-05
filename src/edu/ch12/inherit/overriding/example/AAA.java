package edu.ch12.inherit.overriding.example;

public class AAA {
	private int abc;
	
	public AAA() {
		System.out.println("AAA 생성");
	}
	public AAA(int abc) {
		System.out.println("AAA(abc) 생성");
		this.abc = abc;
	}
	public int getAbc() {
		return abc;
	}
	public void setAbc(int abc) {
		this.abc = abc;
	}
	public void prn() {
		System.out.println("AAA의 prn() method");
	}
}
