package edu.ch16.io.fileStream.run;

import edu.ch16.io.fileStream.model.dao.TestObjectIO;

public class Run {
	public static void main(String[] args) {
		TestObjectIO to = new TestObjectIO();
		to.fileSave();
		/*
		 * Serializable의 시리얼 넘버가 없는 파일을 저장 
		 * 그 뒤에 변경하고 파일을 인식하면 같은 파일로서 인식 불가
		 *  Member 클래스에 시리얼 넘버 추가 후, 다시 파일을 변경하고 fileOpen을 하면
		 *  제대로 객체를 인식한다
		 */
		to.fileOpen();
	}
}
