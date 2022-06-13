
public class Person {
	private String name;
	protected int age;
//	부모의 접근제한자가 private 만 아니면 다른 자식 클래스에서 불러와 쓸수있다.
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}
