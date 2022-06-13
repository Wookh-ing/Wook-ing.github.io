
public class Student extends Person{
	private int score;
	
	public Student(String name, int age, int score) {
//		super 은 생성자의 첫째문장에 와야한다.
//		super 을 쓰면 부모의 생성자 부분을 들고온다.
		super(name, age);
		this.score = score;
	}
	
	public int getAge() {
		return age;
	}
	

	public int getScore() {
		return score;
	}

	
	
	
	
	
		
	
}
