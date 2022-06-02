public class StringEquals {
	public static void main(String[] args) {
		String a = "Hello";
		String b = "Hello";
		String llo = "llo";
		
		System.out.println(a == b);
		
		System.out.println(a == ("He" + llo));
		
		
		System.out.println("------ 문자열 값 등등 확인 ------");
		System.out.println(a.equals("He" + llo));
	}
}