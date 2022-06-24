import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;


class MyFrame2 extends JFrame {
	public MyFrame2() {
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		
		setBackground(new Color(255, 0, 0));
//		setBackground(Color.GRAY); => 상수로서 색상이 지정되어있기도하다.
		
		JButton button = new JButton("버튼1");
		JButton button2 = new JButton("버튼2");
		
		setLayout(new FlowLayout());
		add(button);
		add(button2);
//		getContentPane() => 생략가능
//		따로 배치 설정을 하지않으면 버튼이 가득 채워진다.
		

//		this.add(button);
		setVisible(true);
	}
}

public class MyFrameTest1 {
	public static void main(String[] args) {
		MyFrame2 f = new MyFrame2();
	}
}
