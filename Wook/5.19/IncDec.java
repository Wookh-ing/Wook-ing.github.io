public class IncDec {
	public static void main(String[] args) {
		int a = 55;
		
		a = 78;
		
		// a = a + 5; << 아래처럼도 표기가능
		a += 5; 
		
		System.out.println(a);
		
		a -= 3; //복합산술연산자(+ - * / %) 가 대입연산자( = ) 보다 앞에 와야한다.
		a *= 2;
		a /= 4;
		a %= 2;
	}
}