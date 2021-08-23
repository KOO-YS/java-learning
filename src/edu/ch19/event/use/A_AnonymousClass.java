package edu.ch19.event.use;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/* B�� �� */
public class A_AnonymousClass {
	public static void main(String[] args) {
		// �͸� Ŭ����
		// �ٸ� ���� Ŭ�����ʹ� �ٸ��� �̸��� ���� Ŭ����
		// ����� ���ÿ� ��ü�� �����Ѵ�.
		// �ѹ��� ����� �����ϸ�, �ϳ��� ��ü�� ���� �����ϴ� -> ��ȸ�� Ŭ����
		JFrame mf = new JFrame();
		mf.setSize(300,200);
		
		JPanel panel = new JPanel();
		JButton btn = new JButton("��ư�� ����������");
		JLabel label = new JLabel("���� ��ư�� �������� �ʾҽ��ϴ�.");
		
		// �͸� Ŭ����
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btn) {
					label.setText("��ư�� ���������ϴ�.");
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
