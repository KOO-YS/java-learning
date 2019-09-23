package edu.ch18.gui.layout;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TestCardLayout  extends JFrame{
	public TestCardLayout() {
		super("CardLayout");
		// CardLayout
		/* panel을 이용해서 카드판을 겹쳐놓음 
		 * 이벤트를 이용해서 다른 판이 보이게끔 설정
		 * */
		CardLayout card = new CardLayout();
		this.setLayout(card);
		
		// 패널
		/* 패널은 컴포넌트지만 다른 컴포넌트를 포함할수 있는 컨테이너의 성격을 가진다 */
		
		JPanel card1 = new JPanel();
		JPanel card2 = new JPanel();
		JPanel card3 = new JPanel();

		// 패널의 배경색 지정
		card1.setBackground(Color.CYAN);
		card2.setBackground(Color.GREEN);
		card3.setBackground(new Color(50,100,60));
		
		// 패널에 라벨 추가
		card1.add(new JLabel("Card1"),"1");
		card2.add(new JLabel("Card2"),"2");
		card3.add(new JLabel("Card3"),"3");
		
		// 메인 프레임에 패널 추가
		this.add(card1);
		this.add(card2);
		this.add(card3);
		
		// 패널에 이벤트 추가
		card1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
//				System.out.println(e.getButton());	// value : 1
				if(e.getButton()==1) {
					card.next(card1.getParent());
				}
				if(e.getButton()==2) {		// 스크롤 클릭
					card.next(card1.getParent());
				}
				if(e.getButton()==3) {		// 우클릭
					card.next(card1.getParent());
				}
			}
		});
		
		card2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println(e.getButton());	// value : 1
				if(e.getButton()==1) {
					card.next(card1.getParent());	// card1과 같은 부모
				}
				if(e.getButton()==2) {		// 스크롤 클릭
					card.next(card1.getParent());
				}
				if(e.getButton()==3) {		// 우클릭
					card.next(card1.getParent());
				}
			}
		});
		
		card3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println(e.getButton());	// value : 1
				if(e.getButton()==1) {
					card.next(card1.getParent());
				}
				if(e.getButton()==2) {		// 스크롤 클릭
					card.next(card1.getParent());
				}
				if(e.getButton()==3) {		// 우클릭
					card.next(card1.getParent());
				}
			}
		});
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(300, 200, 800, 500);
		this.setVisible(true);
	}
}
