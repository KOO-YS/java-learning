package edu.ch12.inherit.inheritance.before;

import java.util.Date;

public class Desktop {
	
	private String brand;
	private String productNum;
	private String productCode;
	private String productName;
	private int price;
	private Date date;
	private String cpu;
	private int hdd;
	private int ram;
	private String os;
	private boolean allInOne;
	
	public Desktop() {
		super();
	}
	
	public Desktop(String brand, String productNum, String productCode, String productName, int price, Date date,
			String cpu, int hdd, int ram, String os, boolean allInOne) {
		super();
		this.brand = brand;
		this.productNum = productNum;
		this.productCode = productCode;
		this.productName = productName;
		this.price = price;
		this.date = date;
		this.cpu = cpu;
		this.hdd = hdd;
		this.ram = ram;
		this.os = os;
		this.allInOne = allInOne;
	}
	public void prn() {
		System.out.println("Desktop [brand=" + brand + ", productNum=" + productNum + ", productCode=" + productCode
				+ ", productName=" + productName + ", price=" + price + ", date=" + date + ", cpu=" + cpu + ", hdd="
				+ hdd + ", ram=" + ram + ", os=" + os + ", allInOne=" + allInOne + "]");
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
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public int getHdd() {
		return hdd;
	}
	public void setHdd(int hdd) {
		this.hdd = hdd;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public boolean isAllInOne() {
		return allInOne;
	}
	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	
	
}
