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
		// 아이디는 영소문자와 숫자로 이루어져야하고 최대 10자임 (영문자로 시작해야함)
//
//		boolean out = false;
//		Scanner scan = new Scanner(System.in);
//		
//		while (!out) {
//		System.out.println("id를 입력하세요.");
//		String id = scan.nextLine();
//
//		Pattern p = Pattern.compile("[a-z][a-z0-9]{6,10}");
//		Matcher m = p.matcher(id);
//		
//			if (m.matches() == true) {
//				System.out.println("로그인 성공");
//				out = true;
//			} else if (m.matches() == false) {
//				System.out.println("로그인 실패");
//			} else {
//				System.out.println("아이디를 다시 입력하세요");
//			}
//		}
//		
		// 올바른 전화번호
		String regex = "010-[0-9]{4}-[0-9]{4}";
		Pattern p = Pattern.compile(regex);
		System.out.println(p.matcher("010-1234-5678").matches());
		System.out.println(p.matcher("010-1234-aaaa").matches());
		System.out.println(p.matcher("010-!@#$-5678").matches());
		System.out.println(p.matcher("01012345678").matches());
		System.out.println(p.matcher("010-123-5678").matches());

	}
}
