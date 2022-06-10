import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] arr = {50, 30, 20, 60, 10 };
		Arrays.sort(arr);
//		index 변수 선언, Array(배열)에서 찾는다.(arr-arr 변수안의, 20 - 값을 찾는다.)
		int index = Arrays.binarySearch(arr, 20);
		System.out.println("20의 인덱스: " + index);
		System.out.println(Arrays.toString(arr));
		
		String[] arr2 = {"a", "c", "b", "e", "d"};
		System.out.println(Arrays.toString(arr2));
		Arrays.sort(arr2);
		
		String[] arr3 = {"ㄱ", "ㄷ", "ㄴ", "ㅁ", "ㄹ"};
		Arrays.sort(arr3);
		System.out.println(Arrays.toString(arr3));
	}

}
