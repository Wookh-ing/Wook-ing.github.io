public class Car {
	private int speed; // private 위치는 접근제한자가 오는 위치이다.public, private 외부에서 접근이 불가하다. TestCar에서는 사용 불가. 외부에서 보지 못하게 숨겨둘수있다.
	private int gear;
	private String color;
	
	// 첫번째 생성자
	public Car(String c,int s, int g) {
		color = c;
		speed = s;
		gear = g;
	}
	
	
	
	// 색상만 주어진 생성자
	public Car(String c) {   // 첫번째 생성자를 호출한다.
		this(c, 0 , 1); // <this 는 자기자신 첫번째 생성자를 의미
		System.out.println("초기화 과정중 ~~");
 		// color = c;
		// speed = 0;
		// gear = 1;
	}
	
	// 접근(색상)
	public String getColor() {
		return color;
	}
	
	// 설정(색상)
	public boolean setColor(String c) {
		if (c != null) {
				color = c;
				return true;
		}
		return false;
	}
	// getter 접근자
	public int getSpeed() {
		return speed;
	}
	// setter 설정자
	public void setSpeed(int s) {
		speed = s;
	}
	
	public int getGear() {
		return gear;
	}
	
	public void setGear(int g) {
		gear = g;
	}

	
	
	void printAll() {
		System.out.println(color);
		System.out.println(speed);
		System.out.println(gear);
	}
	
	
}