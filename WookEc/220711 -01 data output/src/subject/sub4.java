package subject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class sub4 {
	public static void main(String[] args) {
		int count;
		String name;
		String phoneNum;
		String Email;
		Scanner sc = new Scanner(System.in);
		File file = new File("d:\\WookEc\\filetest\\phoneNum.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		count = 0;
		int input = 1;
		PrintWriter pw = null;

		try {
			pw = new PrintWriter(new FileWriter(file));
			while (input != 0){ 
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
				
				System.out.println("진행 = 1, 멈춤 = 0");
				input = sc.nextInt();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (pw != null) {
				pw.close();

			}
		}
	}
}
