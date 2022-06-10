
public class Main2 {
	// 필드 선언
	private int speed;	// 속도
	// 중복 메소드 정수버전
	public void setSpeed(int s) {
		speed = s;
		System.out.println("정수 버전 호출 ");
	}
	// 중복 메소드 실수버전
	public void setSpeed(double s) {
		speed = (int)s;
		System.out.println("실수 버전 호출");
	}

	
	public static void main(String[] args) {
		
		Main2 main = new Main2();	// 첫 번째 객체 생성
		main.setSpeed(100);;		// 정수 버전 메소드 호출
		main.setSpeed(79.2);		// 실수 버전 메소드 호출
		
//		왜 실수로 나오는가?
//		현재 long 값은 int 로 표기할수 없어서 정수임에도 실수로 표기
//		하지만 double은 표현할수 있는 값이 int보다 더 커 long이 실수로 표기되는것.
//		main.setSpeed(1000L);
//		main.setSpeed('A');
//		main.setSpeed("A");
		
	}
}
