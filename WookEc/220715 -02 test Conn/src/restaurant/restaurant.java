package restaurant;

public class restaurant {
	private int prime;
	private String tradeName;
	private String tel;
	private String adress;
	public restaurant(int prime, String tradeName, String tel, String adress) {
		super();
		this.prime = prime;
		this.tradeName = tradeName;
		this.tel = tel;
		this.adress = adress;
	}
	
	
	public restaurant(String tradeName, String tel, String adress) {
		super();
		this.tradeName = tradeName;
		this.tel = tel;
		this.adress = adress;
	}


	public int getPrime() {
		return prime;
	}
	public String getTradeName() {
		return tradeName;
	}
	public String getTel() {
		return tel;
	}
	public String getAdress() {
		return adress;
	}
	public void setPrime(int prime) {
		this.prime = prime;
	}
	public void setTradeName(String tradeName) {
		this.tradeName = tradeName;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	@Override
	public String toString() {
		return "restaurant [prime=" + prime + "], tradeName=" + tradeName + ", tel=" + tel + ", adress=" + adress + "]\n";
	}
	
	
}
