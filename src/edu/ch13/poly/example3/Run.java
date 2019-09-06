package edu.ch13.poly.example3;

public class Run {
	public static void main(String[] args) {
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		cat.bark();
		cat.eat("참치");
		
		dog.bark();
		dog.eat("뼈다귀");
	}
}
