
public class Animal {
	protected String sleep;
	protected String eat;
	
	public Animal(String sleep, String eat) {
		this.sleep = sleep;
		this.eat = eat;
	}

	public String getSleep() {
		return sleep;
	}

	public String getEat() {
		return eat;
	}
	
	public void sleep() {
		System.out.println("잠을 잡니다");
	}
	
	public void eat() {
		System.out.println("밥을 먹습니다");
	}
}
