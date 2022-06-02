import java.util.Scanner;

public class Divisior {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("약수로 나타낼 수를 입력하세요.");
		int num = scan.nextInt();

		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0){
				System.out.println(i);
				count++;
			}
		}
		System.out.println("약수 개수: " + count);
	}
}