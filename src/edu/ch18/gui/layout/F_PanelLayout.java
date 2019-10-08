package edu.ch18.gui.layout;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class F_PanelLayout extends JFrame{
	public F_PanelLayout() {
		// Layout 지정없이 원하는 위치에 배치
		super("nullLayout");
		
		this.setBounds(200, 200, 500, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setLayout(null);
		
		
		JLabel lb = new JLabel("이름 : ");
		lb.setLocation(50, 100);
		lb.setSize(150, 50);
		
		JTextField txt = new JTextField(20);	// (size)
		txt.setLocation(110, 100);
		txt.setSize(150,50);
		
		JButton btn = new JButton("추가");
		btn.setLocation(350, 100);
		btn.setSize(100, 50);
		
		// 패널 추가
		JPanel panel = new JPanel();
		panel.setSize(500,500);	// 컨테이너의 사이즈와 같다
		
		// 패널에 레이아웃을 설정하지 않으면 flowLayout의 center 기본값
		// 패널에도 레이아웃을 지정
		panel.setLayout(null);
		panel.add(lb);
		panel.add(txt);
		panel.add(btn);
		panel.setBackground(Color.PINK);
		
		this.add(panel);
		
		
		
		
		
		
	}
	
}