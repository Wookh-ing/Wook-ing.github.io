class Car {
	private String color;
	private int speed;
	private int gear;
	
	// 자동차의 시리얼 번호
	private int id;
	
	// 실체화된 Car 객체의 개수를 위한 정적 변수
	// static이 붙었을때.필드 안에 적는다고 같은 객체가 아닌 필드 밖의 또다른 객체 ?
	// public 이 아닌 private 를 쓰는 이유는 
	// 나중을 위해 나중에 여러 클래스를 만들고 쓰다보면 햇갈리는 경우가 생긴다
	private static int numberOfCars = 0;
	
	// 아래처럼 모든 클래스에서 공유하려면 상수값을 정해주고
	// 변화가 없게 만들어준다. 영구결번
	public static final int SHARE_NUMBER = 22;
	public Car(String color, int speed, int gear) {
		this.color = color;
		this.speed = speed;
		this.gear = gear;

	// 자동차의 개수를 증가하고 id 번호를 할당한다.
		id = ++numberOfCars;
	}

	// 정적 메소드
	public static int getNumberOfCars() {
		return numberOfCars; // OK!!
	}
	
//	public static void printColor() {
//		System.out.println(color);
//	}
	
	// static 하게 만들진 않았다.
	public void printStaticNumber() {
		System.out.println(numberOfCars);
	}
}

public class Cartest {
	public static void main(String[] args) {
		
		
		
		
		
		
		// 아래에는 객체의 행동이라 만들었을때 static 처럼 작동하지 않는다.
//		Car.printStaticNumber(); 
		
		int n = Car.getNumberOfCars();  // 정적 메소드 호출
		System.out.println("지금까지 생산된 자동차 수 = " + n);
		
		Car c1 = new Car("blue", 100, 1); // 첫번째 생성자 호출
		// 여기에서는 작동하는 이유는 읽을 문장이 있기때문에.
//		c1.printStaticNumber(); 
		Car c2 = new Car("white", 0, 1); // 첫번째 생성자 호출
		
		n = Car.getNumberOfCars();  // 정적 메소드 호출
		System.out.println("지금까지 생산된 자동차 수 = " + n);
	}
}

