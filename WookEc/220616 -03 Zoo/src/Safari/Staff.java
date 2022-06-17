package Safari;

public class Staff {
	private String name;
	private String part;
	
	public Staff(String name, String part) {
		this.name = name;
		this.part = part;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPart() {
		return part;
	}

	public void setPart(String part) {
		this.part = part;
	}

	@Override
	public String toString() {
		return "Staff [name=" + name + ", part=" + part + "]";
	}
	
	
}	
