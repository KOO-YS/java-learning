package edu.ch13.poly.example1;

public class Dog extends Animal {

	@Override
	public void bark() {
		System.out.println("멍멍");
	}
	@Override
	public void eat(String feed) {
		super.eat(feed);
		System.out.println("멍멍");
	}
}
