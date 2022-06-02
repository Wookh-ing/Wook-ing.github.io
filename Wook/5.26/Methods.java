public class Methods {
	
	// 숫자 하나가 짝수, 홀수 인지 알고싶음. 이 기능을 할 수 있는 메소드.
	
	// boolean isEven(int)
	
	// int isEven(int)
	
	// void isEven(it)
	
	// char is Even(int)
	public static boolean isEven(int number) {
		return number % 2 == 0;
		
	}
	
	
	public static int increase(int a) { // 파라미터는 빈 박스를 만들어주는데 아래의 메소드에서 넣는다
		a++;
		return a;
	}
	
	// public static int int createTwoNumber() {
	// return 20, 30;
	// }
	
	// public static boolean test() {
		// return 10;
	// }
	
	public static void main(String[] args) {
		// boolean result = isEven(11);
		// System.out.println(result);
		int a = 10;
		a = increase(a); // Call By Value
		
		System.out.println(increase(a));
		System.out.println(a);
		}
		
	}
