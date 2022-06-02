public class StaticVariableAndConst3 {
	public static int number = 100; // 전역 변수
	
	public static void test() {
		// number++;
		System.out.println("테스트메소드에서: " + number);
	}
	
	public static void main(String[] args) {
		// number++;
		System.out.println("메인메소드에서: " + number);
		
		test();
		
		System.out.println(Math.PI);
		// Math.PI++;
		
		double a = Math.abs(-372); // 음수는 양수로, 양수는 음수로
		System.out.println(a);
		
		double r = Math.random();
		r = (int) (r * 10);
		System.out.println(r);
	}
}