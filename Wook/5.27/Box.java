public class Box {
	
	// 값/상태 -> 멤버변수 (member variable) / 필드 (fields)
	int length;
	int width;
	int height;
	// int volum = length * width * height;
	// 메소드/기능 or 동작
	public void printAllState() {
		System.out.println(width);
		System.out.println(length);
		System.out.println(height);
	}
	
	// ???
	// 박스는 자기자신의 
	// 부피를 구해서 정수형 값으로 
	// 알려줄 수 있음.(반환)
	public int getVolume() {
		return width * length * height;
	}		
}

