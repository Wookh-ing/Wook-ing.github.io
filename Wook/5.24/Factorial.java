import java.util.*;

public class Factorial { // 차례곱 그 수보다 작거나 같은 모든 수의 곱
	public static void main(String[] args) {
		long fact = 1;
		int n;
		
		System.out.printf("정수를 입력하시오: ");
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		
		for (int i = 1; i <= n; i++)
			fact = fact * i;
		
		System.out.printf("%d!은 %d입니다.\n", n, fact);
	}
}