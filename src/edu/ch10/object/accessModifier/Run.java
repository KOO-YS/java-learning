package edu.ch10.object.accessModifier;

public class Run {
	public static void main(String[] args) {
		// default 클래스는 패키지 외부에서 접근이 불가능
		// 
		DefaultClassTest def = new DefaultClassTest();
		def.test();
		
		PublicClassTest e = new PublicClassTest(); 
	}
}
