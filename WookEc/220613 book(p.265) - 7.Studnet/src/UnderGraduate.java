
public class UnderGraduate extends Student{
	private String club;

	public UnderGraduate(String name, int num, String Class, int grad, int sco, String club) {
		super(name, num, Class, grad, sco);
		this.club = club;
	}

	public String getClub() {
		return club;
	}

	public void setClub(String club) {
		this.club = club;
	}

	@Override
	public String toString() {
		return super.toString() + "UnderGraduate [club=" + club + "]";
	}
	
	
	
}
