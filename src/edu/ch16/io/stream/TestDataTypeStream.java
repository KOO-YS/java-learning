package edu.ch16.io.stream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TestDataTypeStream {
	// 데이터 자료형별 처리 기능을 가지는 보조스트림
	public void test() {
		try {
			DataOutputStream dout = new DataOutputStream(new FileOutputStream("score.dat"));
			DataInputStream din = new DataInputStream(new FileInputStream("score.dat"));
			
			dout.writeUTF("name1");
			dout.writeInt(95);
			dout.writeChar('A');
			dout.writeUTF("name2");
			dout.writeInt(82);
			dout.writeChar('B');
			dout.writeUTF("name3");
			dout.writeInt(72);
			dout.writeChar('C');
			
			while(true) {
				System.out.println(din.readUTF()+", "+din.readInt()+", "+din.readChar());
			}
		}catch(EOFException e){
			System.out.println("파일 읽기 완료");
//			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
