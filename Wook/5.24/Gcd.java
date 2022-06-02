import java.util.*;

public class Gcd {
	public static void main(String[] args) {
		// int x = 0, y = 0, r = 0; // 나열할때 쉼표로 구분할수있다. 
		int x; // = 0  초기화 하는 법.
		int y;
		int r;
		System.out.print("두 개의 정수를 입력하시오(큰수, 작은수): ");
		Scanner scan = new Scanner(System.in);
		x = scan.nextInt();
		y = scan.nextInt();
		
		while (y != 0) {
			r = x % y;
			x = y;
			y = r;
		}
		System.out.printf("최대 공약수는 %d입니다.\n", x);
	}
}