package edu.ch19.event.mouse;

import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MouseEvent extends JFrame implements MouseListener, MouseMotionListener{
	
	public static void main(String[] args) {
		new MouseEvent();
	}
	
	public MouseEvent() {
		this.setTitle("Mouse Event");
		this.setSize(300, 200);
		
		JPanel panel = new JPanel(); 
		panel.addMouseListener(this);
		panel.addMouseMotionListener(this);
		
		this.add(panel);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
	/*
	 * public void display (String s, java.awt.event.MouseEvent e) {
	 * System.out.println(s+" X= "+e.getX()+" Y= "+e.getY()); }
	 * this.display("MouseDragged", e);
	 */
	public void display (java.awt.event.MouseEvent e) {
		System.out.println("좌표 : X ("+e.getX()+") | Y ("+e.getY()+") ");
	}
	
	/* 출력을 원하는 메소드 안에 display() 삽입 */
	@Override
	public void mouseDragged(java.awt.event.MouseEvent e) {
		this.display(e);
	}

	@Override
	public void mouseMoved(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(java.awt.event.MouseEvent e) {
		display(e);
		
	}

	@Override
	public void mousePressed(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
