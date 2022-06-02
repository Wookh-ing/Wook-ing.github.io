// 주민번호를 입력하면
// 성별을 출력하는 프로그램
// 예) xxxxxx-1xxxxxx

import java.util.*;

public class Resident {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("하이폰을 포함한 주민번호를 입력하세요: ");
		String a = sc.nextLine();
		// String gender;
		// gender = "1";
		// int index = a.indexOf("1", 7);
		// System.out.println(index);
		
		// int index2 = a.indexOf("2", 7);
		// System.out.println(index2);
		
		switch (a.charAt(7)) {
		case '1':		case '3':
		//gender = "남성";
		System.out.println("남성입니다.");
		break;
		
		case '2':		case '4':
		//gender = "여성";
		System.out.println("여성입니다.");
		break;
		default:
		System.out.println("다시 입력해주세요.");
		break;
		}
		// System.out.println("성별은: "+ gender);
	}
}
// String result;
	// if (a.length() == 14){
		// char c =a.charAt(7)
		// switch (c) {
		// case '1':		case '3':
		// result = "남성";
		// break;
		
		// case '2':		case '4':
		// result = "여성";
		// break;
		// default:
		// result = "잘못입력";
		// break;
		// }
	//} else
		//result = "잘못입력";
	//