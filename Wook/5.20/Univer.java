// 사용자의 학점
// 점수를 입력받아
// 90점 이상  A 
// 80점 이상 90점 미만 B
// 70점 이상 80점 미만 C
// 60점 이상 70점 미만 D
// 60점 미만 F

import java.util.Scanner;

public class Univer {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("사용자의 학점을 입력하세요.");
		int x = scan.nextInt();
		
		String Point;
		if (x >= 90) {
			Point = "A";
		} else if (x >= 80) {
			Point = "B";
		} else if (x >= 70) {
			Point = "C";
		} else if (x >= 60) {
			Point = "D";
		} else {
			Point = "F";
		}
		
		System.out.println("학점은: "+ Point);
	}
}