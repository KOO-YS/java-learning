package edu.ch13.poly.example1;

public class Cat extends Animal {

	/* Cat은 Animal의 추상메서드 bark()를 무조건 구현해야한다
	 * The type Cat must implement the inherited abstract method Animal.bark() */
	@Override
	public void bark() {
		System.out.println("야옹");
		
	}
	@Override
	public void eat(String feed) {
		super.eat(feed);
		System.out.println("야옹");
	}
	
}
