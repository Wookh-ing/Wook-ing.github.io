// 학생 : 이름, 나이
// 영국학생 : Hello
// 한국학생 : 안녕
// 미국인 : Wassup
interface SayHello {
	void hello();
}
// interface 는 interface끼리 extends 가능하다 => 상속가능
interface EngHello extends SayHello {}

interface KorHello extends SayHello {}

interface WatHello extends SayHello {}

class Student {}

class kor extends Student implements SayHello{
	@Override
	public void hello() {
		System.out.println("안녕");
	}
}

class eu extends Student implements SayHello{
	@Override
	public void hello() {	
		System.out.println("Hello");
	}
}

class ame implements SayHello {
	@Override
	public void hello() {
		System.out.println("Wassup");	
	}
}

public class Main2 {
	public static void main(String[] args) {
		SayHello s1 = new kor();
		SayHello s2 = new eu();
		SayHello s3 = new ame();
		
		SayHello[] arr = new SayHello[3];
		arr[0] = s1;
		arr[1] = s2;
		arr[2] = s3;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i].hello();
		}
		
		s1.hello();
		s2.hello();
		s3.hello();
	}
}
