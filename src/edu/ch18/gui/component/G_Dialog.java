package edu.ch18.gui.component;

import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class G_Dialog {
	public static void main(String[] args) {
		JFrame mf = new JFrame();
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		
		JButton button1 = new JButton("simple Dialog");
		
		// 다이얼로그 :: pop-up창
		Dialog sd = new Dialog(mf, "simple Dialog");
		sd.setBounds(150, 250, 150, 150);
		sd.add(new JLabel("simple Dialog"));
		
		JButton button2 = new JButton("close");
		sd.add(button2);
		
		JButton button3 = new JButton("inputDialog");
		sd.add(button3);
		
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sd.setVisible(true);
			}
		});
		
		button2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sd.dispose();
			}
		});
		button3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String res = JOptionPane.showInputDialog("내용을 입력하세요");
				System.out.println(res);
			}
		});
		
		panel.add(button1);
		mf.add(panel);
		
		mf.pack();
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mf.setVisible(true);
	}
}
