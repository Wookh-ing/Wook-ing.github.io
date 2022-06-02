// 의자 클래스
// 제조사
// 생산일지
// 가격
// 모델명

// 초기화 할 수 있는 생성자
// main method -> 작성한 생성자를 통해 원하는 필드값으로 초기화 해보세요.

public class Chair {
	String make;
	String prod;
	String price;
	String name;
	
	public Chair() {
		make = "제조사: " + "욱";
		prod = "생산년도: " + "2022-05";
		price = "가격: " + "150,000원";
		name = "제품이름: " + "농";
	}
	
	public Chair(String m, String p1, String p2, String n) {
		make = m;
		prod = p1;
		price = p2;
		name = n;
	}
	
	void printAll() {
		System.out.println(make);
		System.out.println(prod);
		System.out.println(price);
		System.out.println(name);
	}
		
	
	public static void main(String[] args){
		Chair c = new Chair("욱", "2022-05", "150,000원", "농");
		
		
		Chair c2 = new Chair();
		
		c.printAll();
		c2.printAll();
		// System.out.println(c2.make);
		// System.out.println(c2.prod);
		// System.out.println(c2.price);
		// System.out.println(c2.name);
	}
}
	