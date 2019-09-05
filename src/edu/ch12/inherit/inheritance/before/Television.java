package edu.ch12.inherit.inheritance.before;

import java.util.Date;

public class Television {
	private String brand;		// 제조사
	private String productNum;	// 상품번호
	private String productCode;	// 상품 코드
	private String productName;	// 상품명
	private int price;			//가격
	private Date date;			//제조일자
	private int inchType;		//화면크기
	
	public Television() {}
	public Television(String brand, String productNum, String productCode, String productName, int price, Date date, int inchType) {
		this.brand = brand;
		this.productNum = productNum;
		this.productCode = productCode;
		this.productName = productName;
		this.price = price;
		this.date = date;
		this.inchType = inchType;
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getProductNum() {
		return productNum;
	}
	public void setProductNum(String productNum) {
		this.productNum = productNum;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode() {
		this.productCode = productCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName() {
		this.productName = productName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public void prn() {
		System.out.println("Television [brand=" + brand + ", productNum=" + productNum + ", productCode=" + productCode
				+ ", productName=" + productName + ", price=" + price + ", date=" + date + ", inchType=" + inchType
				+ "]");
	}
}
