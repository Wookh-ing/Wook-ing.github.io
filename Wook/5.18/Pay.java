//잔돈 계산
//부가세 10%



import java.util.Scanner;

public class Pay {
	public static void main (String args[]){
		
		System.out.println ("부가세와 잔돈 계산");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("받은 금액: ");
		int a = scan.nextInt();
		
		System.out.print("상품의 총액: ");
		int b = scan.nextInt();
		//double c = total * 0.1;

		System.out.println("부가세: " + (b / 10)); //c
		System.out.println("잔돈: " + (a - b));
		
	}
}