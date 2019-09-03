package edu.ch10.object.encapsulation;

public class Main {
	public static void main(String[] args) {
		Account a = new Account();
		// 잔액조회
		a.prnBalance();
		//입금
		a.deposit(1500000);
		a.prnBalance();
		
		a.deposit(100000);
		a.prnBalance();
		
		a.withdraw(32000);
		a.prnBalance();
		
//		인스턴스 변수에 바로 접근이 가능하면?  -> 방지를 위해 캡슐화
//		public 으로 선언된 기능들을 이용해 접근하는 것이 맞고 변수에 바로 접근을 막는다
//		a.balance =0;	-> ERROR : The field Account.balance is not visible
		a.prnBalance();
		
		a.withdraw(500000);
	}
}
