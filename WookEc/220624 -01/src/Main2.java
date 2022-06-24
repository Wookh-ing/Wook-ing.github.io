import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main2 extends JFrame {
	private int price1 = 5000;
	private int price2 = 6000;
	private int price3 = 10000;
	private int total;
	private int cnt1;
	private int cnt2;
	private int cnt3;
	
	public Main2() {
		JPanel pnl = new JPanel();
		JCheckBox check1 = new JCheckBox("짜장면 : " + price1 + "원");
		JCheckBox check2 = new JCheckBox("짬뽕 : " + price2 + "원");
		JCheckBox check3 = new JCheckBox("탕수육 : " + price3 + "원");
		JTextField menu = new JTextField();
		JButton button1 = new JButton("전체선택");
		JButton button2 = new JButton("전체취소");
		JButton button3 = new JButton("주문완료");
		BoxLayout box = new BoxLayout(pnl, BoxLayout.Y_AXIS);
		
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				check1.setSelected(true);
				check2.setSelected(true);
				check3.setSelected(true);
				menu.setText(String.valueOf(price1 + price2 + price3));
			}
		});
		
		button2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				check1.setSelected(false);
				check2.setSelected(false);
				check3.setSelected(false);
				menu.setText(null);
				menu.removeAll();
			
				
			}
		});
		
		
		check1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (check1.isSelected()) {
					check2.setSelected(false);
					check3.setSelected(false);
					cnt1++;
					menu.setText(String.valueOf(price1 * cnt1));
				}
			}
		});

		check2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (check2.isSelected()) {
					check1.setSelected(false);
					check3.setSelected(false);
					cnt2++;
					menu.setText(String.valueOf(price2 * cnt2));
				}
			}
		});

		check3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (check3.isSelected()) {
					check1.setSelected(false);
					check2.setSelected(false);
					cnt3++;
					menu.setText(String.valueOf(price3 * cnt3));
				}
			}
		});
		
		button3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				menu.setText(String.valueOf((price1 * cnt1) + (price2 * cnt2) + (price3 * cnt3)));
			}
		});
		
		pnl.setLayout(box);
		pnl.add(button1);
		pnl.add(button2);
		pnl.add(button3);
		pnl.add(check1);
		pnl.add(check2);
		pnl.add(check3);
		pnl.add(menu);
//		menu.setSize(20, 4);

		add(pnl);

		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Main2().setVisible(true);
	}
}
