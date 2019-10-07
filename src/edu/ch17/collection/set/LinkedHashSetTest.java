package edu.ch17.collection.set;

import java.util.Date;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHashSetTest {
	public static void main(String[] args) {
		new LinkedHashSetTest().testLinkedHashSet();
	}
	public void testLinkedHashSet() {
		LinkedHashSet set = new LinkedHashSet();
		
		set.add("java");
		set.add(123);
		set.add(45.67);
		set.add(new Date());
		set.add(true);
		
		System.out.println("LinkedHashSet : "+set);
		
		LinkedHashSet set2 = new LinkedHashSet();
		set2.add("1wow");
		set2.add("4kakao");
		set2.add("3sdfsd");
		set2.add(new String("2java"));	// 중복값이 저장되지 않는다	
		set2.add("2java");
		
		System.out.println("LinkedHashSet2 : "+set2);
		
		// 링크드해쉬셋 객체 -> 트리셋
		// 오름차순으로 정렬이 된다. TreeSet은 자동으로 오름차순
		TreeSet tset = new TreeSet(set2);
		System.out.println("LinkedHashSet2 : "+tset);
		
	}
}
