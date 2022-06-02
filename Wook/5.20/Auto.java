// 정수 2개와 연산자(문자열 + - * /) 등을 입력받아 사칙연산을 수행하는 계산기 프로그램

import java.util.Scanner;

public class Auto {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 정수를 입력하시오: ");
		int x = scan.nextInt();
		System.out.print("연산자를 입력하시오: ");
		scan.nextLine();
		String y = scan.nextLine();
		System.out.print("두번째 정수를 입력하시오: ");
		int z = scan.nextInt();
		int a;
		
		if (y.equals("+") || y.equals("-") || y.equals("*") || y.equals("/")){
			if (y.equals("+")){
				a = x + z;
			} else if (y.equals("-")){
				a = x - z;
			} else if (y.equals("*")){
				a = x * z;
			} else{
				a = x / z;
			}
			System.out.println("정답: " +a);
		} else {
			System.out.println("잘못된 연산자 입니다.");
		}
				
	}
}
		// int abc;
		// if (y == "+") {
			// abc = (x + z);
		// } else if (y == "-") {
			// abc = (x - z);
		// } else if (y == "*") {
			// abc = (x * z);
		// } else if (y == "/") {
			// abc = (x / z);
		// }
		
		// if (y == "+") {
			// System.out.println("= " + (x + z));
		// } if else (y == "-") {
			// System.out.println("= " + (x - z));
		// } if else (y == "*") {
			// System.out.println("= " + (x * z));
		// } if else (y == "/") {
			// System.out.println("= " + (x / z));
		// 
	