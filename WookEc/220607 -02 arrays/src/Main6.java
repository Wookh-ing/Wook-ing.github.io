// 사용자가 0 이하의 정수를 입력할 때 까지 반복하여 입력
// 최근 5개를 출력

// 10 20 30 40 50 60 70 80 90 100 -1 -> 100 90 80 70 60

import java.util.Scanner;

public class Main6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int LENGTH = 5;
		int[] arr = new int[LENGTH];
		
		int i = 0;
		System.out.println("정수를 입력해주세요, 종료하려면 음수를 입력하세요");
		
		while (true) {
			int n = sc.nextInt();
			if (n <= 0) {
				break;
			}
			arr[i] = n;
			i++;
			if(i == LENGTH) {
				i = 0;
			}
		}
		sc.close();
		for(i = LENGTH-1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
	}
}
// int i = FIVE-1; i >= 0; i--
//		while (true) {
//			System.out.println("정수를 입력해주세요, 종료하려면 음수를 입력하세요");
//			{
//				int num = sc.nextInt();
//				if (num < 0) {
//					System.out.println("음수를 입력하였으므로 프로그램을 종료합니다.");
//					break;
//				}
//
//			}
//		}

