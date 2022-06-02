public class StaticVariableAndConst2 {
	public static void printTest(int param) {
		param++;
		System.out.println(param);
	}
	
	public static void main(String[] args) {
		int inner = 10;
		//final int TEST_SCOPE = 20;  // final => 변치않는값??
		
		final int TEST_SCOPE = 20;
		printTest(TEST_SCOPE); //TEST_SCOPE
		System.out.println("메인에서의 상수값: " + TEST_SCOPE);
		// {
			// System.out.println(inner);
			// System.out.println(TEST_SCOPE);
			
			// final int BLOCK = 100;
		// }
		// System.out.println(BLOCK);
	}
}