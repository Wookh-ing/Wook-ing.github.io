// 저금통
//10원 , 50원, 100원, 500원
// 액수 계산, 사용자가 동전의 개수 입력

import java.util.Scanner;

public class Coin {
	public static void main (String args[]){
		System.out.println("배가르는맛에 채우지");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("500원: "); // 변수의 이름은 숫자로 시작할수 없다.
		int FiveH = scan.nextInt();
		
		System.out.print("100원: ");
		int OneH = scan.nextInt();
		
		System.out.print("50원: ");
		int fiveT = scan.nextInt();
		
		System.out.print("10원: ");
		int T = scan.nextInt();
		
		int sum = FiveH * 500 + OneH * 100 + fiveT * 50 + T * 10; 
		
		System.out.println("총액: " + (sum) + " 원");
		
		//System.out.println("총액: " + (FiveH*500 + OneH*100 + fiveT*50 + T*10 )+ " 원");
		
	}
}