// 사용자가 0 이하의 정수를 입력할 때 까지 반복하여 입력
// 최근 5개를 출력

// 10 20 30 40 50 60 70 80 90 100 -1 -> 100 90 80 70 60

import java.util.Scanner;


public class Main6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = 100;
		
		int [] b = new int[A];
		for (int i = 0; i < A; i++) {
			System.out.println("정수입력해줘: ");
			b[i] = sc.nextInt();
			if (b[i] == -b[i]) {
				break;
			}
			for (int j = A; j >=0; j--) {
				System.out.println(b[i]);
			}
		}
	}
}
