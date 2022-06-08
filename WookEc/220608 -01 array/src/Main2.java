
public class Main2 {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};
		// 위와 같은 인스턴스를 만들고 싶을때
		
		int[] copy = new int[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			copy[i] = arr[i];
		}
		
//		int[] copy = arr;
//		
		// 참조받지 않는다.
		arr[0] = 1000;
		
		for(int i = 0; i < copy.length; i++) {
			System.out.println(copy[i]);
		}
	}
}
