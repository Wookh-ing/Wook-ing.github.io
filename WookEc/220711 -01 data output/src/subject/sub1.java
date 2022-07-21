package subject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class sub1 {
	public static void main(String[] args) {
		File file = new File("d:\\WookEc\\filetest\\num.txt");
		List<Integer> list = new ArrayList<>();

		Scanner scanner = null;

		try {
			scanner = new Scanner(file);

			while (scanner.hasNext()) {
				list.add(scanner.nextInt());
			}
			System.out.println(list);
			Collections.sort(list);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
		File fileSort = new File("d:\\WookEc\\filetest\\numSort.txt");
		PrintWriter pw = null;

		try {
			pw = new PrintWriter(new FileWriter(fileSort));

			pw.println(list);
			pw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (pw != null) {
				pw.close();
			}
		}
		System.out.println(list);
	}
}
