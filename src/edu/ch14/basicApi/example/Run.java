package edu.ch14.basicApi.example;

public class Run {
	public static void main(String[] args) {
		// StringBuilder 의 getChars()
		char[] chArr = {'a','p','i','p','r','a','c'};
		StringBuilder sb = new StringBuilder();
		sb.append("jjjjjjj");
		
		sb.getChars(4, 7, chArr, 4);
		for(char i : chArr) {
			System.out.print(i);
		}
	}
}
