// 1. 원의 반지름을 실수형으로 전달받아 원넓이(실수형)를 반환하는 메소드 작성 후
// 메인메소드에서 호출하여 출력을 통해 값을 확인해 보세요.
import java.util.*;

public class THalfCircle {
	public static double circle(int a) {
		return a * a * 3.14;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double cir = circle(5);
		System.out.println(cir);
	}
}