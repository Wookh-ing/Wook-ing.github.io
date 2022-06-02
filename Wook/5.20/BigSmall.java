// 정수 2개를 입력받아서 큰수에서~ 작은수로 나눈 몫과 나머지를 출력하시오

import java.util.Scanner;

public class BigSmall {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// System.out.println("첫번째 정수를 입력하시오.");
		// int a = scan.nextInt();
		// System.out.println("두번째 정수를 입력하시오.");
		// int b = scan.nextInt();
		
		
		// if (a>b) {
			// System.out.println("몫: " + (a/b));
			// System.out.println("나머지: " + (a%b));
		// } 
		// else {
			// System.out.println("몫: " + (b/a));
			// System.out.println("나머지: " + (b%a));
		// }
		// if (a == 0 || b == 0) {
			// System.out.println("나머지: " + a);
		// System.out.println("나머지: " + b);}
		
		
		System.out.println("첫번째 정수를 입력하시오.");
		int a = scan.nextInt();
		System.out.println("두번째 정수를 입력하시오.");
		int b = scan.nextInt();
		int div;
		int mod;
		
		
		if (a != 0 && b != 0) {
			if (a > b) {
				div = a / b;
				mod = a % b;
			} else {
				div = b / a;
				mod = b % a;
			}
				System.out.println("몫: " + div);
				System.out.println("나머지: " + mod);
		} else {
				System.out.println("여기서 0이 왜나와 등신아");
		}
		
		
	}
}