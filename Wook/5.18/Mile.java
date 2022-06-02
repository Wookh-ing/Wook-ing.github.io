// 마일 변환
//1마일 1.609 킬로미터
// int x / double o 





import java.util.Scanner;

public class Mile {
	public static void main(String args[]){
		System.out.println("마일을 킬로미터로 변환");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("총 몇마일 입니까? : ");
		double mile = scan.nextDouble();
		
		System.out.println((mile * 1.609) + "km");
	}
}

		
		