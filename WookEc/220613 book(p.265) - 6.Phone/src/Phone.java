
public class Phone {
	private String maker;
	private int price;
	private int giga;
	
	public Phone(String maker, int price, int giga) {
		this.maker = maker;
		this.price = price;
		this.giga = giga;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getGiga() {
		return giga;
	}

	public void setGiga(int giga) {
		this.giga = giga;
	}

	@Override
	public String toString() {
		return "Phone [maker=" + maker + ", price=" + price + "원" + ", giga=" + giga +"g"+ "]";
	}
	
	
}
