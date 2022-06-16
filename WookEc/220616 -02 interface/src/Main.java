// 추상적인 차.

abstract class Car {
	public abstract void upWindow();
}


class ButtonCar {
//	동작은 한개만 존재한다.
	
	public void upWindow() {
		System.out.println("창문을 버튼을 울러 올림");
	}
//	public void upWindow2() {
//		System.out.println("창문을 손잡이를 돌려 올림");
//	}
}

class HandleCar {
	public void upWindow2() {
		System.out.println("창문을 손잡이를 돌려 올림");
	}
}

// 인터페이스는 다양한 동작을 넣을수 있으므로 위의 것들을 인터페이스에 넣어도 된다.



class Person {
	public static String hello() {
		return "Hello";
	}
	public static String mm = "asdf";
	String name;
}


public class Main {
	public static void main(String[] args) {
		
//		System.out.println(Days.num);
//		위의 num값이 변수가 아닌 상수이기때문에
//		아래의 값을 변환하는건 에러.
//		Days.num = 100;
	}
}
