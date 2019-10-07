package edu.ch17.collection.arrayList.example;

import java.util.ArrayList;

public class CustomerManager {
	public static void main(String[] args) {
		new CustomerManager().testArrayListSort();
	}
	public void testArrayListSort() {
		// Customer 객체 생성 후 ArrayList에 담기
		ArrayList list = new ArrayList();
		
		list.add(new Customer("name1", 23, 'F', 1250.5));
		list.add(new Customer("name2", 33, 'M', 4350.5));
		list.add(new Customer("name3", 13, 'M', 2150.5));
		
		// add(Object) -> Object타입으로 리스트에 저장이 되기 때문에
		// 향상된 for문에 Customer을 인덱스로 두면 오류가 뜬다
		for(Object obj : list) {
			System.out.println((Customer)obj);
		}
		// comparator
		// list.sort()
		// Collections.sort(list,Comparator);
		list.sort(new AscendingName());
		System.out.println("::: 이름 오름차순 :::");
		for(Object obj : list) {
			System.out.println((Customer)obj);
		}
		list.sort(new AscendingAge());
		System.out.println("::: 나이 오름차순 :::");
		for(Object obj : list) {
			System.out.println((Customer)obj);
		}
		list.sort(new AscendingPoint());
		System.out.println("::: 포인트 오름차순 :::");
		for(Object obj : list) {
			System.out.println((Customer)obj);
		}
		list.sort(new DescendingName());
		System.out.println("::: 이름 내림차순 :::");
		for(Object obj : list) {
			System.out.println((Customer)obj);
		}
		list.sort(new DescendingAge());
		System.out.println("::: 나이 내림차순 :::");
		for(Object obj : list) {
			System.out.println((Customer)obj);
		}
		list.sort(new DescendingPoint());
		System.out.println("::: 포인트 내림차순 :::");
		for(Object obj : list) {
			System.out.println((Customer)obj);
		}
	}
}
