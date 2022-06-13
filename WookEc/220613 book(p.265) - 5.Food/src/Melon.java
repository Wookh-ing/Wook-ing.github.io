
public class Melon extends Food{
	private String where;

	public Melon(int kcal, int price, int weight, String where) {
		super(kcal, price, weight);
		this.where = where;
	}

	public String getWhere() {
		return where;
	}

	public void setWhere(String where) {
		this.where = where;
	}
	@Override
	public String toString() {
		return  super.toString() + " " +"경작농원: " + where;
	}
}
