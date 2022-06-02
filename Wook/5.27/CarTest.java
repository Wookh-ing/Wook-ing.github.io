
class Car {
	// 필드 정의
	String color; // 색상
	int speed;    // 현재 속도
	int gear;     // 현재 기어
	void print() {
		System.out.println("(" + color + ", " + speed + ", " + gear + ")");
	}
}

public class CarTest {
	public static void main(String[] args) { // args arguments ?
		{
			int a = 100;
			Car someCar = new Car();
		} // 중괄호 내의 인스턴스는 사라지지 않고, '참조' 하는 과정만 사라진다.
		
		
	
	
	
	
	
	
		// 객체 생성
		Car myCar = new Car();
		
		// 객체의 필드 변경
		myCar.color = "red";
		myCar.speed = 0;
		myCar.gear = 1;
		
		// 객체의 메소드 호출
		myCar.print();
		
		// 색상 : blue 속도 : 60 기어 : 3
		
		Car myCar2 = new Car();
		
		myCar2.color = "blue";
		myCar2.speed = 60;
		myCar2.gear = 3;
		
		myCar2.print();
		}
}