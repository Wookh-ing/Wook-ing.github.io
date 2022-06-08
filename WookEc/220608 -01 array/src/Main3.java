import java.lang.reflect.Array;
import java.util.Arrays;

public class Main3 {
	// 정수형 배열을 전달받아 같은 길이와 원소값을 가지는 정수 배열을 반환하는 메소드
	public static int[] copyArray(int[] origin) {
		int[] copy = new int[origin.length];
		
		for(int i = 0; i < origin.length; i++) {
			copy[i] = origin[i];
		}
		return copy;
	}
	
	// 정수형 배열 2개가 동일한지(길이와 각 원소값)를 알수있는 메소드
	// 2개의 값을 비교하니 boolean type사용
	// 길이, 원소 두가지를 비교해야한다.
	public static boolean sameArray(int[] a, int[] b) {
		if (a.length == b.length) {
		return true;
		}
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i]) {
				return false;
			}
		}
		return true;
		
//		if (a.length == b.length && a == b) {
//			return true;
//		} else
//		System.out.println(a.length);
//		System.out.println(b.length);
//		System.out.println(a);
//		System.out.println(b);
//		return false;

	}
	
	public static void main(String[] args) {
		int[] test = {50, 70, 90, 110};
		int[] test2 = {50, 70, 90, 110};
//		System.out.println(test.length);
		int[] c = copyArray(test);
		// arrays.tostring 배열에 관련된 스태틱한 메소드
		// ()안에 참조할걸 넣어주면 문자열 형태로 바꿔서 보여줌
//		System.out.println(Arrays.toString(c));
		boolean s = sameArray(test, test2);
		System.out.println(s);
	}
}
