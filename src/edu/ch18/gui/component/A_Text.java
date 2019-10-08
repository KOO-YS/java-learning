package edu.ch18.gui.component;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class A_Text {
	public static void main(String[] args) {
		JFrame mf = new JFrame();
		mf.setSize(800,300);
		
		// panel add
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2,2));
		panel.setSize(800,300);
		
		// TextField :: 글을 입력할 수 있는 텍스트 상자
		JTextField id = new JTextField(30);
		panel.add(new JLabel("ID : "));
		panel.add(id);
		
		// PasswordField :: 비밀번호 입력할 수 있는 텍스트 상자
		// 화면상에서 입력값을 볼 수 없다. 한글 입력 불가능(오직 영어)
		JPasswordField password = new JPasswordField(30);
		panel.add(new JLabel("Password : "));
		panel.add(password);
		
		// TextArea :: 여러 줄의 텍스트를 입력할 수 있는 상자
		JTextArea textArea = new JTextArea(10,20);
		panel.add(textArea);
		
		JButton btn = new JButton("보내기");
		
		mf.add(panel, BorderLayout.NORTH);
		mf.add(textArea, BorderLayout.CENTER);
		mf.add(btn, BorderLayout.SOUTH);
		
		mf.pack();
		
		// Button Event
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				/* getText() -> String  getPassword() -> char[] */
				String text = "id : "+id.getText()+"\npassword : ";
				char[] pass = password.getPassword();	// char[] 로 받아온다
				for(int i=0; i<pass.length; i++) {
					text+=pass[i];
					System.out.println(pass[i]);
				}
				textArea.append(text+"\n");
			}
		});
		
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mf.setVisible(true);
	}
}
