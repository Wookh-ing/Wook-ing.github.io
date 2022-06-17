package Safari;

public class Vegetarian extends Animal{
	private String food;
	private String species;
	
	public Vegetarian(String name, int age, double weight, String food, String species) {
		super(name, age, weight);
		this.food = food;
		this.species = species;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	@Override
	public String toString() {
		return super.toString() + "Vegetarian [food=" + food + ", species=" + species + "]";
	}

	public void printVAll() {
		System.out.println(toString());
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Vegetarian)) {
			return false;
		}
		Vegetarian other = (Vegetarian) obj;
		if (species == null) {
			if (other.species != null) {
				return false;
			}
		} else if (!species.equals(other.species)) {
			return false;
		}
		return true;
	}
	
	
}
