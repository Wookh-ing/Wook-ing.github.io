
public class Main {
	public static void someMethod(int param) {
		
	}
//	Method 들은 이름 하나로 같고 다름을 따지는게 아니라
//	(파라미터) 안의 내용도 함께 판별한다.
	public static void sum(int a, int b) {
		System.out.println(a + b);
	}
	
	public static void sum(double a, double b) {
		System.out.println(a + b);
	}
	
	
	public static void main(String[] args) {
//		someMethod(3873.03736);
//		someMethod("asdf");
		
		
		// Method Overloading
//		System.out.println(123123);
//		System.out.println(123.123);
//		System.out.println("123.123");
		sum(52, 20);
		sum(10.0, 40.0);
	}
}
