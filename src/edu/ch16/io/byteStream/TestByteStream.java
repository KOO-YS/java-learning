package edu.ch16.io.byteStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestByteStream {
	public void fileSave() {
		// FileOutputStream -> 기반, 바이트 단위, 출력
		FileOutputStream fos = null;
		try {
			// 대상 파일이 존재하지 않으면 자동으로 파일을 만든다
			fos = new FileOutputStream("example1.txt");
			fos.write(97);
			byte[] bar = {98,99,100,101,102,10};
			fos.write(bar);
			fos.write(bar,1,3);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {	// write 입력에 대한 예외
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	public void fileSave2() {
		// try with resources :try()안에 객체 생성
		try (FileOutputStream fos2 = new FileOutputStream("example1.txt")) {
			fos2.write(120);
			byte[] bar = {10,20,30,40,50};
			fos2.write(bar);
		} catch (Exception e) {
			
		}
	}
	public void fileOpen() {
		FileInputStream fin = null;
		try {
			// byte 단위로 데이터를 읽어오는 기반 스트림
			fin = new FileInputStream("example1.txt");
			
			//해당하는 객체의 크기 가져오기 
			// long형으로 반환되기 때문에 int형으로 형변환
			int fileSize = (int)new File("example1.txt").length();
			System.out.println("file size : "+fileSize);
			
			// 저장된 데이터 읽어오기
//			int value = fin.read();
//			System.out.println("saved data : "+value);
			
			// 저장된 '모든' 데이터 읽어오기
			int valueAll =0;
			System.out.println("saved All data : ");
			// 읽어올 데이터가 없을 때 -1을 반환한다
			while( (valueAll = fin.read()) != -1) {	
				//System.out.print((char)valueAll+" ");
				System.out.print(valueAll+" ");
			}
			
			/* 이게 왜 안될까? */
//			while(fin.read() != -1) {
//				System.out.print(fin.read());
//			}
			/* -> 이유: while조건에서 fin.read()를 사용 후 
			 * 다음 fin.read()값을 가져가 print에서 출력한다. 
			 * 1차례씩 건너 뛴 값만 출력된다! */
			
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다.");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void fileOpen2() {
		try(FileInputStream fin = new FileInputStream("example1.txt")){
			int fileSize = (int)new File("example1.txt").length();
			
			byte[] bar = new byte[fileSize];
			fin.read(bar);
			for(int i=0; i<bar.length; i++) {
				System.out.print(bar[i]+" ");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
