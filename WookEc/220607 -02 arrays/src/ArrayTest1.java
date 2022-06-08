import java.util.Scanner;

public class ArrayTest1 {
	public static void main(String[] args) {
//		final int STUDENTS = 5;
//		int total = 0;
//		Scanner scanner = new Scanner(System.in);
//		
//		int[] scores = new int[STUDENTS];
//		for (int i = 0; i < STUDENTS; i++); {
//			System.out.println("성적입력: ");
//			scores[i] = scanner.nextInt();
//		}
//		for (int i = 0; i < STUDENTS; i++)
//			total += scores[i];
//		System.out.println("평균성적은" + total / STUDENTS + "입니다.");
		final int STUDENTS = 5;
		int total = 0;
		Scanner sc = new Scanner(System.in);
		
		int[] scores = new int[STUDENTS];
		for (int i = 0; i < STUDENTS; i++) {
			System.out.println("성적을 입력하세요: ");
			scores[i] = sc.nextInt();
		}
		for (int i = 0; i < STUDENTS; i++) 
			total += scores[i];
		System.out.println("평균 성적은: " + total / STUDENTS + "입니다.");
//		}
		
	}
}
