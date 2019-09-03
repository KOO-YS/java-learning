package edu.ch10.object.encapsulation;

public class Account {
//	 필드
	String name = "Kim";
	String accNo = "010-1234-5678";
	String psw = "qwerty123";
//	접근을 막기위한 private	: 필드 자체에 직접 접근하는 법을 권장하지 않는다. -> 메소드로 접근할 것 
	private int bankCode =22;
	private int balance =0;
//	 생성자 -> 객체를 생성하기 위한 메소드
	public Account() {}	// 기본 메소드
//	 메소드
//	입금을 위한 메소드
	public void deposit(int money) {
		if(money >0) {
			balance += money;
			System.out.println(name+"의 계좌에 "+money+"원이 입금되었습니다.");
		} else {
			System.out.println("입금 금액이 잘못 입력되었습니다");
		}
	}
//	출금을 위한 메소드
	public void withdraw(int money) {
		if(money<balance) {
			balance -= money;
			System.out.println(name+"의 계좌에 "+money+"원이 출금되었습니다.");
		} else {
			System.out.println("금액을 잘못 입력하였습니다.");
		}
	}
//	 잔액을 조회하는 메소드
	public void prnBalance() {
		System.out.println(name+"의 잔액은 "+balance+"원 입니다.");
	}
	
}
