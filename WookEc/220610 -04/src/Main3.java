class Can {
	private String name;
	
	public Can(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
	
	public static void drink(int a) {
	if (a == 1) {
		System.out.println("콜라");
		} else if (a == 2) {
			System.out.println("스프라이트");
		} else if (a == 3) {
			System.out.println("환타");
		}
	}

	public static void drink(String a) {
	if (a == "COLA") {
		System.out.println("콜라");
		} else if (a == "SPRITE") {
			System.out.println("스프라이트");
		} else if (a == "FANTA") {
			System.out.println("환타");
		}
	}

	
}

//public class Machine {
//	public static void 
//}


public class Main3 {
	public final int COLA = 1;
	public final int SPRITE = 2;
	public final int FANTA = 3;
	
	Can cola = new Can("콜라");
	// 자판기 메소드
	// 파라미터로 정수형 1 -> Can 객체 : 콜라
	
	// 문자열 COLA -> Can 객체 : 콜라
	
	public static void main(String[] args) {

		Can.drink(1);
		Can.drink("COLA");
	}
}
