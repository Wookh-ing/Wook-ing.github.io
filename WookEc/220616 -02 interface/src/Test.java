class MyClass {
	public static int num;
	
	public int fields = 10000;
	
	static {
		System.out.println("testtest");
		MyClass2.hello();
	}
}

class MyClass2 {
	static void hello() {
		System.out.println(MyClass.num);
//		System.out.println(MyClass.fields);
		System.out.println(new MyClass().fields);
	}
}
public class Test {
	public static void main(String[] args) {
		MyClass2.hello();
	}
}
