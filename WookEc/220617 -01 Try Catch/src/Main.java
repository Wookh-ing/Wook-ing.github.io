import java.util.InputMismatchException;
import java.util.Scanner;

//		try {
////			프로그램 흐름 문장
////			예외가 발생할 것 같은 문장을 넣음
//		} catch (/*예외 타입*/) {
////			예외를 처리하는 문장
//		}

public class Main {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("왼쪽수 입력: ");
			int left = sc.nextInt();

			System.out.println("오른쪽수 입력: ");
			int right = sc.nextInt();
			if (right != 0) {
				System.out.println("나눈 몫: " + (left / right));
			} else {
				System.out.println("분모에 " + right + "을 입력할수 없습니다.");
			}
		} catch (InputMismatchException e){
			System.out.println("숫자를 입력해야 합니다.");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
//		예외가 발생한 부분을 캐치하고 있으면 안의 문장을 실행한후 캐치의 밖으로 나간다.

		System.out.println("프로그램 종료");
	}
}
