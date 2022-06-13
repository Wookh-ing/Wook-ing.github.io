class Employee {
	public String name;		// 이름: 공용 멤버
	String address;			// 주소: 패키지 멤버
	protected int salary;	// 월급: 보호 멤버
	private int RRN;		// 주미등록번호: 전용 멤버
	
	public Employee() {}
	
	public Employee(String name, String address, int salary, int RRN) {
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.RRN = RRN;
	}

	public String toString() {
		return name + ", " + address + ", " + RRN + ", " + salary;
	}
}

class Manager extends Employee {
	private int bonus;
	
	public Manager() {}
	
	public Manager(String name, String address, int salary, int RRN, int bonus) {
		super(name, address, salary, RRN);
		this.bonus = bonus;
	}

	public void printSalary() {
		System.out.println(name + "(" + address + "):" + (salary + bonus));
	}
	
	public void printRRN() {
//		System.out.println(RRN);
	}
}

public class ManagerTest {
	public static void main(String[] args) {
		Manager m = new Manager();
		m.printRRN();
		m.printSalary();
	}
}
