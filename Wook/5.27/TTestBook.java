// 1번
// 책 클래스 (class book)
// 필드(상태) : 제목(title), 저자(author)
// 메소드(기능) : 제목과 저자를 콜솔에 출력 가능(printAll)

public class TTestBook {
	public static void main(String[] args) {
		
		TBook book1;
		book1 = new TBook();
		// Tbook book1 = new Tbook();
		
		book1.title = "노르웨이숲";
		book1.author = "무라카미 하루키";
		
		book1.printAll();
		
		book1.title = "상실의 시대";
		book1.author = "무라카미 하루키";
		
		book1.printAll();
		
		// System.out.println(book1.title);
	}
}