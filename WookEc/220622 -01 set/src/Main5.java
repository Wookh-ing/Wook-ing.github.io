import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

//		int min = 1;
//		int max = 45;
//		
//		
//		int value = ran.nextInt(min + max) + min;
//		System.out.println(value);

public class Main5 {
	public static void main(String[] args) {
		// 중복되지 않는 정수 1 ~ 45 사이의 정수 6개를 가지는 집합
		Set<Integer> lotto = new HashSet<>();
		Random ran = new Random();

		while (lotto.size() < 6) {
			lotto.add(ran.nextInt(45) + 1);
		}
		
		System.out.println(lotto);
		
		List<Integer> list = new ArrayList<>(lotto);
		
		Collections.sort(list);
		
		System.out.println(list);
	}
}
