package edu.ch16.io.byteStream;

public class Run {
	public static void main(String[] args) {
		TestByteStream tbs = new TestByteStream();
		tbs.fileSave();	// default 경로에 파일이 저장된다.
		tbs.fileOpen2();
	}
}
