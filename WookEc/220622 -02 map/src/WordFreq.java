import java.util.HashMap;
import java.util.Map;

public class WordFreq {
	public static void main(String[] args) {
		String line = "Hello. I'm a java developer";

		Map<Character, Integer> m = new HashMap<>();

		for (int i = 0; i < line.length(); i++) {
			char c = line.charAt(i);
			if (!m.containsKey(c)) {
				m.put(c, 1);
			} else {
				int value = m.get(c);
				value += 1;
				m.put(c, value);
//				m.put(c, m.get(c) + 1);
			}

		}
		System.out.println(m);

//		Map<String, Integer> m = new HashMap<>();
//		
//		String[] sample = {"to", "be", "or", "not", "to", "be", "is", "a", "problem"};
//		// 문자열에 포함된 단어의 빈도 계산
//		for (String a : sample) {
//			Integer freq = m.get(a);
//			m.put(a, (freq == null) ? 1 : freq + 1);
//		}
//		
//		System.out.println(m.size() + "단어가 있습니다.");
//		System.out.println(m.containsKey("to"));
//		System.out.println(m.isEmpty());
//		System.out.println(m);
	}
}
