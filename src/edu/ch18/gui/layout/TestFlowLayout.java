package edu.ch18.gui.layout;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TestFlowLayout extends JFrame{
	public TestFlowLayout() {
		super("FlowLayout");
		
		this.setBounds(300,200,800,500);
		
		//FlowLayout 설정
		/* 컨테이너보다 배치할 구성요소가 많거나 크게되면 다음줄로 넘어가서 배치 
		 * 정렬방식에 대한 align값을 가지고 있으며 기본값은 'Center' */
//		this.setLayout(new FlowLayout());
		
//		this.setLayout(new FlowLayout(FlowLayout.CENTER));		// 가운데 정렬
		this.setLayout(new FlowLayout(FlowLayout.LEFT));		//  왼쪽 정렬
//		this.setLayout(new FlowLayout(FlowLayout.RIGHT));
//		this.setLayout(new FlowLayout(FlowLayout.LEADING));		//  to the left in left-to-right orientations
//		this.setLayout(new FlowLayout(FlowLayout.TRAILING));	//  to the right in left-to-right orientations
		
		this.add(new JButton("1"));
		this.add(new JButton("2"));
		this.add(new JButton("3"));
		this.add(new JButton("4"));
		this.add(new JButton("5"));
		this.add(new JButton("6"));
		this.add(new JButton("7"));
		this.add(new JButton("8"));
		this.add(new JButton("9"));
		this.add(new JButton("10"));
		
		
		this.setVisible(true);
		
	}
}
