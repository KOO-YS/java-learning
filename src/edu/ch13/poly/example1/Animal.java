package edu.ch13.poly.example1;

/*추상 클래스 : 몸체가 없는 메소드를 포함한 클래스 
 * -> 객체생성은 불가능하다*/
public abstract class Animal {
	/* 추상메소드
	 *  -> 지금은 구현부가 없지만 상속받는 class에서 강제 오버라이드 해서 재생성해야함 
	 *  구현하지 않으면 ERROR! */
	public abstract void bark();
	
	public void eat(String feed) {
		System.out.println(feed+" 먹는다");
	}
}
/* 추상 메서드를 사용하는 이유 : 일관된 인터페이스
 * ex) 꼭 필요한 기능을  자손클래스에서 무조건 오버라이딩하도록 하는데
 * 모두가 같은 메서드 명을 가지고 있기에 메소드에 대한 이해도 상승*/


