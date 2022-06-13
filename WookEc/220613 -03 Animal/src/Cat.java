
public class Cat extends Animal {
	String play;

	public Cat(String sleep, String eat, String play) {
		super(sleep, eat);
		this.play = play;
	}

	public String getPlay() {
		return play;
	}
	
	public void play() {
		System.out.println("잘 놉니다");
	}
}
