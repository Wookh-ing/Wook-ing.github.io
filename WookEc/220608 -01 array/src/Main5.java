import java.util.Arrays;

public class Main5 {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30};
		int[] arr2 = {40, 50, 60};
		
		// fill 채우기.
		// arr을 100으로 채운다. 하나하나의 원소가 100이 되고
		// 원소는 arr의 원소 개수로 따라간다.
		Arrays.fill(arr, 100);
		
		System.out.println(Arrays.toString(arr));
		
		// copyOfRange 원하는 시작점 만들기.
		// arr2에서 0번부터 2개?
//		int[] another = Arrays.copyOfRange(arr2, 2, arr.length);
//		System.out.println(Arrays.toString(another));
//		
//		int[] copy = Arrays.copyOf(arr, arr.length);
//		
//		System.out.println(Arrays.toString(copy));
//		// equals 좌우 비교해주는 것.
//		// 배열 전달받아서 길이와 값을 비교.
//		System.out.println(Arrays.equals(arr, copy));
		
	}
}
