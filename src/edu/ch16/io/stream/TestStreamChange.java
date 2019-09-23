package edu.ch16.io.stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TestStreamChange {
	/* 기본스트림이 byte단위 스트림이고 
	 * 보조스트림이 char 단위 스트림일 경우에 사용 
	 */
	public void input() {
		// 보조스트림 변수 = new 보조스트림생성자(new 기반스트림(외부자원));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 표준 입출력 (System.in, System.out, System.err )
		// -> console을 이용한 데이터 입출력 (자바가상머신이 처리해줌)
		try {
			System.out.println("문자열 입력 : ");
			String val = br.readLine();
			System.out.println("val : "+val);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void output() {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			bw.write("java programming");
//			bw.flush(); 	//버퍼에 잔류하는 모든 바이트 출력
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
