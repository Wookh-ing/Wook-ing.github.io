// 2. 사용자에게 3개의 정수를 입력받아 순서대로 입력된 수일 경우 true을 출력하세요. 나머지 경우는 fasle
// 예) 1 2 3 -> true, 4 5 6 -> true, 7 9 10 -> false

import java.util.Scanner;

public class Three {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println ("순서대로 입력된 수일 경우 true, 나머지는 false");
		
		System.out.print("3자리 정수: ");
		int a = scan.nextInt();
		int b = a/100;
		int c = a%100/10;
		int d = a%10;
		
		System.out.print(b + 1 == c && d - 1 ==c);
		
		
		//------------------------------------------
		
		
		// System.out.print("입력할 정수: ");
		// int x = scan.nextInt();
		
		// System.out.print("입력할 정수: ");
		// int y = scan.nextInt();
		
		// System.out.print("입력할 정수: ");
		// int z = scan.nextInt();
		
		//System.out.println(y-- == x || x++ == y || y++ == z);
	}
}
