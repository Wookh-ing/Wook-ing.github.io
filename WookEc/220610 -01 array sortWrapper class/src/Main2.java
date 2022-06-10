
public class Main2 {
	public static void main(String[] args) {
		int number = 22;
//		Wrapper class (포장해주는 클래스)
//		wrapper class 로 바꾸려면 아래의 x 들의 앞글자를 대문자로 바꿔준다.
//		예외: Int => Integer , Char => Character
//		Byte
//		Short
//		Int
//		=> Integer
//		Long
//		Float
//		Double
//		Char
//		=> Character
//		Boolean
//		
//		객체 만드는 방법
//		i와 i2는 값을 가지는게 아니라 값을 가진 인스턴스를 참조한다.
		Integer i = new Integer(10); // 상위버전에서는 Integer이 deprecated된다.
//		숫자 10이라는 필드를 가지는 객체를 만들고 i에 참조한다.
		Integer i2 = Integer.valueOf(500); // boxing = 포장
//		원시형 타입을? 객체의 형태로 바꾸는 과정.
		int primitveInt = i2.intValue(); // unboxing = 포장풀기
//		다시 원시형 타입으로 변형.
		
//		System.out.println(primitveInt);
		Integer auto = 100; // auto-boxing
//		대입연산을 하게되면 자동으로 100이라는 객체를 만들어서 참조가 일어난다.
		int un = auto; // auto-unboxing
		System.out.println(un);
		
		
		Integer value = Integer.valueOf("5959");
//		문자열을 숫자로 변경시켜 숫자만 가지고오는?
		int result = Integer.valueOf("1234");
//		위와 아래는 같은일을 한다. 같은역할
		Integer.parseInt("90");
	}
}
