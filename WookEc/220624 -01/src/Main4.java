import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Main4 extends JFrame{
//	private double inch = 2.54;
	
	public Main4() {
		JPanel pnl = new JPanel();
		JRadioButton rdb1 = new JRadioButton("inch를 cm로 변환");
		JRadioButton rdb2 = new JRadioButton("cm를 inch로 변환");
		JTextField text = new JTextField(20);
		JTextField correct = new JTextField(20);
		JButton change = new JButton("변환");
		ButtonGroup group = new ButtonGroup();

		change.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (rdb1.isSelected() == true) {
					double a = Double.valueOf(text.getText()) * 2.54;
					correct.setText(String.valueOf(String.format("%.2f", a)));
				} else if (rdb2.isSelected() == true) {
					double b = Double.valueOf(text.getText()) / 2.54;
					correct.setText(String.valueOf(String.format("%.2f", b)));
				}
			}
		});
//		change.addActionListener(new ActionListener() {
//		public void actionPerformed(ActionEvent e) {
////			새로운 창에서 메세지 띄우기
//			String text = correct.getText();
//			if (i) {
//				JOptionPane.showMessageDialog(Main4.this,"바르게 입력해 주세요.");
//			}
//		}
//	});
//		
		group.add(rdb1);
		group.add(rdb2);
		
		pnl.add(rdb1);
		pnl.add(rdb2);
		pnl.add(change);
		pnl.add(text);
		pnl.add(correct);
		
		add(pnl);
		
		setSize(500, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Main4().setVisible(true);
	}
}

//		ItemListener itemListener = new ItemListener() {
//			@Override
//			public void itemStateChanged(ItemEvent e) {
//				if (rdb1.isSelected()  == true) {
//					double a = Double.valueOf(text.getText()) * 2.54;
//					correct.setText(String.valueOf(a));
//				} else if (rdb2.isSelected() == true) {
//					double b = Double.valueOf(text.getText()) / 2.54;
//					correct.setText(String.valueOf(b));
//				}
//			}
//		};
//		
//		
//		change.addItemListener(itemListener);