package edu.ch13.poly.example7;

public class Chicken extends Animal{
	public Chicken() {}
	public Chicken(int hp, int exp, String kinds) {
		super(hp,exp,kinds);
	}
	@Override
	public void cry() {
		System.out.println("꼬끼오");
	}
	public void pick() {
		System.out.println("닭이 쪼았습니다.");
	}
	public void hitChicken() {
		System.out.println("꺆(-10hp)");
		super.setHp(super.getHp()-10);
		
		if(super.getHp()<=0) {
			System.out.println("닭이 쓰러졌습니다. 경험치가 "+super.getExp()+"만큼 상승합니다.");
		}
	}
}
