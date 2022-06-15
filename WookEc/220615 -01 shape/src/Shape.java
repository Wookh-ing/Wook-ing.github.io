// 도형
// x좌표
// y좌표

// 넓이
// public abstract class Shape => 추상 클래스
public abstract class Shape {
	private int x;
	private int y;
	
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Shape [x=" + x + ", y=" + y + "]";
	}
	// 추상 메소드는 일반적인 클래스에는 존재할수없다.
	// 추상적인 클래스 일때만 존재 가능
	// 추상 메소드(abstract) - 동작에 대한 구현 X/ 동작은 메소드 Body 에 있다.
	public abstract int getArea(); // 메소드 Head만 존재
	
}
