
public class Magazine extends Book{
	private String releaseDate;

	public Magazine(String title, int pageNum, String author, String releaseDate) {
		super(title, pageNum, author);
		this.releaseDate = releaseDate;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	@Override
	public String toString() {
		return super.toString() + "  "+ "발매일 : " + getReleaseDate();
	}
}
