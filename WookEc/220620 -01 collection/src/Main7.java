import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
//		List<Integer> listTwos = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10));
//		List<Integer> listSevens = new ArrayList<>(Arrays.asList(7, 14, 21, 28, 35));
//		
//		List<Integer> listAll = new ArrayList<>();
//		listAll.addAll(listTwos);
//		listAll.addAll(listSevens);

//		List<Integer> ordered = new ArrayList<>(listAll);
//		Collections.sort(ordered);
//		System.out.println(listAll);
//		System.out.println(ordered);

public class Main7 {
	public static void main(String[] args) {
//		 2의 배수를 5개 가지는 정수형 리스트 생성 및 초기화 해보기
		List<Integer> list = new ArrayList<>(Arrays.asList());
		for (int i = 1; i <= 5; i++) {
			list.add(i * 2);
		}
		System.out.println(list.toString());
		list.clear();

//		 7의 배수를 5개 가지는 정수형 리스트 생성 및 초기화 해보기
		List<Integer> list2 = new ArrayList<>(Arrays.asList());
		for (int i = 1; i <= 5; i++) {
			list2.add(i * 7);
		}
		System.out.println(list2.toString());
		list2.clear();

//		 3번. 위의 리스트의 원소들을 모두 다 가지는 리스트
		List<Integer> list3 = new ArrayList<>(Arrays.asList());
		for (int i = 1; i <= 5; i++) {
			list.add(i * 2);
			list.add(i * 7);
		}

//		 3번의 리스트를 크기순으로 정렬
		Collections.sort(list);
		System.out.println(list);

//		 (Random 객체를 사용하여) 0 ~ 10사이의 난수(정수형)를 6개 가지는 리스트 (각 숫자값은 중복되지 않아야 함)
		Random random = new Random();

		List<Integer> list4 = new ArrayList<>(Arrays.asList());
		while (list4.size() < 6) {
			int result = random.nextInt(11);
			if (!list4.contains(result)) {
				list4.add(result);
			
			}
		}

		System.out.println(list4.toString());
	}
}
