// 사용자의 입력 n, m에 대해
// n^m(n의 m제곱)을 출력하기

import java.util.Scanner;

public class User {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("사용자의 입력(정수): ");
		int n = scan.nextInt();
		
		System.out.println("사용자의 입력(제곱): ");
		int m = scan.nextInt();
		
		long pow = 1;
		for (int i = 0 ; i < m; i++) {
			pow *= n;
		}
			System.out.println("결과값:" + pow);
	}
}
			