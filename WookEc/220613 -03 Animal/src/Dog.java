
public class Dog extends Animal {
	String bark;

	public Dog(String sleep, String eat, String bark) {
		super(sleep, eat);
		this.bark = bark;
	}

	public String getBark() {
		return bark;
	}

	public void bark() {
		System.out.println("멍멍");
	}
}
