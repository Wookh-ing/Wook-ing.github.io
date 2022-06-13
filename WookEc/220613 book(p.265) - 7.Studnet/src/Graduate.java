
public class Graduate extends Student{
	private String assistant;
	private int Ratio;
	
	
	public Graduate(String name, int num, String Class, int grad, int sco, String assistant, int ratio) {
		super(name, num, Class, grad, sco);
		this.assistant = assistant;
		Ratio = ratio;
	}


	public String getAssistant() {
		return assistant;
	}


	public void setAssistant(String assistant) {
		this.assistant = assistant;
	}


	public int getRatio() {
		return Ratio;
	}


	public void setRatio(int ratio) {
		Ratio = ratio;
	}
	
	
	
	
}
