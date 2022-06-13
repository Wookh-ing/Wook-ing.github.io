
public class Student extends Human{
	private String major;

	public Student(String name, int age, String profession, String major) {
		super(name, age, profession);
		this.major = major;
	}
	
	@Override
//	return toString() + major;	   => 본인의 toString을 불러오기때문에 계속 반복
	public String toString() {
//		return name + age + major  => name과 age가 private 하기때문에 오류
//		return "이름: " + getName() + "나이: " + getAge + major;
		return super.toString() + "  " + "전공: " + major + "  " +getProfession();
	}
	
	@Override
	public String getProfession() {
		return "학생";
	}
	
	
	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	public static void main(String[] args) {
		Student s1 = new Student("명진", 19, "학생", "컴퓨터");
		Student s2 = new Student("미현", 20, "학생", "경영");
		Student s3 = new Student("용준", 21, "학생", "경제");
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
	}
	
	
}
