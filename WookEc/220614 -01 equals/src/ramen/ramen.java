package ramen;

import java.util.Objects;

//컵라면
//제조사
//이름
//가격
public class ramen {
	private String name;
	private String maker;
	private int price;
	
	public ramen(String name, String maker, int price) {
		this.name = name;
		this.maker = maker;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	@Override
	public String toString() {
		return "ramen [name=" + name + ", maker=" + maker + ", price=" + price + "원" + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((maker == null) ? 0 : maker.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + price;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof ramen)) {
			return false;
		}
		ramen other = (ramen) obj;
		if (maker == null) {
			if (other.maker != null) {
				return false;
			}
		} else if (!maker.equals(other.maker)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (price != other.price) {
			return false;
		}
		return true;
	}


	
//	@Override
//	public boolean equals(Object obj) {
//		if (obj instanceof ramen) {
//			return name.equals(((ramen) obj).name) 
//				&& maker.equals(((ramen) obj).maker);
//		} else {
//			return false;
//		}
//	} 
//	
	

	
	
	
	
}
