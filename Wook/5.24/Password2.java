import java.util.*;

public class Password2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ra = new Random();
		
		String answer = "1909";
		int s = 0;
		
		for (int i = 1; i <= 3; i++) {
			System.out.print("비밀번호를 입력하세요: ");
			String Pw = sc.nextLine();
			
			if(answer.equals(Pw)) {
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
