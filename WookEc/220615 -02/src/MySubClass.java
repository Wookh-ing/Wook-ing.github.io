
public abstract class MySubClass extends MyClass{
//	final 재정의를 할수 없게 만든다
	@Override
	public /*final*/ void myMethod() {
		System.out.println("자식 클래스에서 구현되었습니다.");
	}
	
	public abstract void myMethod2();
}
