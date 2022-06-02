// 강아지 Dog 클래스
// name : 이름
// breed : 종
// age : 나이

// 강아지 3개의 모든 필드를 전달받아 초기화 할 수 있는
// 생성자

// 강아지 이름, 종을 전달받은 값으로 초기화 하고
// 나이는 1살로 초기화 할 수 있는 생성자

// 모든 필드를 private 접근 제한자로 정보은닉(캡슐화)
// 각 필드이 public 한 getter/setter 를 작성해 보세요.

public class Dog { // 클래스, 필드
	private String name;
	private String breed;
	private int age;
	
	// 필드의 이름과 파라미터 안의 이름이 같아도 컴파일은 되지만, 서로가 가장 가까운 것 을 칭하기때문에 같은것을 칭하게 되어 값이 같아진다.
	
	public Dog(){
		
	}
	public Dog(String name, String breed, int age){ // 생성자
		this.name = name;
		this.breed = breed;
		this.age = age;
	}
	
	public Dog(String name, String breed) { // 강아지 이름, 종을 전달받은 값으로 초기화하고 
		this(name, breed, 1);               // 나이는 1살로 초기화 하는 생성자
		System.out.println("초기화");
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getBreed() {
		return this.breed;
	}
	
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	void printAll() {
		System.out.println(name);
		System.out.println(breed);
		System.out.println(age);
	}
}