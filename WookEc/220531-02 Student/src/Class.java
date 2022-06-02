// 학생 관리 프로그램
// 콘솔 입출력
// 반에 학생을 등록. 최대 3명
// 이름 목록을 볼 수 있어야 하고
// 평균을 볼 수 있고
// 1등 학생의 정보를 볼 수 있는 프로그램.

// 기존에 만들었던 클래스 << 수정. 수정을 해야하는 이유와 전 후가 어떻게 바뀌었는지 기록




// 학급 (반)
// 학생
// 학생
// 학생

// 1. 3명의 학생의 이름을 콘솔에 출력할 수 있음.
// 2. 학생 3명의 평균의 평균을 알려줄 수 있음.
// 3. 평균점수가 가장 높은 학생(참조)을 알려줄 수 있음. => 동일점수.
import java.util.Scanner;

public class Class {
	private Student a;
	private Student b;
	private Student c;

	public Class(Student a, Student b, Student c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	

	public int avgAll() {
		System.out.println("총 평균점수");
		int sum = a.getAverage() + b.getAverage() + c.getAverage();
		return (sum / 3);
	}

	void printName() {
		System.out.println("A반 학생의 이름");
		System.out.println(a.getName());
		System.out.println(b.getName());
		System.out.println(c.getName());
	}

	void printAvg() {
		System.out.println("A반 학생 각각의 평균(이름순)");
		System.out.println(a.getAverage());
		System.out.println(b.getAverage());
		System.out.println(c.getAverage());
	}
	
	

	void potg() {
		System.out.println("potg");

		if (a.getAverage() >= b.getAverage() && a.getAverage() >= c.getAverage()) {
			System.out.println(a.getName());
			System.out.println(a.getAverage());

		} else if (b.getAverage() >= c.getAverage()) {
			System.out.println(b.getName());
			System.out.println(b.getAverage());

		} else {
			System.out.println(c.getName());
			System.out.println(c.getAverage());

		}
	}
	///////////////////////////////////////
	void printAvg2() {
		System.out.println("A반 학생 각각의 평균(이름순)");
		System.out.println(a.getName() + "\t" + a.getAverage());
		System.out.println(b.getName() + "\t" + b.getAverage());
		System.out.println(c.getName() + "\t" + c.getAverage());
	}
}

