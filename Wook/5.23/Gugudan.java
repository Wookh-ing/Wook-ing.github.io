import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int input = scanner.nextInt();
		int a = 1;
		while(a <= 9) {
		System.out.printf("%d * %d = %d\n", input, a, input * a);
		a++;
		}
		
		// System.out.print("보고싶은 구구단"); =======실패
		// int b = scan.nextInt;
		// int c;
		
		// while(c <= 9) {
			// System.out.printf("%d * %d = %d\n", b, c, b * c);
			// c++;
		// }
		
		
		
		
		// while (a <= 100) {
			// if (a % 4 == 0) {
			// System.out.println(a);
			// }
			// a++;
			
	}
}
