public class TestBox {
	public static void main(String[] args) {
		// Box none = null; // 지금 참조하는게 없다.
		// none.width = 10;
		
		
		
		
		
		Box box1; 
		box1 = new Box(); // new = instance를 만들다. 
		
		box1.width = 3;
		box1.length = 3;
		box1.height = 3;
		
		// System.out.println(box1.color);
		
		Box box2 = new Box();
		
		box2.width = 10;
		box2.length = 10;
		box2.height = 10;
		
		
		// System.out.println("부피: " + box1.volum);
		// System.out.println("부피: " + box2.volum);
		System.out.println(box1.getVolume());
		System.out.println(box2.getVolume());
		
		
		
		
		box1.printAllState();
		box2.printAllState();
		// 아래의 ↓ 동작을 Box 클래스안에 만들어서 적용
		// System.out.println(box1.width);
		// System.out.println(box1.length);
		// System.out.println(box1.height);
		////////
		// System.out.println(box1.width);
		// System.out.println(box2.width);
		
		// box1.width = 5;
		// System.out.println(box1.width);
		
	}
}