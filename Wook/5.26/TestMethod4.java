import java.util.*;

public class TestMethod4 {
	// 정수 하나를 전달받아 1 ~ 100 사이의수이면 true을 반환하고, 그렇지 않으면 false를 반환하는 메소드 작성.
	public static boolean between(int number) {
		if (number >= 1 && number <= 100) {
		return true;
		} else {
		return false;
		}
	}
	
	
	public static void main(String[] args){
	// 사용자가 점수 입력을 국어, 영어, 수학 점수를 입력 하는데 (점주는 무조건 1 ~ 100사이)
	// 점수 합을 출력해 보세요.
	
	// 스캐너 입력
	Scanner sc = new Scanner(System.in);
	int kor;
	int math;
	int eng;
	do{
	// 국어점수 입력받기
	System.out.println("국어점수?");
	kor = sc.nextInt();
	// 국어점수 확인하기
	} while(!between(kor));	// 1.범위가 맞으면 다음, 2. 틀리면 다시.
	
	do{
	// 수학점수 입력받기
	System.out.println("수학점수?");
	math = sc.nextInt();
	// 수학점수 확인하기
	} while(!between(math)); // 1.범위가 맞으면 다음, 2. 틀리면 다시.
	
	do{
	// 영어점수 입력받기
	System.out.println("영어점수?");
	eng = sc.nextInt();
	// 영어점수 확인하기
	} while(!between(eng)); // 1.범위가 맞으면 다음, 2. 틀리면 다시.
	
	
	// 합 구하기
	int sum = kor + math + eng;
	
	// 국어 영어 수학 점수 출력하기
	System.out.println("국어점수: " + kor);
	System.out.println("수학점수: " + math);
	System.out.println("영어점수: " + eng);
	// 합 출력하기
	
	System.out.println("세과목 합" + sum);
	
		// System.out.println(between(150));
		// System.out.println(between(99));
		// System.out.println(between(-50));
		// System.out.println(between(100));
	}
}