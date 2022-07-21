package subject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
class Member {
	private int count;
	private String name;
	private String phoneNum;
	private String Email;
	public Member(int count, String name, String phoneNum, String email) {
		super();
		this.count = count;
		this.name = name;
		this.phoneNum = phoneNum;
		Email = email;
	}
	
}

public class sub3in1 {
	private static BufferedReader br;

	public static void main(String[] args) {
		List<Member> list = new ArrayList<>();
		try {
			br = new BufferedReader(new FileReader("d:\\WookEc\\filetest\\sub3.txt"));
			
			int count = br.read();
			String name = br.readLine();
			String phoneNum = br.readLine();
			String Email = br.readLine();
			Member m = new Member(count, name, phoneNum, Email);
			list.add(m);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
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
		System.out.println(list);
	}
}
