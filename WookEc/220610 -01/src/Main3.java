
public class Main3 {
	public static void main(String[] args) {
//		원시형
		int number1 = 10;
		int number2 = 20;
//		number1. << 안에 가지는 메소드(행동)가 없다.
//		원시형을 행동을 가지게 하고싶다면 boxing을 한다.
		
//		객체의 형태
		Integer refNumber = Integer.valueOf(10);
//		refNumber. << 가지는 메소드(행동)가 있다.
//		원시형은 가지는 메소드(행동)가 없으며 객체의 형태는 위를 가진다.
		
//		객체의 형태로 대소 구분하는 방법
//		원시형 일때 보다 많이 간단하다.
		refNumber.compareTo(20);
		System.out.println(refNumber.compareTo(20));
		
		Integer.compare(10, 20);
		System.out.println(Integer.compare(10, 20));
//		compare 이용할때 비교에서 좌측이 크면 1, 우측이 크면 -1
		
		
	}
}
