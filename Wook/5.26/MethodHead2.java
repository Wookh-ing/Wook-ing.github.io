public class MethodHead2 {
	// 정수 두 개를 전달받아 왼쪽, 오른쪽을 비교해 무엇이 더 큰지 혹은 같은지 알고싶음.
	public static int compare(int left, int right) {		// 1       -1        0
		return left - right;
	}
	
	// public static char compare(int left, int right){ //'L', 'R', 'S' 
		// if (left > right) {
			// return 'L';
		// } else if (left < right) {
			// return 'R';
		// } else {
			// return 'S';
		// }
	// }
	
	public static void main(String[] args) {
		int result = compare(150, 170);
		if (result >= 1) {
			System.out.println("1");
		} else if (result == 0) {
			System.out.println("0");
		} else {
			System.out.println("-1");
		}
		System.out.println(result);
	}
}