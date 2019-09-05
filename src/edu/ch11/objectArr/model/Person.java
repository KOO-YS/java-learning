package edu.ch11.objectArr.model;

public class Person {
	// 필드
	private String name;
	private int age;
	private int height;
	
	// 생성자
	public Person() {}
	public Person(String name, int age, int height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	public String information() {
		return "Person [name=" + name + ", age=" + age + ", height=" + height + "]";
	}
	
	// getter, setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
}
