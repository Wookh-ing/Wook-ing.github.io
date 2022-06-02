public class MulDiv {
    public static void main (String[] args) {
	System.out.println(123-12);
	// System.out.println("ABC" / 5);
	// System.out.println(50 / 0); = 계산안되는 예외적 상황이 발생하면 비정상적 종료

	System.out.println("10 더하기 5는" + 10 + 5);
        System.out.println("10 곱하기 5는" + (10 * 5));
	System.out.println("22 나누기 4는" + (22 / 4));
	System.out.println("22 나누기 4는" + (22.0 / 4.0)); // 결과 값을 소숫점 까지 보고싶다면 정수를 소수로 만들어준다.    

	System.out.println("프로그램 정상 종료");
    }
}