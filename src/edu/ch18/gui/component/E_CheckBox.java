package edu.ch18.gui.component;

import java.awt.BorderLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class E_CheckBox {
	public static void main(String[] args) {
		JFrame mf = new JFrame();
		
		// 배열을 선언하여 여러개의 체크박스를 생성함
		String[] fruits = {"apple","orange","banana"};
		JCheckBox[] buttons = new JCheckBox[3];
		
		JPanel checkPanel = new JPanel();
		
		for(int i=0; i<buttons.length;i++) {
			buttons[i] = new JCheckBox(fruits[i]);
			checkPanel.add(buttons[i]);
		}
		// 결과패널
		JPanel resPanel = new JPanel();
		JLabel text = new JLabel("선택한 과일이 없습니다");
		resPanel.add(text);
		
		for(int i=0; i<buttons.length; i++) {
			buttons[i].addItemListener(new ItemListener() {
				
				@Override
				public void itemStateChanged(ItemEvent e) {
					String res = "";
					int cnt =0;
					// 체크가 되어있는 모든 체크박스를 모두 확인하여 
					// 문자열을 새로 생성하고 라벨에 결과 부착
					for(int i=0; i<buttons.length; i++) {
						if(buttons[i].isSelected()) {
							res += buttons[i].getText()+" ";
							cnt++;
						}
					}
					text.setText(res);
					if(cnt==0) {
						text.setText("선택한 과일이 업습니다" );
					}
				}
			});
		}
		
		mf.add(checkPanel, BorderLayout.NORTH);
		mf.add(resPanel, BorderLayout.CENTER);
		
		mf.pack();

		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mf.setVisible(true);
	}
}
