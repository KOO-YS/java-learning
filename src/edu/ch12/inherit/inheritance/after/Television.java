package edu.ch12.inherit.inheritance.after;

import java.util.Date;

public class Television extends Product{
	/**
	 * Product의 feild
		private String brand;
		private String productNum;
		private String productCode;
		private String productName;
		private int price;
		private Date date;
	 */
	private int inchType;
	
	public Television() {
		// 모든 생성자에는 super() 가 생략되어있다
	}
	// 모든필드를 매개변수로 선언하는 생성자라면 부모필드 초기화 되는 값까지 받는다/
	public Television(String brand, String productNum, String productCode, String productName, int price, Date date, int inchType) {
		super(brand, productNum, productCode, productName, price, date);	// 부모클래스의 매개변수 생성자를 빌려온다
		this.inchType =inchType;
		System.out.println("product를 상속받은  Television 클래스 생성자 호출");
	}
	
	public int getInchType() {
		return inchType;
	}
	public void setInchType(int inchType) {
		this.inchType = inchType;
	}
	public String prn() {
		return super.prn() + ", inchType=" + inchType;
	}
	
}
