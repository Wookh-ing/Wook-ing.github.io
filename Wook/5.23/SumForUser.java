import java.util.Scanner;

public class SumForUser {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//사용자가 범위를 지정. (시작 - 끝 입력)
		//합
		System.out.println("시작? 끝?");
		int start = scan.nextInt();
		int end = scan.nextInt();
		
		int sum = 0;
		for (int i = start; i <= end; i++){
			sum += i;
		}
		System.out.println(sum);
	}
}
		
		