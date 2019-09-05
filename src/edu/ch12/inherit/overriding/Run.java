package edu.ch12.inherit.overriding;

public class Run {
	public static void main(String[] args) {
		Book b1 = new Book("이름", "작가", 10000);
		Book b2 = new Book("수학의 정석","나수학", 100);
		
		System.out.println("b1.toString :: "+b1.toString());
		System.out.println("b2.toString :: "+b2.toString());
		
		System.out.println("b1 :: "+b1);	//변수명만 적어도 toString 값과 같게 나온다  **toString 정리 필요 **
		System.out.println("b2 :: "+b2);
		
		System.out.println("=======equals=======");
		System.out.println("A".contentEquals("A"));
		System.out.println(b1.equals(b2));
		
		Book b3 = b1;
		System.out.println(b1.equals(b3));	// 같은 주소값을 넣어주었기 때문에 true

		Book b4 = new Book("수학의 정석","나수학", 100);
		System.out.println("오버라이딩된 equals 사용 : "+b4.equals(b2));	
		// 원래 equals : 다른 주소값을 가진 각각의 객체이다
		// overriding equals : 동등성을 비교
		
		/* equals ::: boolean java.lang.Object.equals(Object obj) -> '객체' 주소값을 비교해서 T/F
		 * contentEquals ::: boolean java.lang.String.contentEquals(CharSequence cs)
		 *  				-> '문자열'을 비교해서 T/F
		 *  */
		
		System.out.println("===hashCode===");
		System.out.println("b2.hashCode ::"+b2.hashCode());
		System.out.println("b2.hashCode ::"+b2.hashCode());

	}
}
