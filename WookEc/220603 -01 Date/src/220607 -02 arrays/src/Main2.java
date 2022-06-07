
public class Main2 {
	public static void main(String[] args) {
		// 길이가 5인 정수(ing)형 배열을 선언 초기화 하고
		// 모든 원소(element)의 값을 100으로 설정해 보세요.
		
//		int[] bBox; 		// 선언. 여기서는 타입과 이름만 정해준다.
//		bBox = new int[5];	// 초기화. int의 값을 정해준다.
		int[] bBox = new int[5];
		
		System.out.println("배열의 길이: " + bBox.length);
		
		for (int i = 0; i < bBox.length; i++) {
			bBox[i] = 100;
		}
		
		for (int i = 0; i < bBox.length; i++) {
			System.out.println(i + "번째 index의 원소 값: " + bBox[i]);
		}
		
		// 반복문과 같이 할수있다.
		
//		int idx = 0;
//		
//		bBox[0] = 100;
//		idx++;
//		bBox[1] = 100;
//		idx++;
//		bBox[2] = 100;
//		idx++;
//		bBox[3] = 100;
//		idx++;
//		bBox[4] = 100;
//		idx++;
		

	}
}
