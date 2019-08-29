package edu.ch8.array;

public class MainArgumentTest3 {
	public static void main(String[] args) {
		// 상품 단가 수량 부가세 
		// 총 가격을 계산 후 출력
		// 총가격 : (단가*수량)+(단가*수량*부가세(0.1))
		String item = args[0];
		int price = Integer.parseInt(args[1]);
		int cnt = Integer.parseInt(args[2]);
		double exv = Double.parseDouble(args[3]);
		
		int total = price*cnt + (int)(price*cnt*exv);
		System.out.println("item : "+item);
		System.out.println("price : "+price);
		System.out.println("cnt : "+cnt);
		System.out.println("extra : "+ exv);
		System.out.println("total :"+total);
		
	}
}
