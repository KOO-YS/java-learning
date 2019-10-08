package edu.ch18.gui.component;

import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/* 		[ swing 에서 한글깨짐 ] 
 *  	 Run Configurations
 * 		 VM arguments : -Dfile.encoding=MS949
 */
public class B_TextFeild {
	public static void main(String[] args) {
		// 숫자를 입력받아서 제곱한 결과를 리턴
		// 프레임 생성
		JFrame mf = new JFrame();
		
		mf.setSize(300,200);
		mf.setTitle("제곱 계산하기");
		
		// 패널 생성
		JPanel panel = new JPanel();
		
		// 라벨 부착
		panel.add(new JLabel("숫자 입력 : "));
		
		// 텍스트 상자 생성
		JTextField text = new JTextField(20);
		panel.add(text);
		
		// 결과물 영역 -> 제곱한 결과
		panel.add(new Label("제곱한 결과 : "));
		JTextField result = new JTextField(10);
		result.setEditable(false);	// 수정 불가
		panel.add(result);
		
		// Button
		JButton btn = new JButton("OK");
		
		// Event
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭 시, 텍스트 상자의 값을 가져와서 파싱 후 계산 처리
				int value = Integer.parseInt(text.getText());
				result.setText(value*value+" ");
			}
		});
		
		panel.add(btn);
		
		mf.add(panel);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mf.setVisible(true);
		}
}
