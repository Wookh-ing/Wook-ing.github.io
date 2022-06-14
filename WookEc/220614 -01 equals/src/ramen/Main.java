// 컵라면
// 제조사
// 이름
// 가격

// 생성자, 게터세터

// Override
// toString
// equals - 제조사 이름이 같으면

package ramen;

public class Main {
	public static void main(String[] args) {
		ramen ramen1 = new ramen("육개장", "삼양", 1000);
		System.out.println(ramen1.toString());
		
		ramen ramen2 = new ramen("육개장", "농심", 950);
		System.out.println(ramen2.toString()); // => 문자표현
		System.out.println(ramen2.hashCode()); // => 해쉬코드/ 숫자코드
		
//		System.out.println(ramen1.equals(ramen2));
		
		if (ramen1.equals(ramen2)) {
			System.out.println("같은 이름의 라면입니다.");
			System.out.println("같은 제조사 입니다.");
		} else {
			System.out.println("다른 라면입니다.");
			System.out.println("다른 제조사 입니다.");
		}
	}
}
