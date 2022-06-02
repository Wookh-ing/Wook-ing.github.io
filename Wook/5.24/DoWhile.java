import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// while (false) {
			// //문장1
		// }
		System.out.println("10을 나눌 수 입력하세요");
		
		int num;
		do {
			num = scan.nextInt();
			if (num == 0) {
				System.out.println("0으로 나눌수 없음");
				
			}
		} while (num == 0);
		System.out.println(num / 10);
		
		// int num = scan.nextInt();
		// if (num == 0) {
			// System.out.println("0으로 나눌수 없음");
		// } else {
			// System.out.pritnln(10 / num)
		// }
		
	}
}