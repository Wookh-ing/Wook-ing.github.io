import java.util.Scanner;

// 회원 관리 프로그램
// 회원을 콘솔입력으로 등록할 수 있게. 최대 10명
// 중복 등록을 하면 X (이름, 키, 몸무게가 동일하면 중복)
// 기준에 따라 집계를 해서 목록을 보여줘야한다.

// 회원
// 이름
// 키
// 몸무게

// BMI 지수
// BMI = 몸무게(kg) / 키^2(m)

// 고도비만 : 35이상    		, 중도비만(2단계비만) : 30이상  35 미만
// 경도비만 : 25이상		, 과체중: 23이상 25미만
// 정상 : 18.5 이상 23 미만	, 저체중: 18.5 미만
public class Member {

	private String name;
	private double height;
	private int weight;
	private double bmi;
	private String bmiP;

	public Member() {}
	
	public Member(String name, double height, int weight, double bmi, String bmiP) {

		this.name = name;
		this.height = height;
		this.weight = weight;
		this.bmi = bmi;
		this.bmiP = bmiP;
	}
	
	
	
	public Member(String name, double height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	public double BMI() {
		return getWeight() / (getHeight() * getHeight());
	}
	

	
	public String Check() {
		if (BMI() >= 35) {
			return "고도비만";
		} else if (BMI() >= 30 && BMI() < 35) {
			return "중도비만";
		} else if (BMI() >= 25 && BMI() < 30) {
			return "경도비만";
		} else if (BMI() >= 23 && BMI() < 25) {
			return "과체중";
		} else if (BMI() >= 30 && BMI() < 35) {
			return "중도비만";
		} else if (BMI() >= 18.5 && BMI() < 23) {
			return "정상";
		} else if (BMI() < 18.5) {
			return "저체중";
		}
		return null;
	}
	
//	public void getInfor() {
//		System.out.print(String.format("%d번 회원의 이름 입력: ", cnt + 1));
//		name = sc.next();
//		System.out.print(String.format("%d번 회원의 키 입력(m단위): ", cnt + 1));
//		height = sc.nextDouble();
//		System.out.print(String.format("%d번 회원의 몸무게 입력(소수점첫째자리까지): ", cnt + 1));
//		weight = sc.nextInt();
//	}
//	void printMem() {
//		System.out.println("--------------------");
//		System.out.println("회원명부");
//		for (Member member : mem) {
//			System.out.print(String.format("%s  + %f + %f", member.getName(), member.getHeight(), member.getWeight()));
//		}
//		System.out.println("--------------------");
//	}
//	
//	void printMemBmi() {
//		System.out.println("--------------------");
//		System.out.println("회원별BMI");
//		for (Member member : mem) {
//			mem.toString();
////			 System.out.print(String.format("%s  + %f", member.getName(), member.BMI()));
//			System.out.println("--------------------");
//		}
//	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Member other = (Member) obj;
		if (Double.doubleToLongBits(bmi) != Double.doubleToLongBits(other.bmi)) {
			return false;
		}
		if (bmiP == null) {
			if (other.bmiP != null) {
				return false;
			}
		} else if (!bmiP.equals(other.bmiP)) {
			return false;
		}
		if (Double.doubleToLongBits(height) != Double.doubleToLongBits(other.height)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (weight != other.weight) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", height=" + height + ""
				+ ", weight=" + weight + ", BMI=" + (String.format("%.2f",BMI())) 
				+ ", FattyLevel=" + Check() + "]";
	}
	
	public String printBmi() {
		return "Member [name=" + name + ", FattyLevel=" + Check() + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public double getBmi() {
		return bmi;
	}

	public void setBmi(double bmi) {
		this.bmi = bmi;
	}

	public String getBmiP() {
		return bmiP;
	}

	public void setBmiP(String bmiP) {
		this.bmiP = bmiP;
	}


	
}

