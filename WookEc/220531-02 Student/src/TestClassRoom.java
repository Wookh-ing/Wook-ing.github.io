
public class TestClassRoom {
	public static void main(String[] args) {
		Student student1 = new Student("홍길동", 100, 100, 100);
		Student student2 = new Student("홍길동", 100, 100, 100);
		Student student3 = new Student("홍길동", 100, 100, 100);
			
		ClassRoom room = new ClassRoom(
				student1,
				student2,
				student3);
		
		// System.out.println(room.getStu1().getName());
		room.printNames();
		
		int avg = room.getTotalAvg();
		System.out.println(avg);
		
		Student top = room.getTop();
		System.out.println("1등: " + top.getName());
	}

}
