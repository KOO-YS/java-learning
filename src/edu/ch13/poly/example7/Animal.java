package edu.ch13.poly.example7;

public class Animal {
	private int hp;
	private int exp;
	private String kinds;
	
	public Animal() {}
	public Animal(int hp, int exp, String kinds) {
		this.hp = hp;
		this.exp = exp;
		this.kinds = kinds;
	}
	public void cry() {
		System.out.println("웁니다 ㅠㅠ");
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public String getKinds() {
		return kinds;
	}
	public void setKinds(String kinds) {
		this.kinds = kinds;
	}
	
}
