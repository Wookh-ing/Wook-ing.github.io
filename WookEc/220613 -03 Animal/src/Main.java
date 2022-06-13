
public class Main {
	public static void main(String[] args) {
		Cat c = new Cat("잠을 잘 잡니다", "밥을 먹습니다", "잘 놉니다");
		c.sleep();
		c.eat();
		c.play();
		
		Dog d = new Dog("잠을 잘 잡니다", "밥을 먹습니다", "멍멍");
		d.sleep();
		d.eat();
		d.bark();
	}
}
