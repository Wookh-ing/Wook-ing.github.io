
public class SmartPhone extends Phone{
	private String softWare;
	private String softWareVersion;
	private int memory;
	private String camera;
	private String bluetooth;
	
	public SmartPhone(String maker, int price, int giga, String softWare, String softWareVersion, int memory,
			String camera, String bluetooth) {
		super(maker, price, giga);
		this.softWare = softWare;
		this.softWareVersion = softWareVersion;
		this.memory = memory;
		this.camera = camera;
		this.bluetooth = bluetooth;
	}

	public String getSoftWare() {
		return softWare;
	}

	public void setSoftWare(String softWare) {
		this.softWare = softWare;
	}

	public String getSoftWareVersion() {
		return softWareVersion;
	}

	public void setSoftWareVersion(String softWareVersion) {
		this.softWareVersion = softWareVersion;
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}

	public String getCamera() {
		return camera;
	}

	public void setCamera(String camera) {
		this.camera = camera;
	}

	public String getBluetooth() {
		return bluetooth;
	}

	public void setBluetooth(String bluetooth) {
		this.bluetooth = bluetooth;
	}

	@Override
	public String toString() {
		return super.toString() + "SmartPhone [softWare=" + softWare + ", softWareVersion=" + softWareVersion + ", memory=" + memory +" gb" +
				 ", camera=" + camera + ", bluetooth=" + bluetooth + "]";
	}
	

	
	
	
	
}
