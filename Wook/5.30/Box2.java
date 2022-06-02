public class Box2 {
	int width;
	int length;
	int height;
	
	public Box2() {

	}
	
	public Box2(int w, int l, int h) {
		width = w; 
		length = l;
		height = h;
	}
	
	public static void main(String[] args){
	Box2 b3 = new Box2(); // 생성자 이때 바로위의 생성자가 있기에 기본생성자를 찾을수 없어 컴파일 에러가 나온다. 여러개의 생성자를 만들때 (파라미터) 값이 같아선 안된다.
	
	Box2 b = new Box2(50, 60, 70);

	// System.out.println(b.width);
	// System.out.println(b.length);
	// System.out.println(b.height);
	
	// // 박스 인스턴스화. 생성자를 호출해서 가로90 세로 100 높이 110
	// Box2 b2 = new Box2(90, 100, 110);
	
	}
}