package edu.ch12.inherit.inheritance.after;

import java.util.Date;

public class Smartphone extends Computer{
	private String mobileAgency;


	public Smartphone() {}	//super() 생략해보면?
	public Smartphone(String brand, String productNum, String productCode, String productName, int price, Date date,String cpu, int hdd, int ram, String os,String mobileAgency) {
		super(brand, productNum, productCode, productName, price, date, cpu, hdd, ram, os);
		this.mobileAgency = mobileAgency;
	}
	
	public String getMobileAgency() {
		return mobileAgency;
	}

	public void setMobileAgency(String mobileAgency) {
		this.mobileAgency = mobileAgency;
	}
	public String prn() {
		return super.prn() +", mobileAgency :"+mobileAgency;
	}
	
}
