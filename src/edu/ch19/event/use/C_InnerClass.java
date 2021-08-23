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
	// ���� Ŭ������ �̿��� �̺�Ʈ ó��
	private JButton btn;
	private JLabel label;
	
	public C_InnerClass() {
		this.setSize(300,200);
		this.setTitle("���� Ŭ����");
		
		JPanel panel = new JPanel();
		btn = new JButton("��ư�� ����������");
		label = new JLabel("���� ��ư�� �������� �ʾҽ��ϴ�");
		
		btn.addActionListener(new MyEvent());
		
		panel.add(btn);
		panel.add(label);
		
		this.add(panel);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}		// C_InnerClass ������ end
	
	// C_InnerClass ���ο� Ŭ���� ����
	private class MyEvent implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == btn) {
				label.setText("��ư�� ���������ϴ�");
			}
		}
	}		// -> MyEvent(����Ŭ����) end
	
} // -> C_InnerClass end
