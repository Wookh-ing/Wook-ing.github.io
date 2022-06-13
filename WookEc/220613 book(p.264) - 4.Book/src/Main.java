
public class Main {
	public static void main(String[] args) {
		Book b1 = new Book("책1", 999, "김정욱");
		Book b2 = new Book("책2", 998, "김욱");
		Book b3 = new Book("책3", 997, "김정");
		
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		System.out.println(b3.toString());
		
		Magazine m1 = new Magazine("잡1", 999, "김정욱", "2022-06-13");
		Magazine m2 = new Magazine("잡2", 999, "김정", "2022-07-13");
		Magazine m3 = new Magazine("잡3", 999, "김욱", "2022-08-13");
		
		System.out.println(m1.toString());
		System.out.println(m2.toString());
		System.out.println(m3.toString());
	}
}
