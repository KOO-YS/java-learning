package edu.ch18.gui.component;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class C_TextArea {
	public static void main(String[] args) {
		JFrame j = new JFrame();
		
		// 입력용 텍스트 필드
		JTextField txt = new JTextField(30);
		
		// 출력용 텍스트
		JTextArea ta = new JTextArea(10,30);
		
		txt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = txt.getText()+"\n";
				ta.append(text);
				
				txt.setText("");		//입력창 초기화
				txt.requestFocus();		// 커서 포커스 이동
			}
		});
		j.add(txt, BorderLayout.NORTH);
		j.add(ta,BorderLayout.CENTER);
		
		j.pack();
		
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.setVisible(true);
	}
}
