// 일어나기
// 아침밥 먹기
// --- 일과
// --- 점심밥 먹기
// ---- 일과
// 저녁밥 먹기

public class TestMethod {
	public static void printRepeat() { // 메소드 머리(head)
		
		for (int i = 0; i < 3; i++) { // 메소드 몸통(body)
			System.out.println("반복중");
		}
	}
	
	// print Hello
	public static void printHello() { // 메소드 머리(head)
		int number = 10;
		System.out.println("Hello"); // 메소드 몸통(body)
		System.out.println("초기화한 변수 값: " + number);
	}
	
	public static void main(String[] args) {
		System.out.println("프로그램 시작~");
		
		printHello();
		// System.out.pritnln("헬로안에서 초기화한 변수 값: " + number); // 지역변수 기억할것.
		for (int i = 0; i < 2; i++) {
		printRepeat();
		}
		
		System.out.println ("프로그램 끝~");
	}
}
