// 학생 관리 프로그램
// 콘솔 입출력 <<Scanner
// 반에 학생을 등록. 최대 3명 << student1, student2, student3
// 이름 목록을 볼 수 있어야 하고 << student1 = 김정욱, student2 = 돌리, student3 = 도우너
// 평균을 볼 수 있고 << student1 avg1, student2 avg2, student3 avg3
// 1등 학생의 정보를 볼 수 있는 프로그램. potg
// 학생정보 3명 등록
// 
// 학생 등록
// 입력받아야 하는 값 : 몇반?,
// 입력 받았을때 나와야 하는 값 : 이름목록, 평균, 1등학생 정보(이름, 평균)

// 기존에 만들었던 클래스 << 수정. 수정을 해야하는 이유와 전 후가 어떻게 바뀌었는지 기록

import java.util.Scanner;

public class StudentManagement {
	private Class a;
	private Class b;
	private Class c;
	
	public StudentManagement(Class a, Class b, Class c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	private void printPrompt(String prompt) {
		System.out.println(prompt);
	}
	
	private String getUserInput() {
		Scanner s = new Scanner(System.in);
		return s.nextLine();
	}
	
	private boolean checkUserGuess() {
		if (a && b && c) {
			System.out.println("각 반 정보 출력");
		} else {
			System.out.println("반을 다시 입력해주세요.");
		}
	}
	
	public void startPlaying() {
			printPrompt("반을 입력하세요: ");
			a = getUserInput();
			RollDice();
			checkUserGuess();
			boolean result = checkUserGuess();
			if (result) {
				break;
			}
}
	
	
	
	
	
	
	
	
	
	
	
	/*public StudentManagement(Class a, Class b, Class c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	private void pirntPrompt(String prompt) {
		System.out.println(prompt);
	}
	
	private String getUserInput() {
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}*/
