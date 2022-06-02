import java.util.Scanner;

public class TestStudentManagement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = 0;
		while (input != 5) {
			System.out.println("학생 관리 프로그램");
			System.out.printf("1.%s\n2.%s\n3.%s\n4.%s\n5.%s\n","학생등록", "학생명부", "학생평균", "potg", "프로그램 종료");
			System.out.println("무엇을 실행하겠습니까: ");
			sc.nextInt(input);
			
			if (input == 1) {
				System.out.println("학생이름: ");
				System.out.println("학생성적: ");
			} else if (input == 2) {
				System.out.println("학생 명부");
			} else if (input == 3) {
				System.out.println("학생 평균 성적");
			} else if (input == 4) {
				System.out.println("potg");
			} else if (input == 5) {
				System.out.println("프로그램을 종료합니다.");
			}
			break;
		}
		
	}
}