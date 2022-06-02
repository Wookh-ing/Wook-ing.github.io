// 3. 전달받은 두 문자열의 길이 값의 합을 반환하는 메소드.

public class TSum {
	
	public static int plus(String left, String right) {
		int a = left.length();
		
		int b = right.length();
		
		// String sum = left + right; // Hello + world = helloworld
		// int sum2 = sum.length();
		return a + b;
		// return sum2;
	}
	public static void main(String[] args) {
		String h = "Hello";
		
		String w = "World";
		
		int sum = plus(h, w);
		System.out.println(sum);
		
		
	}
}

// length 는
// String a = "김정욱";
// System.out.println(a.length());