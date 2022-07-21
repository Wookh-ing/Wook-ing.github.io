import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Memo extends JFrame {

	private File file;
	Scanner scanner = null;
	public Memo() {
		JFileChooser chooser = new JFileChooser();
		JFileChooser saver = new JFileChooser();
		JPanel pnl = new JPanel();
		JButton btnOpen = new JButton("열기");
		btnOpen.setBounds(160, 1, 60, 30);
		JButton btnSave = new JButton("저장");
		btnSave.setBounds(260, 1, 60, 30);
		JTextArea area = new JTextArea();
		area.setBounds(12, 59, 460, 392);
		area.setVisible(true);
		BufferedWriter bw;
		BufferedReader br;

		btnSave.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int result = chooser.showSaveDialog(null);
				file = new File(chooser.getSelectedFile() + ".txt");
				PrintWriter pw2 = null;
				try {
					pw2 = new PrintWriter(file);
					pw2.println(area.getText());
				
					
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					
				} finally {
					pw2.close();
				}

			}

		});

		btnOpen.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int result = chooser.showOpenDialog(null);
				file = new File(chooser.getSelectedFile() + ".txt");
				try {
					scanner = new Scanner(file);
					while (scanner.hasNext()) {
						area.setText(scanner.hasNextLine());
					}
					
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				} finally {
					scanner.close();
				}
				
			}
		});
		
		getContentPane().add(pnl);
		pnl.setLayout(null);
		pnl.add(btnOpen);
		pnl.add(btnSave);
		pnl.add(area);

		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new Memo().setVisible(true);
	}
}
