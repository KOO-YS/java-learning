package edu.ch14.basicApi.string;

/*
 * API (Application Programming Interface)
 * 
 * 		String  -> immutable(변경 불가능)
 */
public class Run {
	public static void main(String[] args) {
		method2();
	}
	public static void method1() {
		// 1.문자열을 리터럴로 생성
		String str = "abc";
		String str1 = "abc";
		String str2 = "def";
		
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str.hashCode());
		System.out.println(str1.hashCode());
		
		System.out.println("=============================================================");
		
		String str3 =new String("abc");
		String str4 =new String("abc");		// new 연산자를 이용하면 다른 주소값에 할당
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		
		System.out.println(System.identityHashCode(str3)); 	// hashcode 말고 실제 주소값을 알기위해 사용
		System.out.println(System.identityHashCode(str4));
		
		System.out.println(str3 == str4);
		System.out.println(str3.equals(str4));
	}
	
	public static void method2() {
		//charAt(index)
		String str = "abc";
		System.out.println(str.charAt(2));
		// concat() = 합치기
		System.out.println(str.concat("def"));
		// contains() = 포함여부 확인
		System.out.println(str.contains("ac"));
		// equals() = 비교
		System.out.println(str.equals("abc"));
		// length() = 길이
		System.out.println(str.length());
		// split() = 문자 구분
		String str1 = "a,b,c";
		String[] arr = str1.split(",");
		
		for(int i=0; i<arr.length;i++) {
			System.out.println("i: "+arr[i]);
		}
		int[]  iarr = {1,2,3,4,5};
		for(int i: iarr) {
			System.out.println(i);
		}
		// toUpperCase() = 대문자
		System.out.println(str.toUpperCase()); 			//ABC
		System.out.println(str1.substring(2,4));	   //b,
		
		// trim() = 공백 제거 (좌우만)
		String str2 = "		a b c";
		System.out.println(str2.trim());			   // a b c
		
		
	}
}
