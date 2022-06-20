import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main4 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("apple");
		list.add("banana");
		list.add("carrot");
		list.add("donut");
		
		// 위의리스트에서 5글자 문자열만 찾아서 지우기
		
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String str = iterator.next();
			if (str.length() == 5) {
				iterator.remove();
			}
		}
		System.out.println(list);
		
		
		// 동등한 객체를 하나 찾아서 지우기
		// equals 사용하는거같음
//		System.out.println(list.contains(new String("banana")));
//		list.remove("banana");
//		
//		System.out.println(list);
		
		// 위의리스트에서 5글자 문자열만 찾아서 지우기
		
		// for each문으로 하는 방법은 안된다.
//		for (String s : list) {
//			if (s.length() == 5) {
//				list.remove(s);
//			}
//		}
//		System.out.println(list);
	}
}
