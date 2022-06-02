//사용자가 3대 측정
// 벤치, 스쿼트, 데드
// 합이 500이상이면 true
// 그렇지 않으면 false

import java.util.Scanner;

public class UnderA {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("라잇웨잇 베베~");
		System.out.print("벤치: ");
		int x = scan.nextInt();
		
		System.out.print("스쿼트: ");
		int y = scan.nextInt();
		
		System.out.print("데드: ");
		int z = scan.nextInt();
		
		int sum = x + y + z;
		System.out.println("합: " + sum);
		
		boolean result = (sum >= 500);
		System.out.println(result);
		
		
	}
}