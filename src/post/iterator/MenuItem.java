package post.iterator;

public class MenuItem {

	String name;
	String description;
	Boolean vegetarian;
	double price;
	
	public MenuItem(String name, String description, Boolean vegetarian,
			double price) {
		super();
		this.name = name;
		this.description = description;
		this.vegetarian = vegetarian;
		this.price = price;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	String getDescription() {
		return description;
	}
	void setDescription(String description) {
		this.description = description;
	}
	Boolean getVegetarian() {
		return vegetarian;
	}
	void setVegetarian(Boolean vegetarian) {
		this.vegetarian = vegetarian;
	}
	double getPrice() {
		return price;
	}
	void setPrice(double price) {
		this.price = price;
	}
}
