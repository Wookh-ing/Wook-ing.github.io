// 사용자가 입력한 정수가
// 짝수면 true
// 홀수면 false를 출력해 보세요.

import java.util.Scanner;

public class PM {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수: ");
		int x = scan.nextInt();

		System.out.print(x % 2 == 0);
	}
}
