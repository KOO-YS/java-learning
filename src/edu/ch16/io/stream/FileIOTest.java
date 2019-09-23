package edu.ch16.io.stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileIOTest {
	public void fileRead() {
		BufferedReader br = null;	
		FileReader fr = null;		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("읽을 파일 이름 입력 : ");
			String fileName = br.readLine();
			
			fr = new FileReader(fileName);
			int val;
			StringBuilder sb = new StringBuilder();
			while((val = fr.read()) != -1) {
				sb.append((char)val);
			}
			System.out.println(sb.toString());
			
		} catch (IOException e) {
			System.out.println("잘못 입력");
			e.printStackTrace();
		} finally {
			try {
				fr.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	public void fileSave() {
		BufferedReader br = null;
		FileWriter fw = null;
		
		
	}
}
