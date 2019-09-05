package edu.ch12.inherit.inheritance.after;

import java.util.Date;

// 1. product 클래스 상속
// 2. 필드추가 -> 공통속성(desktop,smartphone)을 추출해서 정의
public class Computer extends Product {
	private String cpu;
	private int hdd;
	private int ram;
	private String os;
	
	//생성자
	public Computer() {
		//super();
	}
	
	public Computer(String brand, String productNum, String productCode, String productName, int price, Date date,String cpu, int hdd, int ram, String os) {
		super(brand, productNum, productCode, productName, price, date);
		this.cpu = cpu;
		this.hdd = hdd;
		this.ram = ram;
		this.os = os;
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
	public String prn() {
		return super.prn() + "cpu=" + cpu + ", hdd=" + hdd + ", ram=" + ram + ", os=" + os;
	}
}
