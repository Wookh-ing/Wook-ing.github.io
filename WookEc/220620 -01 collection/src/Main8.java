import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main8 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(3, 23, 35, 11, 23, 57, 79));
//		 합, 평균
		
//		for (int i = 0; i <list.size(); i++) {
//			list.get(i);
//			list.remove(i);
//			i--;
//		}
//		
//		for (int i : list) {
//			list.remove(Integer.valueOf(i));
//		}
		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		int avg = sum / list.size();
		System.out.println(sum);
		System.out.println(avg);
//		Iterator<Integer> iter = list.iterator();
//		while (iter.hasNext()) {
//			iter.next();
//		}
		
		
//		 정수 57이 리스트에 있는지? 있으면 몇 번째 index에 위치하는지?
		
		System.out.println(list.contains(57) 
				+ ", 몇번째에 위치하는가: " + list.indexOf(57));
		
//		 정수 23의 개수
		int count = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == 23) {
				count++;
			}
		}
		System.out.println(count);
		
		// 중복되는 원소 23을 '하나' 삭제하고
//		Iterator<Integer> iter = list.iterator();
//		while (iter.hasNext()) {
//			int value = iter.next();
//			if (value == 23) {
//				iter.remove();
//				break;
//			}
//		}
		
//		int index = list.indexOf(23);
//		좌측부터
//		int index = list.lastIndexOf(23);
//		우측부터
//		list.remove(index);
//		System.out.println(list);
		
		
		list.remove(Integer.valueOf(23));
		System.out.println(list);

		
	}
}
