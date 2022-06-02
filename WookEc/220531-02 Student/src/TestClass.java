import java.util.Scanner;

public class TestClass {

	public static void main(String[] args) {
		Student student1 = new Student("김정욱", 100, 100, 100);
		int avg1 = student1.getAverage();
		String name1 = student1.getName();

		Student student2 = new Student("돌리", 100, 100, 100);
		int avg2 = student2.getAverage();
		String name2 = student2.getName();

		Student student3 = new Student("도우너", 70, 0, 60);
		int avg3 = student3.getAverage();
		String name3 = student3.getName();

		Class tc = new Class(student1, student2, student3);
		// 1반 학생의 이름
		tc.printName();
		// 1반 학생 각각의 평균(이름순)
		tc.printAvg();
		// 1반 학생의 평균
		System.out.println(tc.avgAll());

		tc.potg();
		System.out.printf("학생 관리 프로그램\n1.%d\n2.%d\n3.\n4.\n","학생등록", "학생명부", "학생평균", "potg");
		
		
		//
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*Class c1 = new Class("김정욱", 90, 80, 70);
		Class c2 = new Class("김김김", 100, 100, 100);
		Class c3 = new Class("정정정", 100, 100, 100);
		
		String name1 = c1.getName();
		String name2 = c2.getName();
		String name3 = c3.getName();
		
		int avg1 = c1.getSum() / 3;
		int avg2 = c2.getSum() / 3;
		int avg3 = c3.getSum() / 3;
		int avg4 = (avg1 + avg2 + avg3) / 3;
		
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
		System.out.println("김정욱 평균:" + avg1);
		System.out.println("김김김 평균:" + avg2);
		System.out.println("정정정 평균:" + avg3);
		
		System.out.println("총 평균: " + avg4);
		
		if (avg1 >= avg2 && avg1 >= avg3) {
			System.out.println(name1);
		} else if (avg2 >= avg1 && avg2 >= avg3) {
			System.out.println(name2);
		} else {
			System.out.println(name3);
		}*/
		
		
		
		
		
		
		

	}

}
