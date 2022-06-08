// 오늘 한 것들은 Arrays.copyOf
// int[] copy = Arrays.copyOf( , );








import java.util.Arrays;

public class Main4_1 {
	// 두 개 정수 배열을 전달받아 결합시켜 반환하는 메소드
	// 예) [1, 2, 3] [10, 11, 12, 13, 14]
	// [1, 2, 3, 10, 11, 12, 13, 14]
	public static int[] concatArray(int[] left, int[] right) {
		int[] newArray = copy(left, right.length);
		
		for (int i = left.length; i < newArray.length; i++) {
			newArray[i] = right[i - left.length];
		}
		return newArray;
	}
	
	// 두 개 정수 배열의 합을 가지는 배열을 반환하는 메소드
	// 예) [1, 2, 3] [10, 11, 12, 13, 14]
	// [11, 13, 15, 13, 14]
	public static int[] sumArray(int[] left, int[] right) {
		if (left.length > right.length) {
			int[] copy = copy(left, 0);
			for (int i = 0; i < right.length; i++) {
				copy[i] += right[i];
			}
			return copy;
		} else {
			int[] copy = copy(right, 0);
			for (int i = 0; i < left.length; i++) {
				copy[i] += left[i];
			}
			return copy;
		}
	}
//////////////////////////////////////
	
	public static int[] copy(int[] arr, int newLength) {
		int[] larger = new int[arr.length + newLength];
		for (int i = 0; i < arr.length; i++) {
			larger[i] = arr[i];
		}
		return larger;
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30 };
		int[] arr2 = { 3, 4, 5, 6, 7 };

//		System.out.println(Arrays.toString(larger);
		System.out.println(Arrays.toString(concatArray(arr, arr2)));
		System.out.println(Arrays.toString(sumArray(arr, arr2)));
		
		
		
		

//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
	}
}
