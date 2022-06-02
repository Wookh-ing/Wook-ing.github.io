public class AutoInc {
	public static void main (String[] args) {
		int a = 10; //(첫 위치에서 초기화??)
		// System.out.println(a++); //증감연산자 사용시 주의사항* 증감연산자는 변수의 앞뒤에 붙을수 있지만 증감연산자의 위치에따라 수행하는 순서가 다르다. 앞에 붙었을 경우(++a) 더하기의 연산이 먼저 수행하나, 뒤에 붙었을 경우(a++) 연산을 신경쓰지않고 문장을 수행한다. 
		System.out.println(a++);
		System.out.println(a);

		
		
		
		
		
		
		
		// 복합 대입 연산자 += -= ...
		// a += 1; //11
		// a -= 1; //10
		
		
		// 증감연산자
		// a++;
		// a++;
		// a++;
		
		// a--;
		// System.out.println(a);
		
	}
}