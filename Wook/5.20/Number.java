// 사용자의 정수를 입력받아
// 짝수면 "짝수입니다." 출력하기
// 홀수면 "홀수입니다." 출력하기

import java.util.Scanner;

public class Number {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력해 주세요.: ");
		int num = scan.nextInt();
		
		if (num%2 == 0) {
		System.out.println("짝수입니다. ");
		} else {
			System.out.println("홀수입니다. ");
		}
		System.out.println("프로그램 종료. ");
		// if (num%2 != 0) {
		// System.out.println("홀수입니다. ");
		// }
	}
}
		