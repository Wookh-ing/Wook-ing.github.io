import java.util.Scanner;

/*
 * 도서 관리 프로그램
 * 목록보기
 * 1. 가격순으로(오름차순, 내림차순 선택가능)
 * 2. 분야를 선택해서 해당 분야만 보기
 * 
 * 
*/

// 1. 작별인사 					 / 김영하 / 복복서가 / 장편소설 / 12,600원
// 2. 불편한 편의점					 / 김호연 / 나무옆의자 / 장편소설 / 12,600원
// 3. 지금 알고 있는 걸 그때도 알았더라면    / 류시화 / 열림원 / 시집 / 8,100원
// 4. 코스모스 					 / 칼 세이건 / 사이언스북스 / 과학공학 / 16,650원 
// 5. 여행의 이유 					 / 김영하 / 문학동네 / 에세이 / 12,150원

// -----
// 3. 상세보기
// 4. 도서 정보 수정
// 5. 도서 정보 추가
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Book[] booklist  = new Book[5];
		Book book1 = new Book("작별인사", "김영하", "복복서가", "장편소설", 12600);
		Book book2 = new Book("불편한 편의점", "김호연", "나무옆의자", "장편소설", 12600);
		Book book3 = new Book("지금 알고 있는 걸 그때도 알았더라면", "류시화", "열림원", "시집", 8100);
		Book book4 = new Book("코스모스", "칼 세이건", "사이언스북스", "학문", 16650);
		Book book5 = new Book("여행의 이유", "김영하", "문학동네", "에세이", 12150);

		booklist[0] = book1;
		booklist[1] = book2;
		booklist[2] = book3;
		booklist[3] = book4;
		booklist[4] = book5;

		Library lib = new Library(booklist[0], booklist[1], booklist[2], booklist[3], booklist[4]);

		int input;
		int input2;
		while (true) {
			System.out.println("도서관리 프로그램");
			System.out.println("1. 가격순  2. 분야별  3. 상세보기  4. 도서정보수정  5. 도서정보추가  6. 프로그램 종료");
			input = sc.nextInt();
			if (input == 1) {
				System.out.println("1* 가격순 보기(1.오름차순, 2.내림차순)");
				input = sc.nextInt();
				if (input == 1) {
					for (int i = 0; i < booklist.length; i++) {
						for (int j = i + 1; j < booklist.length; j++) {
							if (booklist[i].getPrice() > booklist[j].getPrice()) {
								Book tmep = booklist[i];
								booklist[i] = booklist[j];
								booklist[j] = tmep;
							}
						}
					}
					System.out.println("오름차순 정렬");
					System.out.println("----------");
					for (int i = 0; i < booklist.length; i++) {
						
						System.out.println(booklist[i].getTitleOfBook()  + " " + booklist[i].getPrice() + "원");
					}
					System.out.println("----------");
					
				} else if (input == 2) {
					for (int i = 0; i < booklist.length; i++) {
						for (int j = i + 1; j < booklist.length; j++) {
							if (booklist[i].getPrice() < booklist[j].getPrice()) {
								Book tmep = booklist[i];
								booklist[i] = booklist[j];
								booklist[j] = tmep;
							}
						}
					}
					System.out.println("내림차순 정렬");
					System.out.println("----------");
					for (int i = 0; i < booklist.length; i++) {
						
						System.out.println(booklist[i].getTitleOfBook()  + " " + booklist[i].getPrice() + "원");
					}
					System.out.println("----------");
				} else {
					System.out.println("다시 입력해 주세요.");
				}
			} else if (input == 2) {
				System.out.println("2** 선택 분야만 보기 (1.장편소설, 2.시집, 3.학문, 4.에세이)");
				input2 = sc.nextInt();
				if (input2 == 1) {
					System.out.println("장편소설");
					System.out.println("----------");
					lib.printNovel();
					System.out.println("----------");
					
				} else if (input2 == 2) {
					System.out.println("시집");
					System.out.println("----------");
					lib.printMarriage();
					System.out.println("----------");
					
				} else if (input2 == 3) {
					System.out.println("학문");
					System.out.println("----------");
					lib.printStudy();
					System.out.println("----------");
					
				} else if (input2 == 4) {
					System.out.println("에세이");
					System.out.println("----------");
					lib.printEssay();
					System.out.println("----------");
					
				} else {
					System.out.println("다시 입력하세요.");
				}
			} else if (input == 3) {
				System.out.println("3*** 상세보기");
				lib.printAll();
			} else if (input == 4) {
				System.out.println("4**** 도서 정보 수정");
				System.out.println("수정할 책의 제목을 입력하세요: ");
				String bName = sc.next();		
				for (int i = 0; i < booklist.length; i++) {
					if (booklist[i].getTitleOfBook().equals(bName)) {
						System.out.println("도서를 변경합니다.");
						System.out.println("수정할 책의 제목: ");
						String title = sc.next();
						booklist[i].setTitleOfBook(title);
						System.out.println("수정할 책의 저자: ");
						String writer = sc.next();
						booklist[i].setWriter(writer);
						System.out.println("수정할 책의 출판사: ");
						String publisher = sc.next();
						booklist[i].setPublisher(publisher);
						System.out.println("수정할 책의 분야: ");
						String field = sc.next();
						booklist[i].setField(field);
						System.out.println("수정할 책의 가격: ");
						int price = sc.nextInt();
						booklist[i].setPrice(price);
						
					} 
				} System.out.println("잘못입력했습니다.");
				
			} else if (input == 5) {
				System.out.println("5***** 도서 정보 추가");
				
			} else if (input == 6) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("다시 입력하세요.");
			}
				
		}
	}
}

