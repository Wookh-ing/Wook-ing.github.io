import java.util.*;

public class Student2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name = "김정욱";
		int kor = 90;
		int eng = 80;
		int math = 70;
		int sum = (kor + eng + math);
		int avg = sum / 3;
		
		System.out.println("이름: " + name);
		System.out.println("국어점수: " + kor);
		System.out.println("영어점수: " + eng);
		System.out.println("수학점수: " + math);
		System.out.println("평균: " + avg);
		
		// System.out.println("이름: ");
		// sc.nextLine();
		
		// System.out.println("국어점수: ");
		// sc.nextInt();
		
		// System.out.println("영어점수: ");
		// sc.nextInt();
		
		// System.out.println("수학점수: ");
		// sc.nextInt();
		
		// System.out.println("평균: " + avg);
		
		
	}
}