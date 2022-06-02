// 사용자에게 국어, 영어, 수학 점수를 정수로 입력받아
// 총점과 평균점수를 출력하는 프로그램

//평균 총점 /과목수

import java.util.Scanner;

public class Mean{
	public static void main (String args[]){
		System.out.println("총점과 평균점수 구하기");
		
		Scanner mean = new Scanner(System.in);
		
		System.out.print("국어 점수: ");
		int kor = mean.nextInt();
		
		System.out.print("영어 점수: ");
		int eng = mean.nextInt();
		
		System.out.print("수학 점수: ");
		int math = mean.nextInt();
		
		int sum = kor + eng + math;
		int avg = sum / 3;
		
		System.out.println("총점"+ sum);
		System.out.println("평균"+ sum/3);
		
		/*System.out.println("총점: "+(kor + eng + math));
		System.out.println("평균: "+(kor + eng + math)/3);*/
	}
}