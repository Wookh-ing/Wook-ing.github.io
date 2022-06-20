import java.util.Scanner;

public class ascii {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("알파벳을 입력해주세요");
		char alpa = sc.nextLine().charAt(0);
		int ialpa = (int)alpa;
			
		System.out.println(ialpa);
	}
}
