package edu.ch19.event.use;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/* A�� �� */
public class B_OtherClass  extends JFrame {
	public static void main(String[] args) {
		new B_OtherClass();
	}
	private JButton button;
	private JLabel label;
	
	public B_OtherClass() {
		this.setSize(300,200);
		JPanel panel = new JPanel();
		button = new JButton("��ư�� ����������");
		JLabel label = new JLabel("���� ��ư�� �������� �ʾҽ��ϴ�.");
		
		button.addActionListener(new MyEvent(button, label));
		
		panel.add(button);
		panel.add(label);
		
		this.add(panel);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
// �͸� Ŭ������ ������� �ʰ� �׼� �����ʸ� ����ϴ� ���
class MyEvent implements ActionListener {
	private JButton button;
	private JLabel label;
	public MyEvent(JButton button, JLabel label) {
		button.addActionListener(this);
		
		this.button = button;
		this.label = label;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			label.setText("��ư�� ���������ϴ�!");
		}
	}
}