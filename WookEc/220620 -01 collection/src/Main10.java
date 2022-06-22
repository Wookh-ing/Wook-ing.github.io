import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<String> list = new ArrayList<>(Arrays.asList("사과", "포도", "오랜지", "배", "수박"));

		List<String> listAdd = new ArrayList<>(Arrays.asList());
		
			while (true) {
				System.out.println("----------과일----------");
				System.out.println("1. 과일목록,  2. 과일주기(선입선출), 3. 재고과일 추가(마지막)");
				System.out.println("무엇을 실행하겠습니까?");
				int input = sc.nextInt();
				switch (input) {
				case 1:
					System.out.println(list.toString());
					break;
					
				case 2:
					Iterator<String> iterator = list.iterator();
					for (int i = 0; i < list.size(); i++) {
						iterator.hasNext();
					}
					System.out.println(iterator.next());
					iterator.remove();
					System.out.println("과일을 받습니다.");
					break;
					
				case 3: 
					System.out.println("추가할 과일을 입력하세요: ");
					String fruit1 = sc.nextLine();
					for (int i = 5; i < 11; i++) {
						list.add(i, fruit1);
					}
				}
				
				String fruit = sc.nextLine();
			}
		
		// 콘솔 입출력
		// 과일 목록 보여주기
		// 과일 주기(제일 앞에거부터 줌.)
		// 재고 과일 추가하기(제일 마지막에 추가)

	}
}
