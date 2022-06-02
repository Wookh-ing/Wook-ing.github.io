// 0부터 1씩 증가하는 수를 출력하기.
//사용자가 입력한 원하는 반복만큼만.
import java.util.Scanner;

public class Up {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		
		int b = 0;
		while (b < a) {
			System.out.println(b);
			b++;
		}
		// int b = 0;
		// while (b <= 100) {
			// System.out.printf("%d * %d = %d\n", a, b, a * b);
		// a++;}
	}
}
			
