package edu.ch14.basicApi.wrapperClass;

public class Run {
	/* 
	 * WrapperClass 
	 * - 기본타입의 데이터를 객체로 만들고자 할때
	 * 데이터를 객체 형태로 취급을 해야하는 경우가 있을 수도 있다.
	 * wrapper클래스 각각 타입에 해당하는 데이터를 인수받아 해당하는 값을 가지는 객체를 생성 
	 * java.lang 포함
	 * 
	 * 	Boxing : 기본자료형 -> wrapper Class 객체
	 * 	Unboxing : wrapper Class -> 기본 자료형
	 * 	(AutoBoxing, AutoUnboxing)
	 */
	public static void main(String[] args) {
		Integer i = new Integer(10);
		Integer i2 = new Integer(20);
		Double d = new Double(10.0);
		
		System.out.println(i.equals(i2));
		System.out.println(i.compareTo(i2));
		
		// unboxing 
		// wrapper 클래스를 기본 자료형으로
		int pi =i.intValue();
		double pd = d.doubleValue();
		System.out.println(pi);
		System.out.println(pd);
		
		// autoUnboxing
		int a = i;
		int b =12;
		System.out.println(a+b);
		
		//abx() 호출
		abx(a+b);
	}

	public static void abx(Object obj) {
		/* 1. integer로 boxing(autoboxing)
		 * 2. integer class 객체가 -> object
		 */
		System.out.println(obj);
		System.out.println((int)obj);	//auto unboxing
		System.out.println((Integer)obj);
		
	}
	public static void strToPrim() {
		byte b = Byte.parseByte("1");
		short s = Short.parseShort("2");
		int i = Integer.parseInt("3");
		long l = Long.parseLong("4");
		float f = Float.parseFloat("0.1");
		double d = Double.parseDouble("0.2");
		boolean bool = Boolean.parseBoolean("true");
		char c = "abc".charAt(0);
	}
	public static void primToStr() {
		String b = Byte.valueOf((byte)1).toString();
		String s = Short.valueOf((short)2).toString();
		String i = Integer.valueOf(3).toString();
		String l = Long.valueOf(4L).toString();
		String f = Float.valueOf(0.1f).toString();
		String d = Double.valueOf(0.2).toString();
		String bool = Boolean.valueOf(true).toString();
		String ch = Character.valueOf('a').toString();
	}
}
