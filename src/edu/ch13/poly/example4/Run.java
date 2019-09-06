package edu.ch13.poly.example4;

public class Run {
	public static void main(String[] args) {
		Cat cat = new Cat();
		Dog dog = new Dog();
		Eagle eagle = new Eagle();
		
		cat.bark();
		cat.eat("참치");
		
		dog.bark();
		dog.bite();
		dog.eat("뼈다귀");
		
		eagle.fly();
		eagle.bark();
		eagle.eat("고기");
		
		/* bark() -> Animal 추상 메소드 
		 * 상속받아서 구현
		 * bite() -> dog 추가한 기능
		 * fly() -> Bird 인터페이스에 선언한 추상메소드
		 * eat() -> Animal에 선언한 일반 메소드 */
		
	}
}
