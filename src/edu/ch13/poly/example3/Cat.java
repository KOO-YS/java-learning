package edu.ch13.poly.example3;

public class Cat implements Animal {
	/* 추상메소드처럼 인터페이스 상속 메소드도 ERROR 발생
	 * -> 오버라이딩 해준다 (인터페이스는 전체가 추상메소드이기에 전제 다 구현해줘야함)
	 * The type Cat must implement the inherited abstract method Animal.eat(String)
	 */
	@Override
	public void bark() {
		System.out.println("야옹");
	}

	@Override
	public void eat(String feed) {
		System.out.println(feed+"먹는다");
	}

}
