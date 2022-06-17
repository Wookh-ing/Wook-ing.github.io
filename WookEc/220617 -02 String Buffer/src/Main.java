
public class Main {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("원본");
//		sb.append(", One=").append(1).append(", DoubleValue=").append(255.0);
		sb.append(", One=");
		sb.append(1);
		sb.append(", DoubleValue=");
		sb.append(255.0);
		
		StringBuffer sbuffer;
		
//		sb.reverse();
		
//		sb.setCharAt(0, 'Q');
//		sb.replace(start, end, str);
		sb.insert(0, "시작");
		
//		String result = sb.toString();
//		System.out.println(result);
		System.out.println(sb.toString());
		
//		String str = "원본 문자열";
//		
//		String other = "다른 문자열";
//		
//		
//		String concat = str + other;
//		System.out.println(concat);
//		System.out.println("원본 문자열다른 문자열" == concat);
		
//		String origin = "원본 문자열";
//		System.out.println(str == origin);
	}
}
