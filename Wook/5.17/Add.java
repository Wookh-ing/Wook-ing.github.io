public class Add{
    public static void main(String[] args){
	// 변수 이름
	// 영소문자로 시작 (대소문자 구별)
	// 숫자도 올 수 있음
	// 공백 x
	// 같은 이름의 변수 생성 불가
	// bookTitle

	// int : 정수형 data type (자료형)
        int x; // 변수 선언 (variable declare)
	int y;
	int sum;

	// 초기화 (initialize)
	x = 100; // 대입연산자 (assignment)  ('=' 같다의 의미 x)
	y = 200;
	sum = x + y;

	System.out.println(sum);
	
	System.out.println(x-y);
	
	int minus;
	minus = x-y;
	System.out.println(minus);

    }
}