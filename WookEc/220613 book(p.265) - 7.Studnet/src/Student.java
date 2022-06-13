
public class Student {
	private String name;
	private int num;
	private String Class;
	private	int grad;
	private int sco;
	
	public Student(String name, int num, String Class, int grad, int sco) {
		this.name = name;
		this.num = num;
		this.Class = Class;
		this.grad = grad;
		this.sco = sco;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getClass() {
		return Class;
	}

	public void setClass(String Class) {
		this.Class = Class;
	}

	public int getGrad() {
		return grad;
	}

	public void setGrad(int grad) {
		this.grad = grad;
	}

	public int getSco() {
		return sco;
	}

	public void setSco(int sco) {
		this.sco = sco;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", num=" + num + ", Class=" + Class + ", grad=" + grad + ", sco=" + sco + "]";
	}
	
	
	
	
}
