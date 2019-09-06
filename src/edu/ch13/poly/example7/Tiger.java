package edu.ch13.poly.example7;

public class Tiger extends Animal{
	public Tiger() {}
	public Tiger(int hp, int exp, String kinds) {
		super(hp, exp, kinds);
	}
	@Override
	public void cry(){
		System.out.println();
	}
	public void punch() {
		System.out.println("호랑이가 펀치를 원투!");
	}
	public void hitTiger() {
		System.out.println("으앜(-50hp)");
		super.setHp(super.getHp()-50);
		
		if(super.getHp()<=0) {
			System.out.println("호랑이가 쓰러졌습니다. 경험치가 "+super.getExp()+"만큼 상승합니다.");
		}
	}
}
