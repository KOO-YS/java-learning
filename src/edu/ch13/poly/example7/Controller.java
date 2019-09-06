package edu.ch13.poly.example7;

public class Controller {
	public void startPlay(String name) {
		// 플레이어 객체 만들고 사냥 시작
		Player p = new Player(name);
		
		System.out.println(p.getName()+"님 입장");
		
//		Chicken c1 = new Chicken(100, 100, "양념반");
		Animal c1 = new Chicken(100, 100, "양념반");
		
		c1.cry();
//		c1.hitChicken() -> ERROR :: 참조변수가 Animal => animal엔 없고 chicken에만 있는 메소드를 사용할 수 없다
		for (int i = c1.getHp(); i > 0; i-=10) {
			if(c1 instanceof Chicken) {	// 생성자를 chicken을 사용해서 인스턴스를 만들었다면?
				((Chicken)c1).hitChicken();
				System.out.println(c1.getHp());
			}
		}
		p.setExp(p.getExp()+c1.getExp());
		// 현재 플레이어 상태 확인
		System.out.println(p);
		
		Animal t1 = new Tiger(1000, 1000, "호랑이");
		
		t1.cry();
		for (int i = t1.getHp(); i > 0; i-=50) {
			if(t1 instanceof Tiger) {	// 생성자를 chicken을 사용해서 인스턴스를 만들었다면?
				((Tiger)t1).hitTiger();
				System.out.println(t1.getHp());
			}
		}
		p.setExp(p.getExp()+t1.getExp());
		// 현재 플레이어 상태 확인
		System.out.println(p);
	}
}
