package edu.ch12.inherit.inheritance.before;

import java.util.Date;

public class Run {
	public static void main(String[] args) {
		Desktop d = new Desktop("삼성","01","S-101","매직스테이션2",2000000,new Date(),"i9",500,32,"window",false);
		Smartphone s = new Smartphone("삼성","02","G-012","갤럭시노트10",1500000,new Date(),"퀄컴",512,16,"android","KT");
		Television t = new Television("삼성","03","T-122","삼성티비",2500000,new Date(),72);
		
		d.prn();
		s.prn();
		t.prn();
	}
}
