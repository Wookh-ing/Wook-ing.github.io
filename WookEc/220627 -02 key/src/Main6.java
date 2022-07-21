import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Main6 extends JFrame {
	public Main6() {
		JPanel memPnl = new JPanel();
		JTextField memTf = new JTextField(10);
		JPasswordField memPf = new JPasswordField(10);
		JPasswordField memPf2 = new JPasswordField(10);
		JButton memBtn = new JButton("가입");
		
		
		memPnl.add(memTf);
		memPnl.add(memPf);
		memPnl.add(memPf2);
		
		add(memPnl);
		memPnl.setSize(500, 700);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Main6().setVisible(true);
	}
}
