package edu.ch13.poly.example5;

public class LGTv implements Tv{
	private int volume;
	
	public LGTv() {
		System.out.println("엘지 티비가 켜졌습니다");
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public int getVolume() {
		return volume;
	}
	@Override
	public int volumeUp() {
		setVolume(getVolume()+5);
		return getVolume();
	}
	@Override
	public int volumeDown() {
		setVolume(getVolume()-5);
		return getVolume();
	}
	public void tvClosed() {
		System.out.println("엘지 티비가 꺼졌습니다.");
	}
}
