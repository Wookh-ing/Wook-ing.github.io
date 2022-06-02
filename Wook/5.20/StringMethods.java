public class StringMethods {
	public static void main(String[] args) {
		String hello = "hello";
		
		int index = hello.indexOf("o");
		System.out.println(index);
		
		int notFound = hello.indexOf("a");
		System.out.println(notFound);
		
		int index2 = hello.indexOf("l", 3); // ("x", y) y부터 찾을수있게 출발지를 알려줌
		System.out.println(index2);
		
		int index3 = hello.lastIndexOf("l");
		System.out.println(index3);
	}
}