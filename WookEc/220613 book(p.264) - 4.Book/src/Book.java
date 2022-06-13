
public class Book {
	private String title;
	private int pageNum;
	private String author;
	
	public Book(String title, int pageNum, String author) {
		this.title = title;
		this.pageNum = pageNum;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String toString() {
		return "제목 : " + title + "  " + "작가 : " + author + "  " + "페이지 수 : " + pageNum;
	}
	
}
