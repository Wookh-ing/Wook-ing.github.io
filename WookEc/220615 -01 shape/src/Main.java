// 삼각형 // 중심점(x, y) // 밑변 // 높이 // 넓이 구해서 알려줄 수 있다.

// 직사각형 // 중심점(x, y) // 가로 // 세로 // 넓이를 구해서 알려줄 수 있다.

// 원 // 중심점(x, y) // 반지름 // 넓이를 구해 알려줄 수 있다.
public class Main {
	public static void main(String[] args) {
//		추상 메소드는 인스턴스화 할수 없다.
//		미완성의 클래스여서 할수없다.
//		Shape s1 = new Shape();
//		Shape s2 = new Shape(10, 20);
		
//		Triangle t = new Triangle(0, 0, 5, 5);
//		System.out.println(t.getArea());
//		
//		Shape s = t;
//		System.out.println(s.getArea());
//		
//		Rectangle r = new Rectangle(0, 0, 10, 10);
//		System.out.println(r.getArea());
//		
//		Circle c = new Circle(0, 0, 5);
//		System.out.println(c.getArea());
		
		Shape r = new Rectangle(0, 0, 5, 5);
		System.out.println(r.getArea());
		
		Shape c = new Circle(0, 0, 5);
		System.out.println(c.getArea());
		
	}
}
