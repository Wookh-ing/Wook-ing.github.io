// 1번
// 책 클래스 (class book)
// 필드(상태) : 제목(title), 저자(author)
// 메소드(기능) : 제목과 저자를 콜솔에 출력 가능(printAll)

public class TBook {
	String title;
	String author;
	
	void printAll() { // void 위치는 프로그램 흐름에서 내용을 받을거냐 아니냐를 결정
		System.out.println("제목: " + title + " , " + "저자: " + author);
	}
}