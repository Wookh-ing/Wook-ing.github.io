
import java.util.Scanner;

public class Main5 {
	public static int divide(int left, int right) throws MyZeroDivideException {
		if (right == 0) {
			throw new MyZeroDivideException("나눌 수 없음");
		} else {
			return left / right;
		}
	}
	
	public static int myFunction() {
		// 미완성
		throw new UnsupportedOperationException
						("내일 만들게. 아직 덜 만듬.");
	}
	
	public static void main(String[] args) {
		divide(5000, 0);
//		Scanner scan = new Scanner(System.in);
//		
//		scan.nextInt();
	}
}

//import java.util.Scanner;
//
//public class Main5 {
//	public static int divide(int left, int right) throws MyZeroDivideException{
//		if (right == 0 ) {
//			throw new MyZeroDivideException("나눌수없음");
//		} else {
//			return left / right;
//		}
//	}public static int myFunction() {
////		미완성
//		throw new UnsupportedOpearationException
//		return "내일할겡";
//		}
//	}
////	Exception 은 checked / RunTimeException 이 있다
////	
//	public static void main(String[] args) {
//		myFunction();
////		Scanner sc = new Scanner(System.in);
////		sc.nextInt();
//		
//	}
//}