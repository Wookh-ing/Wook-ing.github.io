public class TestStudent {
	public static void main(String[] args) {
		Student s = new Student("김정욱", 90, 80, 60);
		s.printAll();
		
		Student s2 = new Student("김정정", 60, 55, 33);
		s2.printAll();
	}
}