package edu.ch13.poly.example4;

public class Dog extends Animal{

	@Override
	public void bark() {
		System.out.println("멍멍");
	}

//	@Override			상속된 메소드(추상X 일반O)를 그대로 들고올거라면 오버라이딩 필요없음
//	public void eat(String feed) {
//		super.eat(feed);
//	}
	public void bite() {
		System.out.println("와앙");
	}

}
