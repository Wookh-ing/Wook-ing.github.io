import java.util.StringTokenizer;

public class Main3 {
	public static void main(String[] args) {
		String longLine = "apple banana carrot donut";
		
		
		String[] split = longLine.split(" ");
		System.out.println(split[2]);
		
//		StringTokenizer st = new StringTokenizer(longLine," ");
//		
//		while (st.hasMoreElements()) {
//			String local = st.nextToken();
//			System.out.println(local);
//		}
		
//		System.out.println(st.hasMoreTokens());
//		String a = st.nextToken();
//		System.out.println(a);
//		String[] arr = new String[4];
//		StringBuilder sb = new StringBuilder(longLine);
//		for (int i = 0; i < 3; i++) {
//			int spaceIndex = sb.indexOf(" ");
//			arr[i] = sb.substring(0, spaceIndex);
//			sb.replace(0, spaceIndex + 1, "");
//		}
//		
//		System.out.println(arr[2]);
		
		// 내방법
//		char[] arr = new char[longLine.length()];
//		
//		for (int i = 0; i < longLine.length(); i++) {
//			arr[i] = longLine.charAt(i);
//		}
//		System.out.println(Arrays.toString(arr));
//		
//		for (int i = 13; i <= 18; i++) {
//			arr[i] = longLine.charAt(i);
//			System.out.print(arr[i]);
//		}
		

	}
}
