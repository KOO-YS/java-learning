package edu.ch10.object.constructor;

public class InitBlock {
	// JVM 기본값
//	private String pName;
//	private int price;
//	private static String brand;
	
	// 명시적 초기화
	private String pName = "kim";
	private int price = 30000;
	private static String brand = "KH";
	// 인스턴스 초기화 블럭
	{
		pName = "Park";
		price = 25000;
		brand = "S_AM";
	}
	static {
//		static 초기화 블럭에서는 nonstatic 필드를 초기화 시킬 수 없다. 
//		-> 초기화 당시에 인스턴스가 생성되어있을거라는 보장이 없다
//		pName = "Lee";		// nonstatic
//		price = 20000;		// nonstatic
		brand = "S_PM";
	}
	
	// 생성자 
	// 기본 생성자 : 선언한 생성자가 아무것도 없을때 JVM이 자동으로 생성해준다
	public InitBlock() {}
	//매개변수 있는 생성자	-> 오버로딩을 이용하여 작성 : 같은 이름의 (다른 타입의)메소드를 여러개 작성 
	public InitBlock(String pName, int price, String brand) {
		this.pName = pName;
		this.price = price;
		InitBlock.brand = brand; 	/*-> 다른 인스턴스의 brand도 바뀜*/
		//this.brand = brand;
	}
	
//	getter(값을 가져온다) && setter(값을 세팅한다)
//	setter : 필드에 변경할 값을 전달 받아서 필드 값을 변경하는 메소드
//	getter : 필드에 기록된 값을 읽어서 요청한 쪽으로 읽은 값을 넘기는 메소드
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	// class변수에 맞춰 메소드도 그대로 static을 붙여준다
	public static String getBrand() {
		return brand;
	}
	public static void setBrand(String brand) {
//		this.brand = brand; -> ERROR : Cannot use this in a static context
		InitBlock.brand = brand;	// className.variable;
	}
	public void prn() {
		System.out.println("InitBlock [pName=" + pName + ", price=" + price + ", brand="+brand+"]");
	}
	
	
	
	
}
