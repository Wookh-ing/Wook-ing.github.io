import java.util.Scanner;

// p237 1번

// p237 2번

// 기존에 작성하였던 학생관리 프로그램을 배열을 활용할수 있는 방법으로 수정해 보세요
public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] sit = new int[10];

		while (true) {
			System.out.println("좌석을 예약하겠습니까? (1 or 0)");
			int n = sc.nextInt();
			if (n == 1) {
				System.out.println("현재 예약상태는 다음과 같습니다.");
				System.out.println("-------------------------------");
				System.out.println("1, 2, 3, 4, 5, 6, 7, 8, 9, 10 ");
				System.out.println("-------------------------------");
				for (int i = 0; i < sit.length; i++) {
					System.out.print(sit[i] + ", ");
				}
				System.out.println();
				System.out.println("몇번째 좌석을 예약하시겠습니까?");
				int sitNum = sc.nextInt();
				sit[sitNum-1]++;
				if (sit[sitNum-1] > 1) {
					System.out.println("이미 선택된 좌석입니다. 다른좌석을 선택해 주세요.");
				}
			} else if (n == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("잘못입력하셨습니다. 다시입력해주세요.");
			} 
		} 
	}
}
