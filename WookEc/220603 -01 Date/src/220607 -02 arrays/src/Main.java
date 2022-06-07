
public class Main {
	public static void main(String[] args) {
		// ex) A박스가 4칸 -> 길이 length
		// index 순서는 0부터 사직하고 길이 -1 까지 생성된다
		// int aBox; // 정수형 변수를 하나 선언.
		int[] aBox;  // 정수형 배열 변수 선언.
		aBox = new int[4]; // 길이가 4인 배열 초기화.
		// 초기화 할때 정해둔 [길이값]을 변경할수가 없다.
		
		System.out.println("배열의 길이 값: " + aBox.length);
		// aBox.length = 10;
		
		// index 번호에 접근하는 방법.
		aBox[0] = 56;
		aBox[1] = 57;
		aBox[2] = 58;
		aBox[3] = 59;
		
		System.out.println(aBox[0]);
		System.out.println(aBox[1]);
		System.out.println(aBox[2]);
		System.out.println(aBox[3]);
		
	}
}
