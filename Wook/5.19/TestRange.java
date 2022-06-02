public class TestRange {
	public static void main(String[] args) {
		//0~100 사이 ??
		
		// 숫자가 0이상 '이고' 100 이하 인가? = and 연산자 두가지 다! &&
		// 숫자가 0이상 '이거나' 100 이하 인가? = or 두가지 중 하나!! ||
		int number = -133;
		
		
		System.out.println(0 <= number && number <= 100);
		
		// System.out.println(0 <= number);
		// System.out.println(number <= 100);
		//System.out.println(0 <= number <= 100); 이게 불가능한 이유는, 한번에 두가지 등호를 이해하지 못할뿐 '0<= number' 이 이미 true값 이기 때문에 'true와 <=100' 이 계산이 불가능해진다.
		
	}
}
	