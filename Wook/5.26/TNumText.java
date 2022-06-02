// 2. 전달받은 정수만큼 "안녕" 이라는 문자열을 출력하는 메소드. (반환없음 = void)

// 전달/ 정수 //// 안녕/ 문자열 //// void

public class TNumText {
	public static void he(int h) {
		for (int i = 1; i <= h; i++){
		String hello = "안녕";
		System.out.println(hello);
		}
	}
	
	
	
	// 아래에서 정수를 받아서 위에서 출력
	
	public static void main(String[] args) {
		int input = 5;
		he(input);
		}
	}
