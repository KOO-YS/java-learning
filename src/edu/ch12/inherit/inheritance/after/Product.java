package edu.ch12.inherit.inheritance.after;

import java.util.Date;

public class Product {
	// 부모 클래스
	// 공통적인 요소만 추출
	private String brand;
	private String productNum;
	private String productCode;
	private String productName;
	private int price;
	private Date date;
	
	public Product() {}

	public Product(String brand, String productNum, String productCode, String productName, int price, Date date) {
		super();
		this.brand = brand;
		this.productNum = productNum;
		this.productCode = productCode;
		this.productName = productName;
		this.price = price;
		this.date = date;
		
		System.out.println("Product 매개변수 생성자 호출 완료");
	}
	public String prn() {
		return "brand=" + brand + ", productNum=" + productNum + ", productCode=" + productCode
				+ ", productName=" + productName + ", price=" + price + ", date=" + date;
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

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
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
	
}
