
public class Main6 {
//	[] 배열 표현을 ... 으로 변경
//	... 은 가변길이 파라미터.
//	[] 가 아닌 ...을 적어도 배열 전달이 가능하다.
//	...은 쉼표로 전달을 할 경우 그것들을 원소로 가지는 배열을 만든다.
//	다른 파라미터도 전달받고싶어서 ,type name 하려면
// 	ex) int...arr, double d 순이 아닌
//		double d, int...arr 
//	...이 파라미터 안에서 제일 마지막으로 와야한다.
//	값을 한개또는 여러개 전달받고자 하는 경우에 사용한다.
	public static void someMethod(int... arr) {
		for (int number : arr) {
			System.out.println(number);
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};
//		문장을 나누면 오류( = )	
//		arr = {30, 40, 50};
		
		someMethod(40, 50, 60, 70, 80);
		
//		someMethod(arr);
//		someMethod(new int[] {20, 30, 40, 50, 60});
//		System.out.println("---");
//		someMethod(new int[] {4, 5, 6});
//		System.out.println("종료");
	}
}
		
		
		

// 		제한된 사용자긴 하지만, index에 대한 고민을 덜하고자 만들어진 for each
//		int[] arr = {10, 20, 30, 40, 50};
		
		// for each 문?
		// for문 ( : )
		// ;세미콜론이 아닌 :콜론이 들어가고
		// (type name(배열안의것을 순서대로 꺼냄) : 배열)
//		for (int number : arr) {
//			arr[0] = 50;
//			System.out.println(number);
		// 출력하고나면 다음 반복이 생긴다.

