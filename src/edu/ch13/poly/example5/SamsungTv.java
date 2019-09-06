package edu.ch13.poly.example5;

public class SamsungTv implements Tv{

	private int volume;
	public SamsungTv() {
		super();
		System.out.println("삼성티비가 켜졌습니다");
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	@Override
	public int volumeUp() {
		setVolume(getVolume()+3);
		return getVolume();
	}

	@Override
	public int volumeDown() {
		setVolume(getVolume()-3);
		return getVolume();
	}
	
	public void tvClosed() {
		System.out.println("삼성티비가 꺼졌습니다.");
	}
}
