package edu.ch17.collection.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TestGenerics {
	public static void main(String[] args) {
		new TestGenerics().testGenerics3();
	}
	public void testGenerics() {
		List list = new ArrayList();
		list.add(new String("saved"));
		list.add(new Book("sdfsd"));
		list.add(new Student());
		list.add(new Car());
		
		System.out.println("saved Object num: "+list.size());
		System.out.println("list : "+list);
		
		// 저장된 객체를 꺼내서 사용할 때,
		// 제네릭을 사용하지 않는다면?
		// 하나하나 instanceof 연산자를 이용해서 비교
		for(int i=0; i<list.size(); i++) {
			Object obj = list.get(i);
			System.out.println(obj);
			if(obj instanceof Book) {
				((Book)obj).printBook();	// 메소드
			} if(obj instanceof Student) {
				((Student)obj).score();
			} if(obj instanceof Car) {
				((Car)obj).printCar();
			}
		}
	}
	public void testGenerics2() {
		// 제네릭스 기능 : 컬렉션에 저장되는 객체의 자료형에 제한을 거는 기능
		ArrayList<Book> list = new ArrayList();
		
		list.add(new Book());
		list.add(new Book());
		
		for(Book b : list) {	// 제네릭스 사용해서 캐스팅 필요 ㄴㄴ
			b.printBook();
		}
	}
	public void testGenerics3() {
		// map에 제네릭 적용
		HashMap<String , Book> map = new HashMap<>();
		map.put("one", new Book("java"));
		map.put("two", new Book("oracle"));
		// map.put("three", new Student("jdbc")); -> 제네릭에 의해 다른 객체 불가능
		map.put("three", new Book("jdbc"));
		
		System.out.println(map);
	}
}
//한 클래스파일(*.java) 안에는 여러개의 클래스들을 정의할 수 있다.
//접근제한자는 1개의 클래스에만 붙일 수 있다.
class Book{
	private String title;
	public Book() {}
	public Book(String title) {
		this.title = title;
	}
	public void printBook() {
		System.out.println("printBook() call...");
	}
	@Override
	public String toString() {
		return "Book [title=" + title + "]";
	}
	
}
class Student{
	public Student() {}
	public void score() {
		System.out.println("score() call ...");
	}
	@Override
	public String toString() {
		return "student";
	}
	
}
class Car{
	public Car() {}
	public void printCar() {
		System.out.println("printCar() call ...");
	}
	@Override
	public String toString() {
		return "car";
	}
}