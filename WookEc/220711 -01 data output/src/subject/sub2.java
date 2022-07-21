package subject;

public class sub2 {
	// ps. 개인능력 부족으로 구글링 하였습니다. 죄송합니다.
	public String solution(String s, int n) {
		char[] arr = s.toCharArray();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != ' ') {
				if (Character.isUpperCase(arr[i])) {
					arr[i] += n;
					if (arr[i] > 'Z') {
						arr[i] = (char) ('A' + (arr[i] - 'Z' - 1));
					} 
				}
				else {
						arr[i] += n;
						if (arr[i] > 'z') {
							arr[i] = (char) ('a' + (arr[i] - 'z' - 1));
						}
					}
				}
			}
		
		return String.valueOf(arr);

	}

	public static void main(String[] args) {
		sub2 s = new sub2();
		System.out.println(s.solution("HELLO WORLD", 3));
		System.out.println(s.solution("khoor zruog", -3));
	}
}
