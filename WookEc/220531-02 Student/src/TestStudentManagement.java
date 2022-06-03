// 학생 관리 프로그램
// 콘솔 입출력 <<Scanner
// 반에 학생을 등록. 최대 3명 
// 이름 목록을 볼 수 있어야 하고
// 평균을 볼 수 있고 
// 1등 학생의 정보를 볼 수 있는 프로그램. 
// 학생정보 3명 등록
// 
// 학생 등록
// 입력받아야 하는 값 : 몇반?,
// 입력 받았을때 나와야 하는 값 : 이름목록, 평균, 1등학생 정보(이름, 평균)

// 기존에 만들었던 클래스 << 수정. 수정을 해야하는 이유와 전 후가 어떻게 바뀌었는지 기록

import java.util.Scanner;

public class TestStudentManagement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = 0;
		//
		int cnt = 0;
		//
		Student stuA = new Student();
		Student stuB = new Student();
		Student stuC = new Student();
		Class1 claA = new Class1(stuA, stuB, stuC);
		
		System.out.println("-학생 관리 프로그램-");
		while (input != 5) {
			System.out.printf("1.%s\n2.%s\n3.%s\n4.%s\n5.%s\n", "학생등록", "학생명부", "학생평균", "potg", "프로그램 종료");
			System.out.print("무엇을 실행하겠습니까: ");
			input = sc.nextInt();
			if (input == 1 && cnt < 3) {
				String name;
				int kor, eng, math;
				
				
				System.out.print(String.format("%d번 학생의 이름 입력 : ", cnt + 1));
                name = sc.next();
                System.out.print(String.format("%d번 학생의 국어 성적 입력 : ", cnt + 1));
                kor = sc.nextInt();
                System.out.print(String.format("%d번 학생의 영어 성적 입력 : ", cnt + 1));
                eng = sc.nextInt();
                System.out.print(String.format("%d번 학생의 수학 성적 입력 : ", cnt + 1));
                math = sc.nextInt();
				/*
				System.out.printf("%d번 학생의 이름 입력 : ", cnt + 1);
				name = sc.nextLine();
				System.out.printf("%d번 학생의 국어 성적 입력 : ", cnt + 1);
				kor = sc.nextInt();
				System.out.printf("%d번 학생의 영어 성적 입력 : ", cnt + 1);
				kor = sc.nextInt();
				System.out.printf("%d번 학생의 수학 성적 입력 : ", cnt + 1);
				kor = sc.nextInt();
				*/
				
				// 학생 등록 메소드 호출
				claA.setStu(cnt, name, kor, eng, math);
				cnt++;
			} else if (input == 2) {
				claA.printName();
			} else if (input == 3) {
				claA.printAvg();
			} else if (input == 4) {
				claA.printPotg();
			} else if (input == 5) {
				System.out.println("시스템 종료");
			} else if (cnt >= 3) {
                System.out.println("학생의 정원을 초과하였습니다.");
            } else {
				System.out.println("입력오류, 다시입력하세요.");
			}
		}
	}
}

		/*while (input != 5) {
			System.out.println("학생 관리 프로그램");
			System.out.printf("1.%s\n2.%s\n3.%s\n4.%s\n5.%s\n", "학생등록", "학생명부", "학생평균", "potg", "프로그램 종료");
			System.out.print("무엇을 실행하겠습니까: ");
			input = sc.nextInt();

			if (input == 1) {
				// for (int i = 0; i < 3; i++) {
				System.out.print("학생이름: ");
				String name = sc.next();
				System.out.print("국어성적: ");
				int kor = sc.nextInt();
				System.out.print("영어성적: ");
				int eng = sc.nextInt();
				System.out.print("수학성적: ");
				int math = sc.nextInt();
				// }
				Student stu1 = new Student(name, kor, eng, math);
				
			} else if (input == 2) {
				System.out.println("학생 명부");

			} else if (input == 3) {
				System.out.println("학생 평균 성적");
			} else if (input == 4) {
				System.out.println("potg");
			} else if (input == 5) {
				System.out.println("프로그램을 종료합니다.");
			} else {
				System.out.println("잘못된 입력입니다.");
			}

		}

	}

}*/
