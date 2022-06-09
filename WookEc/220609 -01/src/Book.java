
public class Book {
	private String titleOfBook;
	private String writer;
	private String publisher;
	private String field;
	private int price;
	
	public Book(String titleOfBook, String writer, String publisher, String field, int price) {
		this.titleOfBook = titleOfBook;
		this.writer = writer;
		this.publisher = publisher;
		this.field = field;
		this.price = price;
	}
	
	public Book() {}

	public String getTitleOfBook() {
		return titleOfBook;
	}

	public void setTitleOfBook(String titleOfBook) {
		this.titleOfBook = titleOfBook;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	

	
	
	
	
	
}
