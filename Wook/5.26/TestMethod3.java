public class TestMethod3 {
	
	public static int getSum(int a, int b) { // parameters. 개수, 타입, 순서

		return a + b ;
	}
	
	// 두개 int 정수를 전달받아 곱 연산 결과를 반환하는 메소드를 작성하고호출해 반환값을 출력하라.
	public static int getMulti(int a, int b) {
		return a * b;
	}
	
	// public static int getmulti() {
		// int a = 20;
		// int b = 33;
		// return a * b;
		// }
		
	
	
	public static void main(String[] args) {
		int sum = getSum(30, 60);
		System.out.println(sum);
		
		// System.out.println(a); a를 찾을수없음.		
		
		System.out.println(getSum(100, 200));
		
		
		System.out.println(getMulti(7, 8));
		// int multi = getmulti();
		// System.out.println(multi);
	}
}