package edu.ch18.gui.container;

import java.awt.Rectangle;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class JFrameTest2 {
	/**
	 * 프레임 생성방법 
	 * 2.JFrame 클래스를 객체로 생성
	 */
	public void showMainFrame() {
		// JFrame 객체 생성
		/* JFrame f = new JFrame(); */
		//프레임 이름 설정
		/* f.setTitle("secondFrame"); */
		
		JFrame f = new JFrame("secondFrame"); 	// 단축 가능
		f.setVisible(true);
		
		// X버튼을 이용한 프로세스 종료
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// java.awt.Rectangle 객체를 활용한 사이즈 설정
		Rectangle r = new Rectangle(300, 200, 800, 500);
		f.setBounds(r);
		
		try {
			f.setIconImage(ImageIO.read(new File("images/flower.jpg")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
