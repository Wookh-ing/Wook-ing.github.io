// 사용자의 나이와 이름을 입력받아서
// 자기랑 같으면 true 출력하기

import java.util.Scanner;

public class Age {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("나이를 입력: ");
		int age = scan.nextInt();
		System.out.println("이름을 입력: ");
		scan.nextLine();
		String name = scan.nextLine();
		
		
		System.out.println((age == 26) && name.equals("김정욱"));
		
		
	}
}
