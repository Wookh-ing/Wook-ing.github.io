import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main6 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(7, 3, 2, 8, 9, 1));
		
		// 정순 정렬
		Collections.sort(list);
		System.out.println(list);
		
		int index = Collections.binarySearch(list, 8);
		System.out.println("8의 인덱스: " + index);
		
		// 역순 정렬
		Collections.reverse(list);
		System.out.println(list);
		
		// 무작위 정렬
		Collections.shuffle(list);
		System.out.println(list);
		
		// 최댓값, 최솟값
		System.out.println(Collections.max(list));
		System.out.println(Collections.min(list));
		
		// 전체 원소의 값을 하나의 값으로
		Collections.fill(list, 33);
		System.out.println(list);
		
		// 특정원소만 값을 바꿀때
		Collections.replaceAll(list, 33, 77);
		System.out.println(list);
		
//		list.clear();
		
		List<Integer> target = new ArrayList<>(Arrays.asList(90, 80, 70));
		Collections.copy(list, target);
		System.out.println(list);
	}
}
