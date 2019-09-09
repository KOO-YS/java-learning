package edu.ch14.basicApi.example;

import java.util.StringTokenizer;

public class Run2 {
	public static void main(String[] args) {
		// switch 와 stringTokenizer를 활용해서 print 만들기
		String str ="김,11,서울,남";
		StringTokenizer st = new StringTokenizer(str,",");
		int i=0, age =0;
		String name = "", address="";
		char gender=' ';
		
		while(st.hasMoreTokens()) {
			switch (i) {
			case 0: name = st.nextToken(); break;
			case 1: age = Integer.parseInt(st.nextToken()); break;
			case 2: address = st.nextToken(); break;
			case 3: gender=st.nextToken().charAt(0); break;
			}
			i++;
		}
		System.out.println(name);
		System.out.println(age);
		System.out.println(address);
		System.out.println(gender);
	}
}
