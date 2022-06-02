import java.util.*;

public class TestMethod5 {
	// 정수 하나를 전달받아 1 ~ 100 사이의수이면 true을 반환하고, 그렇지 않으면 false를 반환하는 메소드 작성.
	public static boolean between(int number) {
		if (number >= 1 && number <= 100) {
		return true;
		} else {
		return false;
		}
	}
	
	
	// public static boolean kor(int k){
		// Scanner sc = new Scanner(System.in);
		// if (k > 100 && k < 0) {
			// return false;
		// } else {
			// return true;
		// }
		// System.out.println("국어점수: ");
	// }
		
	// public static boolean math(int m){
		// Scanner sc = new Scanner(System.in);
		// if (m > 100 && m < 0) {
			// return false;
		// } else {
			// return true;
		// }
		// System.out.println("수학점수: ");
	// }
		
	// public static boolean eng(int e){
		// Scanner sc = new Scanner(System.in);
		// if (e > 100 && e < 0) {
			// return false;
		// } else {
			// return true;
		// }
		// System.out.println("영어점수: ");
	// }
	
	
	// 사용자가 점수 입력을 국어, 영어, 수학 점수를 입력 하는데 (점주는 무조건 1 ~ 100사이)
	// 점수 합을 출력해 보세요.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어점수: ");
		int kor = sc.nextInt();
		
		System.out.println("수학점수: ");
		int math = sc.nextInt();
		
		System.out.println("영어점수: ");
		int eng = sc.nextInt();
		
		int sum = kor + math + eng;
		
		if( kor <= 100 && kor >= 0) {
		
		} else {
			System.out.println("다시 입력해주세요.");
		}
		if (math <= 100 && math >= 0){
		
		} else {
			System.out.println("다시");
		}
		if (eng <= 100 && eng >= 0){
		
		} else {
			System.out.println("다시");
		}
		
		System.out.println("점수의 합은: " + sum);
	
		

		// System.out.println(between(150));
		// System.out.println(between(99));
		// System.out.println(between(-50));
		// System.out.println(between(100));
	}
}