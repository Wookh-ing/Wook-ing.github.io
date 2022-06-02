public class IntegerTypes {
	public static void main (String[] args) {
		/*
		
		-----------------정수-----------
		
		byte b = 100;
		short s = 30000;
		int i = 10_000_000; // 자릿수를 ',' 로 표현시 오류, '_'로 표기
		long l = 123456789L; // 숫자 마지막 'L'은 long type 을 표기. 'L''l'상관없음.
		
		long sum = 100 + 100L;
		
		//byte b2 = 100;
		
		//byte sum = b + b2;
		//System.out.println(sum);
		
		*/
		/*
		
		----------------실수-----------*/
		float f = 123.456F;
		double d = 7777.88888;
		
		//double sum = f + d;
		
		//int i = 10000;
		//float sum = i + f;
		
		float one = 0.1F;
		System.out.printf("%.15f\n", one * 22); //% .xx => 소수점 자리수표기
		System.out.printf("%10d", 10); // %xx => x째 자리수 , 빈자리는 0으로 표기
		
		
		
	}
}