package edu.ch18.gui.layout;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class A_BorderLayout extends JFrame{
	public A_BorderLayout() {
		// 부모 생성자(JFrame) 쪽으로 프레임의 이름을 전달하여 설정
		super("BorderLayout");
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(300,200,800,500);
		
		// 레이아웃 설정   :: default -> BorderLayout
		this.setLayout(new BorderLayout());
		// 현재 적용된 레이아웃 알아보기
		System.out.println("Layout :: "+this.getLayout());
		
		// 버튼
		JButton south = new JButton("South");
		JButton north = new JButton("North");
		JButton east = new JButton("East");
		JButton west = new JButton("West");
		/* JButton center = new JButton("Center"); */
		
		this.add(south,"South");
		this.add(north,"North");
		this.add(east,"East");
		this.add(west,"West");
		/* this.add(center,"Center"); */

		// 단축
		this.add(new JButton("Another Center"),"Center");
	}
}
