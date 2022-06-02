//사용자에게 초단위의 시간을 입력받아
//시간 분 초로 변환하는 프로그램

//입력예) 3666
//출력예) 1시간 1분 6초

// 3666초를 3666/60 =61...6
// 61/60 1...1
// 3666/3600 = 1...66
// 66/60 1...6

import java.util.Scanner;

public class Time{
	public static void main (String args[]){
		System.out.println("초를 시간 분 초로 변환");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("총 몇초인지 기입: ");
		int x = scan.nextInt();
		
		int 시간 = x/3600;
		int 분 = (x%3600)/60;
		int 초 = (x%60);
		
		System.out.println((시간) + "시간 " + (분) + "분 " + (초) + "초 ");
		
		//System.out.println((x/3600) + "시간 " + (x%3600)/60 + "분 " + (x%3600)%60 + "초 ");
	
	
		//System.out.println("시간: "+ (x/3600));
		//System.out.println("분: "+ (x%3600)/60);
		//System.out.println("초: "+ (x%3600)%60);
		
		
	}
}
		
		