public class TestMethod2 {
	// 메소드의 이름. 영소문자. 여러 단어가 있으면 다음 단어의 첫번째 글자를 대문자로.동사로 표현多
	public static int sum() { //return type : void(없다) = void 공허. 
		int a = 10;
		int b = 20;
		int sum = a + b;
		
		return sum;
	}
	
	
	// pi 메소드 { 3.14 실수값을 반환하는 메소드 }
	
	public static double pi() {
		// double pi = 3.14;
		return 3.14;
	}
	public static void main(String[] args) {
		System.out.println("시작");
		
		int result = sum();
		System.out.println(result);
		
		double pi = pi(); // pi 변수선언, pi()메소드 호출
		System.out.println(pi);
		
		System.out.println("끝");
	}
}