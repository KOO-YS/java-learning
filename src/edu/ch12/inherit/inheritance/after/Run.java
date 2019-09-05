package edu.ch12.inherit.inheritance.after;

import java.util.Date;

public class Run {
	public static void main(String[] args) {
		Television t = new Television("삼성", "03", "T-33", "삼성티비", 50000, new Date(),46);
		Desktop d = new Desktop("삼성", "01", "S-12", "매직스테이션", 40000, new Date(), "i9", 16, 32, "window", false);
		Smartphone s = new Smartphone("삼성", "02", "S-12", "갤럭시노트10", 1500000, new Date(), "qualqum", 500, 16, "android", "KT");
		
		System.out.println(t.prn());
		System.out.println(d.prn());
		System.out.println(s.getBrand());
	}
}
