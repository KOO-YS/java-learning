package edu.ch12.inherit.inheritance.after;

import java.util.Date;

public class Desktop extends Computer{
	private boolean allInOne;
	
	public Desktop() {
		super();
	}
	
	public Desktop(String brand, String productNum, String productCode, String productName, int price, Date date,
			String cpu, int hdd, int ram, String os, boolean allInOne) {
		super(brand, productNum, productCode, productName, price, date, cpu, hdd, ram, os);
		this.allInOne = allInOne;
	}
	
	public boolean isAllInOne() {
		return allInOne;
	}

	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	
	public String prn() {
		return super.prn()+", allInOne :"+allInOne;
	}
	
}
