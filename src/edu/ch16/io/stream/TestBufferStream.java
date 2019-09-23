package edu.ch16.io.stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestBufferStream {
	/* 메소드명 헷갈림... */
	public void inputBuffer() {
		// try with resources
		try(BufferedReader br = new BufferedReader(new FileReader("example3.txt"))){
			// 반복문을 통해 데이터 전부 가져오기
			String str;
			while((str=br.readLine())!= null) {
				System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void outputBuffer() {
		// try with resources
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("example3.txt"));){
			bw.write("안녕하세요\n");
			bw.write("반갑습니다\n");
			bw.write("안녕하세요\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
