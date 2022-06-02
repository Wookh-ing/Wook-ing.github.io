// 학생

// 이름
// 국어 점수
// 영어 점수
// 수학 점수

// 생성자 
// getter/setter

// 자기 평균 점수를 알려줄 수 있음.

public class Student {
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	public Student() {
		
	}
	
	
	public Student(String n, int k, int e, int m) {
		name = n;
		kor = k;
		eng = e;
		math = m;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public int getKor() {
		return kor;
	}
	
	public void setKor(int k) {
		kor = k;
	}
	
	public int getEng() {
		return eng;
	}
	
	public void setEng(int e) {
		eng = e;
	}
	
	public int getMath() {
		return math;
	}
	
	public void setMath(int m) {
		math = m;
	}
	
	void printAll() {
		System.out.println(name);
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(math);
		//System.out.println(avg);
		
		System.out.println((kor + eng + math )/ 3);
	}
}