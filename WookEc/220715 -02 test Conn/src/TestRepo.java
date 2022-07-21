import java.sql.SQLException;
import java.util.List;

public class TestRepo {
	public static void main(String[] args) {
		BooksRepository repo = new BooksRepository();
		
		int result;
		try {
//			result = repo.add(new Book("테스트용 책44444", 50000));
//			System.out.println("추가 : " + (result == 1));
			
//			List<Book> list = repo.list();
//			System.out.println(list);
			
//			Book book = repo.selectByTitle("zzzz");
//			System.out.println(book);
			
			result = repo.update(new Book(8, "테스트용 책2w", 50000));
			System.out.println(result == 1);
//			
//			Book book = repo.selectByTitle("테스트용 책");
//			System.out.println(book);
		} catch (SQLException e) {
//			e.getMessage();
			System.out.println(e.getMessage());
		}
	}
}
