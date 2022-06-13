
public class Car {
	// 3개의 필드 선언
	int speed;				// 속도
	int gear;				// 기어
	public String color;	// 색상 공용을 위해 public 필드로 만듬
	
	public void speedUp(int increment) {	// 속도 증가 메소드
		speed += increment;
	}
	
	public void speedDown(int decrement) {	// 속도 감소 메소드
		speed -= decrement;
	}
}
