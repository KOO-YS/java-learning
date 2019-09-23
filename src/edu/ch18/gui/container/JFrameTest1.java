package edu.ch18.gui.container;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class JFrameTest1 extends JFrame{
	/**
	 * 프레임 생성방법 
	 * 1.JFrame 클래스 상속받아 생성
	 */
	public JFrameTest1() {
		// 프레임 위치 설정
		/* this.setLocation(300, 200); */
		// 프레임 크기 설정
		/* this.setSize(800,500); */
		
		// 위치와 크기를 한번에 지정 가능하다
		this.setBounds(300,200,800,500);
		
		// 프레임 상단 이름 설정
		this.setTitle("FirstFrame");
		
		// 프레임 상단의 기본 자바 파비콘을 다른 이미지로 변경하기
		try {
			this.setIconImage(ImageIO.read(new File("images/flower.jpg")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		this.setVisible(true);
		// X 버튼을 클릭시 프로세스도 종료되게끔 변경 (*원래는 컨테이너만 종료되고 프로그램은 종료되지 않는다)
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// 프로그램 종료 가능
	}
}
