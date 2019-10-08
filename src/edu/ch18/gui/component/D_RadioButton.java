package edu.ch18.gui.component;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class D_RadioButton {
	public static void main(String[] args) {
		JFrame mf = new JFrame("라디오 버튼 테스트");
		mf.setSize(300, 150);
		
		JPanel topPanel = new JPanel();
		JLabel label = new JLabel("어떤 크기의 커피를 주문하시겠습니까");
		
		topPanel.add(label);
		mf.add(topPanel,BorderLayout.NORTH);
		
		JPanel sizePanel = new JPanel();
		
		// 라디오 버튼
		JRadioButton small = new JRadioButton("small Size");
		JRadioButton medium = new JRadioButton("medium Size");
		JRadioButton large = new JRadioButton("larger Size");
		
		// 버튼 그룹으로 지정 -> 여러 개 선택되지 않게
		ButtonGroup size = new ButtonGroup();
		
		// -> 라디오버튼의 특징 -> 복수선택 불가능 (필수로 그룹을 묶어주는 것을 말한다)
		size.add(small);
		size.add(medium);
		size.add(large);
		
		// 버튼 패널에 올리기
		// sizePanel.add(small); -> 그룹대신 단일 버튼을 add하면 중복 선택이 된다.
		sizePanel.add(small);
		sizePanel.add(medium);
		sizePanel.add(large);
		mf.add(sizePanel,BorderLayout.CENTER);
		
		JPanel resPanel = new JPanel();
		JLabel text = new JLabel("크기가 선택되지 않았습니다");
		resPanel.add(text);
		mf.add(resPanel,BorderLayout.SOUTH);
		
		small.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				text.setText("스몰 사이즈 선택");
			}
		});
		medium.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				text.setText("미디움 사이즈 선택");
			}
		});
		large.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				text.setText("라지 사이즈 선택");
			}
		});
		
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mf.setVisible(true);
	}
}
