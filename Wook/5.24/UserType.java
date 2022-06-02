// 2 ~ 9 까지의 무작위를 수정하여
// 사용자가 해당하는 수의 배수를 순서대로 입력하게 하여
// 틀릴 경우 종료

//예> 랜덤수치가 6일경우

// 사용자 입력하게
// 6 o;
//12 0;
//18 0;
//21 0;

import java.util.Scanner;
import java.util.Random;

public class UserType {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		int a = random.nextInt(8) + 2; //0부터 숫자 생성하기때문에 0~7 의 값에 2를 더한다
		
		System.out.println(a + "의 배수를 순서대로 입력하세요.");

		int answer = 0;
		while (true) {
			answer += a;
			int user = scan.nextInt();
			
			if (answer != user) {
				break;
			}
		}
		System.out.println("종료");
	}
}
		
		// int a = random.nextInt(10); // random 안에 들어가는 값은 갯수표시 (0부터 시작)
		// {
		// if ( a <= 1 ) {
			// a = +2;
		// }
		// System.out.println(a);
		// ////////////////////// 랜덤한 a의 값을 도출. 
		// do {
			// System.out.println("랜덤수의 배수를 순서대로 입력하세요.");
			// guess = scan.nextInt();
			
			// if (guess == a + a) {
				// System.out.println("O");
				
			// if (guess != a + a) {
				// System.out.println("X");
					
				
			