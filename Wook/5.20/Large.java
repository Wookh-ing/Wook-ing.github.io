// 3개의 정수를 입력받아
// 가장 큰 수를 출력하세요.

import java.util.Scanner;

public class Large {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		/*System.out.println("첫번째 정수를 입력하세요: ");
		int a = scan.nextInt();
		System.out.println("두번째 정수를 입력하세요: ");
		int b = scan.nextInt();
		System.out.println("세번째 정수를 입력하세요: ");
		int c = scan.nextInt();
		
		
		if (a > b && a > c) {
			System.out.print("가장 큰수: " + a);
		} 
		if (b > a && b > c) {  
			System.out.print("가장 큰수: " + b);
		} 
		
		if (c > a && c > b) {
			System.out.print("가장 큰수: " + c);
		}
		*/
		
		
		
		System.out.println("3개의 정수를 입력하세요: ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int max;
		if (a > b) {
			if(a > c) {
				max = a;
			} else {
				max = c;
			}
		} else {
			if (b > c) {
				max = b;
			} else {
				max = c;
			}
		}
		
		System.out.println("가장 큰 수는: " + max);
		
	}
}
		
		