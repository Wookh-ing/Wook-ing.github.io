import java.util.*;

public class Password3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ra = new Random();
		
		String pw = "1909";
		
		boolean isCheck = false;
		
		for (int i = 1; i <= 3 && !isCheck; i++) {
			System.out.print("Password를 입력하세요: ");
			String Pass = sc.nextLine();
			
			if (pw.equals(Pass)) {
				isCheck = true;
			}
		}
		if (isCheck) {
			System.out.print("로그인 성공");
		} else {
			System.out.print("로그인 실패");
		}
	}
}

/* Do While 

int count = 3;
boolean isCheck = false;
String Pass;
do {
	System.out.println("비밀번호를 입력하세요");
	Pass = scan.nextLine();
	count--;
	System.out.println("현재 카운트값 확인 :" + count);
	isCheck = pw.equals(Pass);
} while (!isCheck && count > 0);

if (isCheck) {
	System.out.print("로그인 성공");
	} else {
	System.out.print("로그인 실패");
	}
*/