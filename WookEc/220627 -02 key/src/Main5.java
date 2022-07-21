import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Main5 extends JFrame{
	private String ID = "wjddnr1909";
	private String PW = "r131322";
	public Main5() {
		GridLayout grid = new GridLayout(2, 2);
		JPanel pnl = new JPanel(grid);
		JTextField tf = new JTextField(10);
		JPasswordField pf = new JPasswordField(10);
		
		JButton logBtn = new JButton("로그인");
		JButton memberBtn = new JButton("회원가입");
		
//		JPanel memPnl = new JPanel();
//		JTextField memTf = new JTextField(10);
//		JPasswordField memPf = new JPasswordField(10);
//		JPasswordField memPf2 = new JPasswordField(10);
//		
//		memPnl.add(memTf);
//		memPnl.add(memPf);
//		memPnl.add(memPf2);
//		
//		add(memPnl);
//		memPnl.setSize(500, 700);
		
		pnl.add(tf);
		pnl.add(logBtn);
		pnl.add(pf);
		pnl.add(memberBtn);
		
		
		
		
//				새로운 창에서 메세지 띄우기
		logBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = tf.getText();
				char[] ptext = pf.getPassword();
				if (!text.equals(ID)) {
					JOptionPane.showMessageDialog(Main5.this,"ID를 잘못 입력하셨습니다.");
				} else if (!String.valueOf(ptext).equals(PW)) {
					JOptionPane.showMessageDialog(Main5.this, "PW를 잘못 입력하셨습니다.");
				} else if (text.equals(ID) && String.valueOf(ptext).equals(PW)) {
					JOptionPane.showMessageDialog(Main5.this, "로그인 성공");
				}
			}
		});
		
		memberBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Main6().setVisible(true);
				
				
			}
		});
		
		
		
		add(pnl);
		
		
		setSize(500, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		new Main5().setVisible(true);
	}
}
