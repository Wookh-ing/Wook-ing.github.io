import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) {
		System.out.println(Long.MAX_VALUE);
		
		BigInteger value1 = BigInteger.valueOf(Long.MAX_VALUE + Long.MAX_VALUE);
		System.out.println(value1);
//		위의 Max_Value 는 해당 Long의 최대값을 표현한다. Long으로 표현할수있는 최대값을
//		두번 더했으므로 표현 불가. 이럴때 
		BigInteger value2 = new BigInteger("9223372036854775807");
		System.out.println(value2.add(new BigInteger("10")));
//		정수들을 문자열로 바꾼뒤 더해주면 값이 나온다.

//		주의점
//		위에서 value2에 add 해줬지만 value2 본래의 값은 바뀌지않는다.
		System.out.println(value2);
		
//		실수 (double, float = 근사값)
		BigDecimal dec = new BigDecimal("0.123456789");
		System.out.println(dec);
		
		BigDecimal d =new BigDecimal(0.1);
		System.out.println(d);
	}
}
