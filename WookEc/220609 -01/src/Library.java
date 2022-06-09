
public class Library {
	private Book[] books = new Book[5];
	
	public Library() {}
	
	public Library(Book... books) {
		this.books = books;
	}
	
	public void printChart() {
		for (int i = 0; i < books.length; i++) {
			System.out.println((i + 1) + ".");
		}
	}
	
	public void printBook() {
		for (int i = 0; i < books.length; i++) {
			System.out.println((i + 1) + "." + books[i].getTitleOfBook() + "/" + books[i].getWriter() + "/" + books[i].getPublisher() + "/" + books[i].getField() + "/" + books[i].getPrice());			
		}
	}
	
//	public int ascendingPrice() {
//		for (int i = 0; i < books.length; i++) {
//			for(int j = i+1; j <books.length; i++) {
//				if (books[i] > books[j]) {
//					
//				}
//			}
//		}
//	}
	
	public void descendingPrice() {
		for (int i = 0; i < books.length; i++) {
			
		}
	}
	
	public void printNovel() {
		for (int i = 0; i < books.length; i++) {
			if (books[i].getField() == "장편소설") {
				System.out.println(books[i].getTitleOfBook() + "/" + books[i].getWriter() + "/" + books[i].getPublisher() + "/" + books[i].getField() + "/" + books[i].getPrice());
			}
		}
	}
	
	public void printMarriage() {
		for (int i = 0; i < books.length; i++) {
			if (books[i].getField() == "시집") {
				System.out.println(books[i].getTitleOfBook() + "/" + books[i].getWriter() + "/" + books[i].getPublisher() + "/" + books[i].getField() + "/" + books[i].getPrice());
			}
		}
	}
	
	public void printStudy() {
		for (int i = 0; i < books.length; i++) {
			if (books[i].getField() == "학문") {
				System.out.println(books[i].getTitleOfBook() + "/" + books[i].getWriter() + "/" + books[i].getPublisher() + "/" + books[i].getField() + "/" + books[i].getPrice());
			}
		}
	}
	public void printEssay() {
		for (int i = 0; i < books.length; i++) {
			if (books[i].getField() == "에세이") {
				System.out.println(books[i].getTitleOfBook() + "/" + books[i].getWriter() + "/" + books[i].getPublisher() + "/" + books[i].getField() + "/" + books[i].getPrice());
			}
		}
	}
	
	public void printAll() {
		System.out.println("----------");
		for (int i = 0; i < books.length; i++) {
			System.out.println("제목 : " + books[i].getTitleOfBook());
			System.out.println("저자 : " + books[i].getWriter());
			System.out.println("출판사 : " + books[i].getPublisher());
			System.out.println("분야 : " + books[i].getField());
			System.out.println("가격 : " + books[i].getPrice() + "원");
			System.out.println("");
		}
		System.out.println("----------");
	}
	
}
