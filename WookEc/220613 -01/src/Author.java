
public class Author extends Person {
	private String booklist;
	
	public Author(String name, int age, String booklist) {
		super(name, age);
		this.booklist = booklist;
	}

	public String getBooklist() {
		return booklist;
	}
}
