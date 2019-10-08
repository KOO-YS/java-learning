package edu.ch18.gui.layout;

import java.awt.GridLayout;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFrame;

public class C_GridLayout extends JFrame{
	public C_GridLayout() {
		super("GridLayout");
		this.setBounds(300,200,800,500);
		// GridLayout
		/* 가로, 세로의 일정 수만큼 배치하고자 할 때 사용
		 * (가로, 세로 )
		 *  or
		 * (가로,세로, 가로갭, 새로갭) 순으로 넣는다
		 */		
//		this.setLayout(new GridLayout(5, 5));
		this.setLayout(new GridLayout(5, 5, 10, 20));
//		for(int i=0; i<25; i++) {
//			String str = new Integer(i).toString();
//			this.add(new JButton(str));
//		}
		// set을 이용해 중복제거해 랜덤으로 빙고판 만들기
		Set set = new LinkedHashSet();
		// 난수를 발생시켜서 set에 저장
		while(set.size()<25) {
			set.add(new Random().nextInt(25)+1);
		}
		Object[] ob = set.toArray();
		for(int i=0; i<25; i++) {
			String str = new Integer((int)ob[i]).toString();
			this.add(new JButton(str));
		}
		System.out.println(set);
		
		
		
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
