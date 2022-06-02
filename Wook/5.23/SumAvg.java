// 사용자가 몇개의 정수를 입력할지 먼저 정한 후.
// 정수를 입력하면
// 합과 평균을 구해서 출력하는 프로그램.

// 짝수의 합, 평균
// 홀수의 합, 평균

import java.util.Scanner;

public class SumAvg{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// int sum = 0;  //(sum에 대한 변수 선언:합을 구할것이다.)
		// for (int i = 0; i < count; i++) {
			// //반복 시킨 이유: 여러번 입력하겠다.
			// System.out.println("점수?");
			// sum += scan.nextInt();
		// }
		
		// int sum = 0;
		
		// // 합에 대한 변수 선언, 갯수에 대한 변수선언, for문, 
		// System.out.println("몇개?");
		// int a = scan.nextInt();
		
		// for(int i = 0; i < a; i++) {
			// System.out.println("점수?");
			// int b = scan.nextInt();
			// sum += b;
		// }
		
		int sum2 = 0;
		int sum3 = 0;
		double count2 = 0;
		double count3 = 0;

		System.out.println("몇 번?");
		double count = scan.nextInt();
		
		int sum = 0;   
		for (int i = 0; i < count; i++) {
			System.out.println("점수?");
			int score = scan.nextInt();
			
			if(score % 2 == 0) {
				sum2 += score;
				count2++;
				
			} else {
				sum3 += score;
				count3++;
			}
			
		}
		
		System.out.println("홀수의 합: " + sum3);
		System.out.println("홀수의 평균: " + (sum3/count3));
		System.out.println("짝수의 합: " + sum2);
		System.out.println("짝수의 평균: " + (sum2/count2));
		System.out.println("전체의 합: " + (sum2 + sum3));
		System.out.println("전체의 평균: " + (sum2 + sum3) / count);
		

	}
}



		
		