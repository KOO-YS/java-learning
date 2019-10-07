package edu.ch17.collection.map;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestHashMap {
	public static void main(String[] args) {
		new TestHashMap().testHashMap2();
	}
	public void testHashMap() {
		HashMap map = new HashMap();
		Map map2 = new HashMap();
		
		// key와 value 쌍으로 저장
		// key와 value 둘 다 반드시 객체 Object
		map.put("one", new Date());
		map.put(12, "apple");		// new Integer(12);
		map.put(33, 123);	// autoBoxing (기본자료형 -> wrapper 클래스 객체)
		
		System.out.println("hashMap : "+map);
		
		// 키는 중복이 허용되지 않는다 (Set) :최근 키로 덮어쓰여진다
		map.put(12, "banana");	// apple -> banana
		
		System.out.println("hashMap : "+map);
		
		// 값은 중복이 된다. (list)
		map.put(11, "banana");
		map.put(13, "banana");
		
		System.out.println("hashMap : "+map);
		
		// 값 객체의 내용을 가지고 오고 싶을때
		System.out.println("key 13에 대한 값 : "+map.get(13));
		
		// key 값을 가지고 삭제
		map.remove(13);
		System.out.println("hashMap : "+map);
		
		// 저장된 객체의 수
		System.out.println("저장된 객체의 수 : "+map.size());
	}
	public void testHashMap2() {
		// Map에 저장된 객체 정보를 연속 처리
		Map map = new HashMap();
		map.put("one", "java 8");
		map.put("two", "oracle");
		map.put("three", "eclips");
		map.put("four", "tttt");		
		
		// 1. Keyset()을 이용해서 키만 set으로 리턴
		// iterator()로 키에 대한 목록을 만듦
		
		/* Set keys = map.keySet();		-> key를 set으로 만듦 
		 * Iterator it = keys.iterator(); -> set을 목록으로 만듦
		 */
		
		System.out.println("1.keySet() ============");
		
		Iterator keyit = map.keySet().iterator();
		while(keyit.hasNext()) {
			String key = (String)keyit.next();
			String value = (String)map.get(key);
			System.out.println(key+" = "+value);
		}
		
		// 저장된 value 객체만 values()로 Collection으로 만듦
		System.out.println("2. values() ============");
		Collection values = map.values();
		
		// 2.1 Iterator로 접근
		Iterator valueIt = values.iterator();
		System.out.println("2.1 <Iterator> ============");
		while(valueIt.hasNext()) {
			System.out.println(valueIt.next());
		}
		
		// 2.2 배열로 만들어서 접근
		System.out.println("2.2 <Array> ============");
		Object[] valueArr = values.toArray();	// Collection values를 배열로 변환
		for(int i=0; i<valueArr.length; i++) {
			System.out.println(i+" : "+valueArr[i]);
		}
		
		// 3. Map 내부 클래스인 EntrySet을 이용 : entrySet()
		// A map entry (key-value pair)  : key, value 쌍으로 묶은 것
		System.out.println("3. EntrySet() ===========");
		Set<Map.Entry> set = map.entrySet();
		Iterator<Map.Entry> entryIt = set.iterator();
		while(entryIt.hasNext()) {
			Map.Entry entry = entryIt.next();
			System.out.println(entry.getKey()+" = "+entry.getValue());
		}
		
		
		
	}
}
