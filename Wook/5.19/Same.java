// 3. 사용자가 입력한 4자리의 정수가 좌우가 같을 때 true를 출력하세요. 나머지 경우는 false
// 예) 1221 - > true,    1557 -> false,    9009 -> true

import java.util.Scanner;

public class Same {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println ("4자리의 정수가 좌우가 같을때 true, 나머지 false");
		
		System.out.print("4자리 정수: ");
		int a = scan.nextInt();
		
		// b 천의자리수, c 백의자리수, d 십의자리수, e일의자리수
		int b = a / 1000;
		int c = a % 1000 / 100;
		int d = a % 100 / 10;
		int e = a % 10;
		
		
		boolean result = (b == e && d == c);
		//boolean result = (b + c == d + e); 더해서 같은수가 나왔을때 4자리 정수가 좌우가 같지 않을 경우가 존재
		System.out.println(result);
		
		
		
		//------------------------------------------------
		
		
		// System.out.print ("천의자리 정수를 입력하시오: ");
		// int a = scan.nextInt();
		// System.out.print ("백의자리 정수를 입력하시오: ");
		// int b = scan.nextInt();
		// System.out.print ("십의자리 정수를 입력하시오: ");
		// int c = scan.nextInt();
		// System.out.print ("일의자리 정수를 입력하시오: ");
		// int d = scan.nextInt();
		
		// int sum = "a""b""c""d";
		// System.out.println ("정수: " + sum);
		
		
		// boolean result = (a == d && c == b);
		// System.out.println(result);
		
		
		
		
	}
}
		