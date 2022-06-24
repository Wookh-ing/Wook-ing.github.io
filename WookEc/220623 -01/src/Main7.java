import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main7 extends JFrame{
	public Main7() {
		JPanel pnlTop = new JPanel();
		JPanel pnlBottom = new JPanel();
		JPanel pnlBox = new JPanel();
		
		BoxLayout box = new BoxLayout(pnlBox, BoxLayout.Y_AXIS);
		pnlBox.setLayout(box);
		pnlBox.add(pnlTop);
		pnlBox.add(pnlBottom);
		
		JTextField tf1 = new JTextField(30);
		JTextField tf2 = new JTextField(30);
		JButton btn1 = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");
		
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
//				새로운 창에서 메세지 띄우기
				String text = tf1.getText();
				tf2.setText(text);
//				null위치에 넣은것은 컴포넌트의 위치를 알려줌 (다이얼로그의 위치)
//				바깥의 클래스이름 Main7.this 를 하면 참조가능
				JOptionPane.showMessageDialog(Main7.this, text);
//				System.out.println(tf1.getText());
			}
		});
		
		pnlTop.add(tf1);
		pnlTop.add(btn1);
		pnlBottom.add(tf2);
		pnlBottom.add(btn2);
		
		
		add(pnlBox);
		
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}
	public static void main(String[] args) {
		new Main7().setVisible(true);
	}
}
