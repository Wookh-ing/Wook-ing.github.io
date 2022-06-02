import java.util.*;

public class TestMax {
	public static int max(int left, int right) {
		return left > right ? left : right; //삼항연산자. ?앞의 항이 true = left, false = right
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 3개의 정수중 가장 큰 값 구하기
		System.out.println("정수입력: ");
		int a = scan.nextInt();
		System.out.println("정수입력: ");
		int b = scan.nextInt();
		System.out.println("정수입력: ");
		int c = scan.nextInt();
		// 4개
		System.out.println("정수입력: ");
		int d = scan.nextInt();
		// 5개
		System.out.println("정수입력: ");
		int e = scan.nextInt();
		
		System.out.println("가장 큰 수는: " + max(e, max(d, max(c, max(a,b)))));
	}
}