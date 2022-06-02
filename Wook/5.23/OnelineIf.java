public class OnelineIf {
	public static void main (String[] args) {
		boolean con = false ;
		
		
		// String result = (con) ? "참" : "거짓";
		
		// if (con) {
			// System.out.println("참일 경우 실행할 문장");
		// } else {
			// System.out.println("거짓일 경우 실행할 문장1");
			// System.out.println("거짓일 경우 실행할 문장2");
		// }
		int result = (con) ? 100 : -100;
		
		System.out.println(result);
		
		
		System.out.println("프로그램 종료");
	}
}