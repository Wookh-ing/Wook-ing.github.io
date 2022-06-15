
public class Triangle extends Shape{
	private int base;
	private int height;
	
	public Triangle(int x, int y, int base, int height) {
		super(x, y);
		this.base = base;
		this.height = height;
	}
//	아래는 추상메소드가 아니라 부모가 가진 추상메소드를
//	실체화 한다, 구현한다.
	@Override
	public int getArea() {
		return base * height / 2;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	
	
}
