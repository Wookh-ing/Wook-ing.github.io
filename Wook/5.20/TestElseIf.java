// 컵 사이즈 알려주기
// 사용자의 정수를 입력받아서
// 200 이상이면 large
// 100이상 200미만 medium
// 100미만 small




public class TestElseIf {
	public static void main(String[] args) {
		// if (조건식) {
		
		// } else if (다른 조건식) {
			
		// } else if (다른 조건식) {
			
		// } 
			
		
		int cup = 150;
		
		String size;
		if (cup > 200) {
			size = "large";
		} else if (cup >= 100 /*&& cup <200   생략가능*/) {
			size = "medium";
		} else /*if (cup < 100)  생략가능*/ {
			size = "small";
		}

	
		
		System.out.println(size);
	}
}