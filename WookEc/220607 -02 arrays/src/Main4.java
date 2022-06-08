import java.util.Arrays;

public class Main4 {
	static void printArray(char[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
	}
	
	// 배열의 모든 원소를 문자열로 표현해서 반환하는 메소드
	static String arrayToString(char[] target) { // (안에는 바꿀 대상)
		String str = "";
		for (int i = 0; i < target.length; i++) {
			str += target[i];
		}
		return str;
	}
	
	// 캐릭터 배열에서 하나의 특정 문자의 인덱스를 찾아 반환하는 메소드
	static int whereIs(char[] target, char c) {
		for (int i = 0; i < target.length; i++) {
			if (target[i] == c) {
				return i;
			}
		}
		// 왜 하는거지 ?
		return -1;
	}
	
	public static void main(String[] args) {
		char[] hello = {'H', 'E', 'L', 'L', 'O'};
		String result = Arrays.toString(hello);
		System.out.println(result);
//		Main4.printArray(hello);
//		같은 클래스 안이라 Main4 클래스 이름을 생략해줘도 상관없다.
		
//		printArray(hello);
//		String result = arrayToString(hello);
//		System.out.println(result);
		
//		for (int i = 0; i < hello.length; i++) {
//			System.out.print(hello[i]);
//		}
//		
//		// 위의 문자 배열에 O 문자에 해당하는 인덱스를 찾아보세요.
//		for (int i = 0; i < hello.length; i++) {
//			if (hello[i] == 'O') {
//				System.out.println("찾았다: " + i);
//			}
//		}
		
	}
}
