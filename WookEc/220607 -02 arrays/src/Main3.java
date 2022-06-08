
public class Main3 {
	public static void main(String[] args) {
		// 실수 1.02, 0.03, 4.0
		double d1 = 1.02;
		double d2 = 0.03;
		double d3 = 4.0;
		
		
		
//		double[] cBox = new double[3];
//		cBox[0] = 1.02;
//		cBox[1] = 0.03;
//		cBox[2] = 4.0;
		// 위 를 아래처럼 표기 가능
		// 아래 [] 안에 길이값을 적으면 컴파일 에러
		// 자동으로 {} 안의 개수를 파악해 길이값 자동 입력
		// double[] cBox = new double[] { 1.02, 0.03, 4.0};
		// 아래처럼 또 축약 가능
		double[] cBox = { 1.02, 0.03, 4.0};

		for (int i = 0; i < cBox.length; i++) {
			System.out.println(i + "번째 index 원소 값: " + cBox[i]);
		}
		
	}
}
