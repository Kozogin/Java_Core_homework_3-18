package ua.lviv.ua;

public class Animal {
	
	private String typeAnimals;
	private String name;
	
	public Animal(String typeAnimals, String name) {
		super();
		this.typeAnimals = typeAnimals;
		this.name = name;
	}

	public String getTypeAnimals() {
		return typeAnimals;
	}

	public void setTypeAnimals(String typeAnimals) {
		this.typeAnimals = typeAnimals;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	
	
	@Override
	public String toString() {
		return "Animal [typeAnimals=" + typeAnimals + ", name=" + name + "]";
	}
		
}
