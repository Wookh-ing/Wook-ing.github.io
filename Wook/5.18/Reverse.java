//숫자를 대입했을때 역순으로 표기
//ex) 123456 => 654321

import java.util.Scanner;

public class Reverse{
	public static void main (String [] args){
		System.out.println("역순으로 정리");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("배열할 단어: ");
		int Rev = scan.nextInt();
		int a = Rev/10000;
		int b = Rev%10000/1000;
		int c = Rev%1000/100;
		int d = Rev%100/10;
		int e = Rev%10;
		
		System.out.print("역순: " + e + d + c+ b + a ); // 문자가 안됨




/*public class Reverse{
	public static void main (String [] args){
		System.out.println("역순으로 정리");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("배열할 단어: ");
		String str = scan.nextLine();
		
		StringBuffer sb = new StringBuffer();
		sb.append(str);
		
		
		System.out.println("역순: "+ sb.reverse());
*/
		

/*public class Reverse{
	public static void main (String [] args){
		System.out.println("역순으로 정리");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("배열할 단어: ");
		String str = scan.nextLine();
		
		for (int i = str.length()-1; i>=0; i--){
			System.out.print(str.charAt(i));
*/

		}
	}



	
		
	