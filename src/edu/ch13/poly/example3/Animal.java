package edu.ch13.poly.example3;

/*인터페이스 - 추상클래스 변형체 only 추상메서드& 상수만 사용
 * 메소드의 통일성을 부여하기 위해 추상 메소드만 따로 모아놓은 것*/
public interface Animal {
	public void bark();
	/*(defalut)*/void eat(String feed);
}
