package edu.ch17.collection.arrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class ArrayListTest {
	public static void main(String[] args) {
		new ArrayListTest().testSort();
	}
	public void test() {
		// ArrayList 객체를 생성하게 되면 10칸짜리 배열을 생성
		ArrayList alist = new ArrayList();
		
		// 다형성 적용이 가능하다 List -> ArrayList [java.util]
		List list = new ArrayList();
		Collection clist = new ArrayList();
		
		// 저장 순서를 유지한다 (index 사용)
		// 객체만 저장할 수 있다.
		alist.add("apple");
		alist.add(123);		// autoBoxing 처리 (값 -> 객체)
		alist.add(45.67);
		alist.add(new Date());
		
		// toString 메서드가 오버라이딩 되어있다
		System.out.println("alist ::: "+alist);
		
		// 인덱스를 포함하고 있기에 for문 접근 가능
		for(int i=0; i<alist.size(); i++) {	// length() (X)
			// System.out.println(alist[i]); (X)
			System.out.println(i+" : "+alist.get(i));
		}
		
		// 중복 데이터 값 저장 가능 -> 인덱스 기반 구분 가능
		alist.add("apple");
		System.out.println("[ 중복값 가능 ]\nalist : "+alist);
		
		// 원하는 인덱스에 객체 추가
		alist.add(1,"banana");
		System.out.println("[ 특정 인덱스에 객체 추가 ]\nalist : "+alist);
		
		// 삭제
		alist.remove(2);
		System.out.println("[ 삭제 ] \nalist : "+alist);
		
		// 지정한 인덱스에 객체를 수정 -> 기존 인덱스의 값 대신 들어간다
		alist.set(1, new Boolean(true));
		System.out.println("[ 값 변경 ]\nalist :"+alist);
	}
	public void testSort() {
		ArrayList alist = new ArrayList();
		alist.add("apple");
		alist.add("banana");
		alist.add("mango");
		alist.add("orange");
		alist.add("grape");
		
		System.out.println("alist : "+alist);
		
		// 저장순서를 유지하고 있는 ArrayList를 오름차순으로 정렬 메소드
		Collections.sort(alist);
		System.out.println("alist : "+alist);
		
	}
	
	 
}
