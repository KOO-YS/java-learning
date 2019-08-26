package edu.ch3.operator;

public class Operator02 {
	// ++ : 1 증가 ,	 ++값,	값++
		// -- : 1 감소 ,	 --값,	값--
		public static void main(String[] args) {
			Operator02 test = new Operator02();
			test.test2();
		}
		public void test1() {
			int age = 20;
			System.out.println("지금 나이는 ?"+age);
			++age;
			System.out.println("++age 결과 : "+age);
			age++;
			System.out.println("age++ 결과 :"+age);
			--age;
			System.out.println("--age 결과 :"+age);
			age--;
			System.out.println("age-- 결과 :"+age);
		}
		public void test2() {
			//전위 연산자
			int num1 =20;
			int res =num1++*3;
			System.out.println("res :"+res);
			System.out.println("num1 : "+num1);
			
			// 후위 연산자
			int num2 =20;
			int res2 =++num2*3;
			System.out.println("res2 :"+res2);
			System.out.println("num2 : "+num2);
		}
}
