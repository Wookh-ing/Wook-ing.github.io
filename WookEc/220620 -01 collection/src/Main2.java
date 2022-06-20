import java.util.ArrayList;

public class Main2 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
//		<제네릭> 안에는 표시할 형태가 들어간다.
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		System.out.println(sum);
		
	}
}
