import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// 중국집 주문 가격 계산기

// 짜장면 : 2500
// 짬뽕 : 4000
// 볶음밥 : 4000
// 탕수육 : 10000
// 메뉴를 '추가'

// 계산 결과 출력 가능
public class Main3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> map = new HashMap<>();
		map.put("짜장면", 2500);
		map.put("짬뽕", 4000);
		map.put("볶음밥", 4000);

		int blackB = 0;
		int jjamB = 0;
		int rice = 0;
		int input = 0;
		while (input != 3) {
			System.out.println();
			System.out.println("----------중국집 주문 가격 계산기----------");
			System.out.println();
			System.out.println("1. 주문하기  -- 짜장면  | 짬뽕  | 볶음밥");
			System.out.println("2. 메뉴 추가하기");
			System.out.println("3. 종료하기");
			input = sc.nextInt();
			while (input != 4) {
				if (input == 1) {
					System.out.println("어떤 메뉴를 주문하시겠습니까?");
					System.out.println(map + "1. 짜장면, 2. 짬뽕, 3. 볶음밥, 4. 주문 완료");
					int menu = sc.nextInt();
					if (menu == 1) {
						blackB++;
					} else if (menu == 2) {
						jjamB++;
					} else if (menu == 3) {
						rice++;
					} else if (menu == 4) {
						System.out.println();
						System.out.println("짜장면: " + blackB + "개" 
					+ ", 짬뽕: " + jjamB + "개" + ", 볶음밥: " + rice + "개");
						System.out.println("--------------------");
						System.out.println("총 가격은: " + ((map.get("짜장면")* blackB)
								+ (map.get("짬뽕") * jjamB) + (map.get("볶음밥") * rice)));
						System.out.println("--------------------");
						break;
					} else {
						System.out.println("선택한 메뉴는 없습니다. 초기화면으로 돌아갑니다.");
						break;
					}
				} else if (input == 2) {
					System.out.println("추가할 메뉴를 입력하세요");
					String key = sc.next();
					System.out.println("메뉴의 가격을 입력하세요");
					int price = sc.nextInt();
					map.put(key, price);
					break;
					
				} else if (input == 3) {
					System.out.println("종료합니다.");
					break;
				}
			}
		}
		
//		while (true) {

//			String menu = sc.nextLine();

//			while (true) {
//				if (menu.equals("짜장면")) {
//					System.out.println(map.get("짜장면"));
//				}
//				else if (menu.equals("짬뽕")) {
//					System.out.println(map.get("짬뽕"));
//				}
//				else if (menu.equals("볶음밥")) {
//					System.out.println(map.get("볶음밥"));
//				}
//			}
//		}
	}
}
