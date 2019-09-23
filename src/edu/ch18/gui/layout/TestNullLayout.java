package edu.ch18.gui.layout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TestNullLayout extends JFrame{
	public TestNullLayout() {
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
		
		this.add(lb);
		this.add(txt);
		this.add(btn);
	}
}