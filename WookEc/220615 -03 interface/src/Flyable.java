// interface 는 이름에다가 I를 붙혀주기도 한다
// interface 는 추상메소드만 받고있다.
public interface Flyable {
//	public abstract void fly();
//	위의 public abstract => 접근제한자와 추상적을 빼줘도 선언가능.
	void fly();
}

class Animal {}
class Bird extends Animal {}

class Eagle extends Bird implements Flyable{
	@Override
	public void fly() {
		System.out.println("독수리는 푸드득 푸드득 납니다");
	}
	
}

class Penguin extends Bird {}

class FlyingFish extends Animal implements Flyable{
	@Override
	public void fly() {
		System.out.println("날치가 물위로 난다");
	}
}

class Plane implements Flyable {
	@Override
	public void fly() {
		System.out.println("비행기가 난다");
	}
}