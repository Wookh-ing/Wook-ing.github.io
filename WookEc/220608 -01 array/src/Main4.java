import java.util.Arrays;

public class Main4 {
	// 두 개 정수 배열을 전달받아 결합시켜 반환하는 메소드
	// 예) [1, 2, 3] [10, 11, 12, 13, 14]
	// [1, 2, 3, 10, 11, 12, 13, 14]
	
	
	
	// 두 개 정수 배열의 합을 가지는 배열을 반환하는 메소드
	// 예 [1, 2, 3] [10, 11, 12, 13, 14]
	// [11, 13, 15, 13, 14]
	public static void main(String[] args) {
		int[] arr = {10, 20, 30};
		
		int[] larger = new int[arr.length + 2];
//		type name = new type[기존.길이 + 갯수];
		for (int i = 0; i < arr.length; i++) {
			larger[i] = arr[i];
		}
		
		System.out.println(Arrays.toString(larger));
	}
}
