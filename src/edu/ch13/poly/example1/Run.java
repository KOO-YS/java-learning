package edu.ch13.poly.example1;

public class Run {
	public static void main(String[] args) {
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		cat.bark();
		dog.bark();
		
		cat.eat("참치");
		dog.eat("뼈다귀");
	}
}
