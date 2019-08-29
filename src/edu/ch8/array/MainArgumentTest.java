package edu.ch8.array;

public class MainArgumentTest {
	public static void main(String[] args) {
		// main 의 매개변수 args로 전달되는 데이터를 확인
		// Run As -> Run Configurations -> Arguments [program arguments] 매개변수 입력
		System.out.println("전달받는 데이터 갯수: "+args.length);
		for(int i=0; i<args.length; i++) {
			System.out.println("매개변수 :"+args[i]);
		}
	}
}
