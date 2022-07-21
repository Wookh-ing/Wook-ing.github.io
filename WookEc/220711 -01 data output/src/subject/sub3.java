package subject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class sub3 {
	private static BufferedReader br;

	public static void main(String[] args) {
		int count;
		String name;
		String phoneNum;
		String Email;
		Scanner sc = new Scanner(System.in);
		count = 0;
		int input = 1;
		Scanner scanner = null;

		try {
			PrintWriter pw = new PrintWriter(new FileWriter("d:\\WookEc\\filetest\\sub3.txt"));
			while (input != 0 && input != 2 && input != 3) {
				count++;

				System.out.println("사용자의 번호는" + count + "입니다");
				System.out.println("사용자의 이름 입력");
				name = sc.next();
				System.out.println("사용자의 전화번호 입력");
				phoneNum = sc.next();
				System.out.println("사용자의 이메일 주소 입력");
				Email = sc.next();
				System.out.println("계속하시겠습니까?");

				pw.println(count);
				pw.println(name);
				pw.println(phoneNum);
				pw.println(Email);
				pw.flush();

				System.out.println("멈춤 = 0, 진행 = 1, 번호보기 = 2, 유저목록보기 = 3");
				input = sc.nextInt();
			}
			if (input == 2) {
				System.out.println("선택 번호 보기");
				br = new BufferedReader(new FileReader("d:\\WookEc\\filetest\\sub3.txt"));
				scanner = new Scanner(br);
				String smartLine = "\n";
				System.out.println("찾으실 번호를 입력해주세요");
				int findNum = sc.nextInt();
				while (scanner.hasNext()) {
					count = scanner.nextInt();
					name = scanner.next();
					phoneNum = scanner.next();
					Email = scanner.next();

					if (findNum == count) {
						System.out.println("고객의 번호는:" + count + "\t" + "고객의 전화번호는: " + phoneNum);
					}

				}
			}

			if (input == 3) {
				System.out.println("유저목록을 보여주세요");
				br = new BufferedReader(new FileReader("d:\\WookEc\\filetest\\sub3.txt"));
				scanner = new Scanner(br);
				while (scanner.hasNext()) {
					System.out.println(scanner.nextLine());
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}
}