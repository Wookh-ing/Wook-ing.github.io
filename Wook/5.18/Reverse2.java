import java.util.Scanner;

public class Reverse2{
	public static void main (String [] args){
		System.out.println("역순으로 정리");
		Scanner scan = new Scanner(System.in);
		
		System.out.print("배열할 단어: ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		int e = scan.nextInt();
		

		
		
		System.out.print("역순: " + e + d + c + b + a ); // 문자가 안됨
	}
}