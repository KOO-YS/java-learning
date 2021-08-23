package edu.ch19.event.use;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/* B와 비교 */
public class A_AnonymousClass {
	public static void main(String[] args) {
		// 익명 클래스
		// 다른 내부 클래스와는 다르게 이름이 없는 클래스
		// 선언과 동시에 객체를 생성한다.
		// 한번만 사용이 가능하며, 하나의 객체만 생성 가능하다 -> 일회용 클래스
		JFrame mf = new JFrame();
		mf.setSize(300,200);
		
		JPanel panel = new JPanel();
		JButton btn = new JButton("버튼을 눌러보세요");
		JLabel label = new JLabel("아직 버튼이 눌려지지 않았습니다.");
		
		// 익명 클래스
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btn) {
					label.setText("버튼이 눌러졌습니다.");
				}
			}
		});
		
		panel.add(btn);
		panel.add(label);
		
		mf.add(panel);
		
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
