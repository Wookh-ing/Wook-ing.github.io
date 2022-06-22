import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student>{
	private String name;
	private int age;
	private int score;
	
	public Student(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	public int getScore() {
		return score;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Student)) {
			return false;
		}
		Student other = (Student) obj;
		if (age != other.age) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		return true;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return score - o.score;
	}



	

	
	
	
}
// 학생
// 이름
// 나이

// (학생은 이름과 나이가 같으면 동일 학생입나다)

// 홍길동 15
// 돌리 22
// 도우너 33

// 위의 학생을 원소로 가지는 리스트를 생성하고
// (도우너 33) 학생의 인덱스를 찾아보세요


public class Main2 {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();   
		
		list.add(new Student("홍길동", 15, 90));
		list.add(new Student("돌리", 22, 80));
		list.add(new Student("도우너", 33, 95));
		System.out.println(list);
		
		System.out.println(list.indexOf(new Student("도우너", 33, 0)));
		System.out.println("돌리가 학생목록에 있습니까? " 
		+ list.contains(new Student("도우너", 33)));
		
		// 정렬 = 바로하면 sort 작동이 안된다, 이때 implements Comparable<Student> 해주고
		// CompraeTo 해주면 작동
		Collections.sort(list);
		System.out.println(list);
		
		Comparator<Student> comparator = new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.getAge() - o2.getAge();
			}
		};
		
		Collections.sort(list, comparator);
		System.out.println("\n" + list);
	}
}
