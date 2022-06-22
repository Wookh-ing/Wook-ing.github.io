import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

// 중국집 주문 가격 계산기

// 짜장면 : 2500
// 짬뽕 : 4000
// 볶음밥 : 4000
// 탕수육 : 10000
// 메뉴를 '추가'

// 계산 결과 출력 가능
public class Main3Last {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> map = new HashMap<>();
		map.put("짜장면", 2500);
		map.put("짬뽕", 4000);
		map.put("볶음밥", 4000);
		List<Integer> list = new ArrayList<>();
		int input = 0;
		boolean a = true;

		while (input != 3) {
			System.out.println();
			System.out.println("----------중국집 주문 가격 계산기----------");
			System.out.println();
			System.out.println("1. 주문하기");
			System.out.println("2. 메뉴 추가하기");
			System.out.println("3. 종료하기");
			input = sc.nextInt();
			while (input != 4) {
				if (input == 1) {
//					System.out.println("1. 더 주문하기, 2. 주문끝내기");
//					int input2 = sc.nextInt();
//				} else if (input == 2) {
//					break;
//				}
					System.out.println("어떤 메뉴를 주문하시겠습니까?");
					System.out.println(map);
					String menu = sc.next();
					System.out.println("몇개를 주문하시겠습니까?");
					int num = sc.nextInt();

					int total = map.get(menu) * num;
					list.add(total);
					int sum = 0;
					for (int i : list) {
						sum += i;
						System.out.println(sum);
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
	}
}
