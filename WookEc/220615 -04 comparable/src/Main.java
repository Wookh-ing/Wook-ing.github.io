import java.util.Arrays;

//	제네릭<> 인터페이스, 클래스 우측에 적는다.
class Member implements Comparable<Member>{
	
	String name;
	int height;
	int weight;
	
	public Member(String name, int height, int weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	// 키 ~ 를 기준
	// compareTo 대소 비교/ 다르다를 표현할수없다.
	
	@Override
	public int compareTo(Member o) {
		return this.height - o.height;
	}
}

public class Main {
	public static void main(String[] args) {
		Member[] members = {new Member("키큰놈", 190, 60)
						, new Member("키작은놈", 130, 30)
						, new Member("적당한놈", 176, 65)
		};
		
//		System.out.println(members[0].compareTo(members[1]));
		Arrays.sort(members);
		System.out.println(members[0].height);
		System.out.println(members[1].height);
		System.out.println(members[2].height);
	}
}
