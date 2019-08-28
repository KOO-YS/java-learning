package edu.ch8.array;

public class ArrayTest02 {
	public static void main(String[] args) {
		// 1. a~z까지 배열에 입력
		char[] ch = new char[26];
		for(int i=0; i<ch.length; i++) {
			ch[i] = (char)('a'+i);
		}
		// 2. 입력한 배열 출력
		prn(ch);
		System.out.println();
		// 3.1번에서 만든 배열 거꾸로 출력
		reverse(ch);
		System.out.println();
		// 4. 1번에서 만든 배열을 대문자로 바꾸어 출력
		upper(ch);
	}
	
	public static void prn(char[] ch) {
		for(int i=0; i<ch.length; i++) {
			System.out.print(ch[i]+" ");
			if(i%6==5) {
				System.out.println();
			}
		}
	}
	
	
	public static void reverse(char[] ch) {
//		for(int i=ch.length-1; i>=0; i--) {
//			if((ch.length-1-i)%6==0) {
//				System.out.println();
//			}
//			System.out.print(ch[i]+" ");
//		}
//		System.out.println();
//		
		
		int cnt = 0;
		char re[] = new char[26];
		for(int i=ch.length-1; i>=0; i--) {
			re[cnt] = ch[i];
			cnt++;
		}
		prn(re);
		
	}
	
	public static void upper(char[] ch) {
		char[] Ch = new char[26];
//		for(int i=0; i<ch.length; i++) {
//			Ch[i] = (char)(ch[i]-32);
//			System.out.print(Ch[i]+" ");
//			if(i%6==5) {
//				System.out.println();
//			}
//		}
		for(int i=0; i<ch.length; i++) {
			Ch[i] = (char)(ch[i]-32);
			Ch[i] = Character.toUpperCase(ch[i]);
		}
		prn(Ch);
	}
}
