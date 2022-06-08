
class Car {
	public int speed;	// 속도
	public int gear;	// 기어
	public String color;// 색상
	
	public Car() {
		speed = 0;
		gear = 1;
		color = "red";
	}
	public void speedUP() {	// 속도 증가 테스트
		speed += 10;
	}
	public String toString() {	// 객체의 상태를 문자열로 반환하는 메소드
		return "속도: " + speed + "기어: " + gear + "색상: " + color;
	}
}

public class CarArrayTest {
	public static void main(String[] args) {
		final int NUM_CARS = 5;
		Car[] cars = new Car[NUM_CARS];	// 배열 객체 생성
		
//		for each문은 우리가 값을 보고자 할때는 괜찮으나
//		값을 넣으려 할때는 참조하는 것을 가져와 넣기때문에 
		for (Car c : cars) {
			c = new Car();
		}
		
		
		for (int i = 0; i < cars.length; i++)
			cars[i] = new Car();	// 배열의 각 원소에 Car 객체를 생성하여 대입한다.
		
//		for (int i = 0; i < cars.length; i++)
//			cars[i].speedUP();
		
//		대신 아래의 for each문을 써도 좋다.
		for (Car c : cars) {
			c.speedUP();
		}
		
//		이 위치에 for each 문이 오면 순서를 확인하는 용도로 아주 좋다.
		for (Car c : cars) {
			System.out.println(c);
		}
		
//		for (int i = 0; i < cars.length; i++)
////			cars[i] 뒤에 .toString()을 생략해도 상관없다
////			원래는 표현할수 없는 값이 나온다.
////			아래의 객체를 문자열처럼 다루고자할때
////			toString이 호출이된다.
////			toString만 이렇게 된다. 위의 메소드에서도 toString똑같이 써줘야한다.
//			System.out.println(cars[i]);		
	}
}