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
		try {
			//	 		보조				기반         (외부 자원)
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("파일명을 입력하세요 : ");
			String fileName = br.readLine();	// 키보드로 입력
			// 파일 생성
			fw = new FileWriter(fileName);
			// 파일 안 내용
			String str = null;
			while(true) {
				System.out.println("파일에 저장할 내용을 입력 : ");
				str = br.readLine();
				if(!str.equals("exit")) {
					fw.write(str);
				} else {
					System.out.println("파일에 성공적으로 저장");
					break;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
	}
}
