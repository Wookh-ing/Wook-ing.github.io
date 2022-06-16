
public interface Days {
//	interface 추상적!!
//	interface는 interface이다. class 처럼 type이 될수있다.
//	int num = 10;
//	interface 에서 변수선언한 것 처럼 보이지만 
//	사실은 아래의 것이 함축되어있는 상수이다.***
//	public static final int num = 10;
	
	public static final int MONDAY = 1;
	public static final int TUESDAY = 2;
	public static final int WENDSDAY = 3;
}

interface MyInterface {
//	default method는 인터페이스에서 기본적으로 정해놓은 값.
	default void printHello() {
		System.out.println("Hello");
	}
	
	public static String hello() {
		return "Hello";
	}
	
	public static void myStaticMethod() {
		
	}
//	현 버전에서는 private 혼자사용할수 없지만
//	상위버전에서는 가능해진다.
	
//	아래는 정적인 메소드가 있는데 위치만 interface로 옮겼다.
	static int sum(int a, int b) {
		return a + b;
	}
}
