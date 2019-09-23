package edu.ch16.io.charStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestCharStream {
	public void fileSave() {
		FileWriter fw = null;

		try {
			fw = new FileWriter("example2.txt");
			fw.write("fileWriter test");
			fw.write('A');
			fw.write(' ');
			char[] carr = {'a','p','p','l','e'};
			fw.write(carr);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();	// 입출력은 닫아줄 필요가 있다
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void fileOpen() {
		FileReader fr = null;
		try {
			fr = new FileReader("example2.txt");
			
			int val;
			while((val=fr.read()) != -1) {
				System.out.print((char)val+" ");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
