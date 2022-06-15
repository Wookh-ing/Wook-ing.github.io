// 여기서 MyImpleClass 자리에 다른 더 상위 클래스를 넣으면 상속가능?
// class Test extends MyImpleClass{}


// final => 종단 클래스 선언
// 상속을 여기 클래스에서 멈추겠다는 선언
public final class MyImpleClass extends MySubClass{

	@Override
	public void myMethod() {
		System.out.println("새롭게 재정의 하였습니다.");
	}
	
	@Override
	public void myMethod2() {
		System.out.println("마이 메소드2 오버라이드 구현");
	}
	
	public static void main(String[] args) {
		MyClass m = new MyImpleClass();
		m.myMethod();
		
		MySubClass sub = (MySubClass) m;
		sub.myMethod();
		sub.myMethod2();
	}
	
}
