package edu.ch14.basicApi.stringBuffer_Builder;

public class Run {
	public static void main(String[] args) {
		method3();
	}
	public static void method1() {
		StringBuilder sb = new StringBuilder("테스트 문장");
		// 기본 16문자 크기로 지정된 버퍼 + 문자열 까지 자동 크기 증가
		System.out.println(sb.capacity());			// 22   -> 16+6
		// 안에 들어간 문자열의 길이
		System.out.println(sb.length());			// 6
		
		StringBuilder sb2 = new StringBuilder(21);
		// 기본적인 크기는 16이지만 생성자에 정수값을 매개변수로 입력하면
		// 정수값으로 크기 지정
		System.out.println(sb2.capacity());			//21
		System.out.println(sb2.length());			//0 
		// -> 크기만 지정해줬을뿐 안에 들어간 내용은 없다
	}
	public static void method2() {
		String str = "test";
		System.out.println("str 기존 : "+str+", 주소 :"+str.hashCode());
		/* console:::: str 기존 : test, 주소 :3556498 */
		
		str += " plus";
		// String 클래스는 수정이 되지않아 새 주소에 새 문자열을 다시 할당한다
		System.out.println("str 추가 : "+str+", 주소 :"+str.hashCode());
		/* console:::: str 추가 : test plus, 주소 :-1238416280 */
		
		StringBuffer sf = new StringBuffer("Hello");
		System.out.println("sf 기존 : "+sf+", 주소 : "+sf.hashCode());
		/* console:::: sf 기존 : Hello, 주소 : 366712642 */
		sf.append(" i'm a StringBuffer");
		System.out.println("sf 추가 : "+sf+", 주소 : "+sf.hashCode());
		/*console:::: sf 추가 : Hello i'm a StringBuffer, 주소 : 366712642*/
		
		System.out.println();
		StringBuilder sb = new StringBuilder("Hii");
		System.out.println("sb 기존 : "+sb+", 주소 : "+sf.hashCode());
		/* console:::: sb 기존 : Hii, 주소 : 366712642 */
		sb.append(" i'm a StringBuilder");
		System.out.println("sb 추가 : "+sb+", 주소 : "+sf.hashCode());
		/* console:::: sb 추가 : Hii i'm a StringBuilder, 주소 : 366712642*/
		
		}
		public static void method3() {
			// StringBuffer와 StringBuilder의 메소드는 동일하다
			
			//Buffer
			StringBuffer sf = new StringBuffer("Hii");
			StringBuilder sf2 = new StringBuilder("Hii");
			
//			sf.append("!!!");
			sf2.append(" there").append("!!!"); 		//method chaining
			
			System.out.println(sf2);
			System.out.println(sf2.capacity());
			System.out.println(sf2.length());
			
			//insert
			sf2.insert(0, ", Hello");		// 0 인덱스로부터 
			System.out.println(sf2);
			sf2.delete(0, 11);
			System.out.println(sf2);
			
			sf2.reverse();
			System.out.println(sf2);
		}
}
