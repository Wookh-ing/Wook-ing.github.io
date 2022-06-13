// 학생
// 이름
// 나이
// 점수

// 이름 알려주기
// 점수 알려주기




// 작가
// 이름
// 나이
// 작품 목록

// 이름 알려주기
// 작품 목록 알려주기

// 사람 - 학생, 작가, 학생, 직원 ... 공통적인 특징이 사람이다. 
// 사람이 가진 특징(동작)을 상속해줄수 있다. 
// 예 이름, 나이 ... 
// 상속 - 상하 계층 구조를 가진 클래스 간 위의 클래스의 특징(행동)을 그대로 가져오는 것
// ex
// class abcClass

// class aClass extends abcClass


public class Main {
	public static void main(String[] args) {
		Person p = new Person("사람이름", 22);
		
		System.out.println(p.getName());
		System.out.println(p.getAge());
		
		Student s = new Student("학생이름", 17, 90);
		
		System.out.println(s.getName());
		System.out.println(s.getScore());
	
		
//		p.getScore();
		
		Author a = new Author("작가이름", 30, "반지의 길");
		
		System.out.println(a.getName());
		System.out.println(a.getAge());
		System.out.println(a.getBooklist());
	}
}
