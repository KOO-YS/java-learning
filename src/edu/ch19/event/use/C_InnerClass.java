package edu.ch19.event.use;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class C_InnerClass extends JFrame{
	public static void main(String[] args) {
		new C_InnerClass();
	}
	// 내부 클래스를 이용한 이벤트 처리
	private JButton btn;
	private JLabel label;
	
	public C_InnerClass() {
		this.setSize(300,200);
		this.setTitle("내부 클래스");
		
		JPanel panel = new JPanel();
		btn = new JButton("버튼을 눌러보세요");
		label = new JLabel("아직 버튼이 눌려지지 않았습니다");
		
		btn.addActionListener(new MyEvent());
		
		panel.add(btn);
		panel.add(label);
		
		this.add(panel);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}		// C_InnerClass 생성자 end
	
	// C_InnerClass 내부에 클래스 생성
	private class MyEvent implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == btn) {
				label.setText("버튼이 눌려졌습니다");
			}
		}
	}		// -> MyEvent(내부클래스) end
	
} // -> C_InnerClass end
