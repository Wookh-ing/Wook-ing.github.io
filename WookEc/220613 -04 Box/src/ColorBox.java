
public class ColorBox extends Box{
	String color;
// 자식의 클래스에서 기본생성자 호출을 위해 부모의 클래스에 기본 생성자를 만든다.
	public ColorBox() {
//	또는 파라미터 안에 값을 설정해준다.
		super(10, 50, 870);
	}
	
	

	public ColorBox(int width, int height, int length, String color) {
	super(width, height, length);
	this.color = color;
}



	public String getColor() {
		return color;
	}
	
	
}
