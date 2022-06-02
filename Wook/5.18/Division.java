//정수를 받아서 몫과 나머지로 출력하는 프로그램

import java.util.Scanner;

public class Division{
	public static void main(String[] args){
		System.out.println ("정수를 받아 몫과 나머지로 표시");
		
		Scanner scan  = new Scanner(System.in);
		
		/*System.out.print("큰수: ");
		int a = scan.nextInt();
		
		System.out.print("작은수: ");
		int b = scan.nextInt();
		
		int div = (a / b);
		int rem = (a % b);
		
		
		System.out.println("몫: " + (div));
		System.out.println("나머지: " + (rem));*/
		
		System.out.print("정수를 입력하시오: ");
		int large = scan.nextInt();
		
		System.out.print("정수를 입력하시오: ");
		int small = scan.nextInt();
		
		/*System.out.println(large + "을 " + small + "으로 나눈 몫은 " 
						  + (large / small) + "이고 나머지는 "
						  + (large % small) + "입니다");*/
		
		System.out.printf("%d을 %d으로 나눈 몫은 %d이고 나머지는 %d입니다."
						    , large, small, large / small, large % small);
							
		//System.out.printf("%dHello %dWorld%d\n" , 1, 2, 3);     
		// /n=> 개행문자  
		// %d => 정수하나가 오겠다 표시
		//System.out.printf("He%dllo Wo%drld", 4, 5);
	}
}
		