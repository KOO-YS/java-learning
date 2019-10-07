package edu.ch17.collection.set;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {
	public static void main(String[] args) {
		new HashSetTest().testHashSet();
	}
	public void testHashSet() {
		// HashSet
		HashSet hs = new HashSet();
		
		// 다형성이 적용된다
		Set set = new HashSet();
		
		hs.add(new String("java"));
		hs.add(new Integer(123));
		hs.add(new Double(45.67));
		hs.add(new Date());
		
		// hashSet은 저장 순서가 유지되지 않는다
		System.out.println("hashSet : "+hs);
		
		// 중복된 값 무시
		hs.add(new String("java"));
		hs.add(new Integer(123));
		
		System.out.println("hashSet : "+hs);
		
		// 사용자 정의 클래스로 만든 객체를 HashSet에 넣을 수 있다
		HashSet hset = new HashSet();
		hset.add(new Score("name1",99));
		hset.add(new Score("name2",33));
		hset.add(new Score("name3",11));
		
		System.out.println("HashSet :: "+ hset);
		
		// 중복으로 같은 값의 객체를 추가할 수 있다
		/* how? : set은 중복 객체를 추가할 수 없지만
		 * 다른 주소값을 가진 객체들이 동등한(중복된) 값을 가진다면
		 * 중복 객체로 치지 않는다 
		 * -> HashCode 오버라이딩으로 값 비교하면 중복객체를 발견 가능*/
		hset.add(new Score("name1",99));
		
		System.out.println("HashSet :: "+ hset);
		System.out.println("=======================");
		
		// List : 인덱스가 존재하기 때문에 for문을 통해 접근이 가능
		// set 	: 순서 유지가 안되기에 for문으로 접근 불가능
		// 하나씩 접근하는 기능이 따로 없다
		
		/*set 내부 값에 접근하는 방법 */
		// 1. toArray() : 배열로 바꾸고 for문을 통해 접근
		Object[] arr = hs.toArray();
		for(int i=0; i<arr.length; i++) {
			System.out.println(i+" : "+arr[i]);
		}
		
		System.out.println("==========Iterator===========");
		// 2. Iterator() : 목록으로 만들어서 연속 처리
		Iterator it =hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		// 삭제
		hs.clear();
		System.out.println("isEmpty?? ::: "+hs.isEmpty());
		
	}
}

class Score {
	private String name;
	private int score;
	public Score() {}
	
	public Score(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		result = prime * result + score;
//		return result;
//	}
//	
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (!(obj instanceof Score))
//			return false;
//		Score other = (Score) obj;
//		if (name == null) {
//			if (other.name != null)
//				return false;
//		} else if (!name.equals(other.name))
//			return false;
//		if (score != other.score)
//			return false;
//		return true;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Score [name=" + name + ", score=" + score + "]";
	}

	
	
}
