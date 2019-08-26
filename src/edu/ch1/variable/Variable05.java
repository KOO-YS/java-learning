package edu.ch1.variable;

public class Variable05 {
	public static void main(String[] args) {
		Variable05 test = new Variable05();
		test.testOverflow();
	}
	public void testOverflow() {
		byte bnum =127;
		// overflow [ byte :-128 ~ 0 ~ 127 ]
		bnum =(byte)(bnum+1);
		
		System.out.println("bnum : "+ bnum);
	}
}
