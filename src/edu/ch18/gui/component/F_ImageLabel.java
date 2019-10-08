package edu.ch18.gui.component;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class F_ImageLabel {
	public static void main(String[] args) {
		JFrame mf = new JFrame("이미지 라벨 테스트");
		mf.setSize(250,300);
		
		JPanel panel = new JPanel();
		
		// 이미지 크기를 지정해서 이미지 객체 생성
		Image icon = new ImageIcon("images/flower.jpg").getImage().getScaledInstance(300, 200, 0);
		
		// Null Point ERROR -> 방법 찾기
//		URL iconURL = F_ImageLabel.class.getClassLoader().getResource("flower.jpg");
//		Image icon = new ImageIcon(iconURL).getImage().getScaledInstance(300, 200, 0);
		
		JLabel label = new JLabel(new ImageIcon(icon));
		JButton button = new JButton("이미지 보기");
		
		panel.add(label);
		panel.add(button);
		
		mf.add(panel);
		
		// button Event
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Image icon = new ImageIcon("images/flower.jpg").getImage().getScaledInstance(100, 100, 0);
				label.setIcon(new ImageIcon(icon));
			}
		});
				
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mf.setVisible(true);
	}
	
}
