import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main4 {
	public static void main(String[] args) {
		String line1 = "lowercase";
		String line2 = "UPPERCASE";
		String line3 = "1q2w3e";

//		Pattern p = Pattern.compile("[0-9a-z]{6}");
//		Matcher m = p.matcher(line3);
//		System.out.println(m.matches());
//
//		Pattern p1 = Pattern.compile("[a-z]{0,100}");
//		Pattern p2 = Pattern.compile("[A-Z]{9}");
//		Matcher m1 = p1.matcher(line1);
//		Matcher m2 = p2.matcher(line2);
//		
//		System.out.println(m1.matches());
//		System.out.println(m2.matches());
//
		// ���̵�� ���ҹ��ڿ� ���ڷ� �̷�������ϰ� �ִ� 10���� (�����ڷ� �����ؾ���)
//
//		boolean out = false;
//		Scanner scan = new Scanner(System.in);
//		
//		while (!out) {
//		System.out.println("id�� �Է��ϼ���.");
//		String id = scan.nextLine();
//
//		Pattern p = Pattern.compile("[a-z][a-z0-9]{6,10}");
//		Matcher m = p.matcher(id);
//		
//			if (m.matches() == true) {
//				System.out.println("�α��� ����");
//				out = true;
//			} else if (m.matches() == false) {
//				System.out.println("�α��� ����");
//			} else {
//				System.out.println("���̵� �ٽ� �Է��ϼ���");
//			}
//		}
//		
		// �ùٸ� ��ȭ��ȣ
		String regex = "010-[0-9]{4}-[0-9]{4}";
		Pattern p = Pattern.compile(regex);
		System.out.println(p.matcher("010-1234-5678").matches());
		System.out.println(p.matcher("010-1234-aaaa").matches());
		System.out.println(p.matcher("010-!@#$-5678").matches());
		System.out.println(p.matcher("01012345678").matches());
		System.out.println(p.matcher("010-123-5678").matches());

	}
}
