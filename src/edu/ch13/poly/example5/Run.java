package edu.ch13.poly.example5;

public class Run {
	public static void main(String[] args) {
		LGTv lg = new LGTv();
		
		System.out.println(lg.volumeUp());
		System.out.println(lg.volumeUp());
		System.out.println(lg.volumeUp());
		
		System.out.println(lg.volumeDown());
		System.out.println(lg.volumeDown());
		System.out.println(lg.volumeDown());
		lg.tvClosed();
		SamsungTv ss = new SamsungTv();
	}
	
}
