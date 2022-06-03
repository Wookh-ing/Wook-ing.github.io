
// ------------------ 필드

public class ClassRoom {
	private Student stu1;
	private Student stu2;
	private Student stu3;
	// ------------------ 기본생성자
	// ------------------ 학생이 준비되지 않아도 학급을 만들기위해. 기본생성자를 만드는 이유.
	public ClassRoom() {}

	
	// ------------------ 학생 3명을 참조해줘야한다.
	public ClassRoom(Student stu1, Student stu2, Student stu3) {
		this.stu1 = stu1;
		this.stu2 = stu2;
		this.stu3 = stu3;
	}
	// ------------------ 학생들의 이름만 출력하는 생성자
	// ------------------ 여기서 getName()은 
	// ------------------ Student 클래스에서 얻어옴
	public void printNames() {
		System.out.println("1번 학생: " + stu1.getName());
		System.out.println("2번 학생: " + stu2.getName());
		System.out.println("3번 학생: " + stu3.getName());
	}
	
	// ------------------ 학생 3명의 평균점수
	// ------------------ 여기서 getAverage()은 
	// ------------------ Student 클래스에서 얻어옴
	public int getTotalAvg() {
		return (stu1.getAverage() + stu2.getAverage() 
		+ stu3.getAverage()) / 3;
	}
	
	// ------------------ 평균점수가 가장높은 학생출력
	public Student getTop() {
//		if (stu1.compare(stu2) && stu1.compare(stu3)) {
//			return stu1;
//		}
		
		 return max(max(stu1, stu2), stu3);
	}
	
	// ------------------ 평균점수가 가장 높은 학생을 찾는 식
	
	public Student max(Student left, Student right) {
		if (left.getAverage() >= right.getAverage()) {
			return left;
		} else {
			return right;
		}
	}
	
	// ------------------ getStu0의 getter/setter
	public Student getStu1() {
		return stu1;
	}

	public void setStu1(Student stu1) {
		this.stu1 = stu1;
	}

	public Student getStu2() {
		return stu2;
	}

	public void setStu2(Student stu2) {
		this.stu2 = stu2;
	}

	public Student getStu3() {
		return stu3;
	}

	public void setStu3(Student stu3) {
		this.stu3 = stu3;
	}
	
	

}
