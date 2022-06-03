import java.util.*;

public class StudentManage {
	private ClassRoom room;
	
	
	public Student inputStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생의 정보. 이름, 국영수 순으로 입력.");
		String name = sc.nextLine();
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();
		
		return new Student(name, kor, eng, math);
	}
	
	public void start() {
		Student stu1 = inputStudent();
		Student stu2 = inputStudent();
		Student stu3 = inputStudent();
		
		room = new ClassRoom(stu1, stu2, stu3);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("메뉴");
		System.out.println("1.학생 이름 보기 2. 총 평균 보기 3. 1등 보기");
		int number = sc.nextInt();
		
		if (number == 1) {
			room.printNames();
		} else if (number == 2) {
			System.out.println("총 평균: " + room.getTotalAvg());
		} else if (number == 3) {
			Student top = room.getTop();
			System.out.println(top.getName());
			System.out.println(top.getAverage());
		}
	}
}
