package edu.ch13.poly.example7;

public class Player {
	private String name;
	private int exp = 0;
	
	public Player() {}
	
	public Player(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	@Override
	public String toString() {
		return name +"님의 현재 경험치는 ["+exp+"]입니다.";
	}
}
