package Safari;

public class Meat extends Animal{
	private String food;
	private String species;
	
	public Meat(String name, int age, double weight, String food, String species) {
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
		return super.toString() +  "Meat [food=" + food + ", species=" + species + "]";
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Meat)) {
			return false;
		}
		Meat other = (Meat) obj;
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


