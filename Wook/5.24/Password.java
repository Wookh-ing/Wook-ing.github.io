// 사용자에게 비밀번호를 물어보고 동일할 경우 통과
// 최대 3번의 기회를 줌

import java.util.*;

public class Password {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ra = new Random();
		
		
		String answer = "1909";
		int s = 0;
		// boolean answer = false;
		
		for (int i = 1; i <= 3; i++){
			System.out.print("비밀번호를 입력하세요: ");
			String PW = sc.nextLine();
			
			if(answer.equals(PW)) {
				s++;
				break;
			} else {
				continue;
			}
		}
		if (s == 1) {
			System.out.print("로그인 성공");
		} else {
			System.out.print("로그인 실패");
		}
	}
}
			
			     //equals
			



		// int answer = ra.nextInt(9000) + 1000;
		// int guess;
		
		
		// // System.out.println("비밀번호를 입력해주세요.");
		// while (true) {
			// System.out.println("비밀번호 입력:" );
			// int guess = scan.nextInt();
			// answer = a;
			
			// if(a != user){
				// break;
				// }
			// }
		// System.out.println("종료");
		
		
		
		// int answer = 0;
		// int count = 0;
		
		// for(int i = 0; i < 3; i++){
			// if (i == 3)
			// break;
		// }
		// System.out.println("종료");
		
		