package edu.ch19.event.key;

import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class KeyEvent extends JFrame implements KeyListener{
	public static void main(String[] args) {
		new KeyEvent();
	}
	public KeyEvent() {
		this.setTitle("키 테스트");
		this.setSize(300, 200);
		
		JTextField tf = new JTextField(20);
		tf.addKeyListener(this);
		
		this.add(tf);
		setVisible(true);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void display(String s, java.awt.event.KeyEvent e) {
		char c = e.getKeyChar();
		int keyCode = e.getKeyCode();
		String str = e.isAltDown()+" "+e.isControlDown()+" "+e.isShiftDown();
		System.out.println(s+" "+c+" "+keyCode+str);
	}
	
	
	@Override
	public void keyTyped(java.awt.event.KeyEvent e) { 	// 한글됨
		this.display("key typed", e);
		
	}

	@Override
	public void keyPressed(java.awt.event.KeyEvent e) {	// 한글 안됨
		this.display("key pressed", e);
		
	}

	@Override
	public void keyReleased(java.awt.event.KeyEvent e) {
		this.display("key released", e);
		
	}
	
}
