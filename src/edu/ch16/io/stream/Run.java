package edu.ch16.io.stream;

public class Run {
	public static void main(String[] args) {
		TestStreamChange tsc = new TestStreamChange();
//		tsc.input();
//		tsc.output();
		TestBufferStream tbs = new TestBufferStream();
//		tbs.outputBuffer();
//		tbs.inputBuffer();
		TestDataTypeStream tdts = new TestDataTypeStream();
//		tdts.test();
		FileIOTest io = new FileIOTest();
//		io.fileRead();
		io.fileSave();
		
	}
}
