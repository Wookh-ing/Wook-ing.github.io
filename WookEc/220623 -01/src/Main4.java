import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main4 extends JFrame implements ActionListener{
	private JButton btnEnable;
	private JButton btnDisable;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	public Main4() {
		super("버튼 활성화 테스트~");
		
		JPanel pnl = new JPanel();
		
		btnEnable = new JButton("활성화");
		btnDisable = new JButton("비활성화");
		JButton btnNotShown = new JButton("보임?");
		btn1 = new JButton("1");
		btn2 = new JButton("2");
		btn3 = new JButton("3");
		btn4 = new JButton("4");
		btn5 = new JButton("5");
		
		btnEnable.addActionListener(this);
		btnDisable.addActionListener(this);
		
//		btnDisable.setEnabled(false);
		btnNotShown.setVisible(false);
		
		pnl.add(btnEnable);
		pnl.add(btnDisable);
		pnl.add(btnNotShown);
		pnl.add(btn1);
		pnl.add(btn2);
		pnl.add(btn3);
		pnl.add(btn4);
		pnl.add(btn5);
		
		add(pnl);
		
		setSize(new Dimension(500, 500));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnEnable) {
			btn1.setEnabled(false);
		}
	}
	
	public static void main(String[] args) {
		new Main4().setVisible(true);
	}
}
