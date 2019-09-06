package edu.ch13.poly.example4;

public class Cat extends Animal{
	@Override
	public void bark() {
		System.out.println("야옹");
	}

	@Override
	public void eat(String feed) {
		super.eat(feed);	// 재정의
	}
}
