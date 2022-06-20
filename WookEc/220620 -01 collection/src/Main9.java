import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main9 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("apple"
				, "banana", "carrot", "donut", "egg"));
		
		List<String> dest = new ArrayList<>(Arrays.asList());
		for (int i = 0; i < list.size(); i++) {
			dest.add(list.get(i));
		}
		
//		 위의 리스트에서
//		 문자열 길이가 5글자인 문자열만을 원소로 하는 리스트 생성
		System.out.println(list.toString());
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String str = iterator.next();
			if (str.length() != 5) {
				iterator.remove();
			}
		}
		System.out.println(list);
		
//		문자열 중에 'e' 문자를 포함하는 문자열만을 원소로 가지는 리스트 생성
//		List<String> list2 = new ArrayList<>(Arrays.asList("apple"
//				, "banana", "carrot", "donut", "egg"));
		Iterator<String> iterator2 = dest.iterator();
		while (iterator2.hasNext()) {
			String str = iterator2.next();
			if (!str.contains("e")) {
				iterator2.remove();
			}
		}
		System.out.println(dest);
		
		List<String> list3 = new ArrayList<>(Arrays.asList("가", "1"
				, "@", "3", "나"));
		
		// 위의 2번 리스트에서 "정수 형태의 값"을 가지는 문자열을 찾아
		// 해당 원소를 가지는 정수형 리스트 행성
		
		
		
		// "정수 형태의 값"을 가지는 문자열을 -> Integer 형으로
		Integer i = Integer.valueOf("1234"); // => 1234 Integer 변환
		Integer exp = Integer.valueOf("숫자가 아니면?"); // => NumberFormatException 예외발생
	}
}
