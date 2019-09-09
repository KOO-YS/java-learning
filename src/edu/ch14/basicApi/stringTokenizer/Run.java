package edu.ch14.basicApi.stringTokenizer;

import java.util.StringTokenizer;

public class Run {
	/* StringTokenizer -> java.util에 존재 
	 * split() -> String 클래스 안에 있는 메소드ㅡ
	 *  
	 */
	public static void main(String[] args) {
		method1();
		
	}
	public static void method1() {
		String str = "김,12,서울,11번지";
		StringTokenizer st = new StringTokenizer(str, ",");
		System.out.println(st.countTokens());		// 토큰 수
		while(st.hasMoreTokens()){					// 다음 토큰이 있는지 확인
			System.out.println(st.nextToken());
		}

	}
}
