package pre.factorypattern;

public class PepperoniPizza extends Pizza {

	private String name;
	private int price;
	
	public PepperoniPizza(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	@Override
	public void prepare() {
		System.out.println(name);
	}

	@Override
	public void bake() {
		System.out.println("hot");
	}

	@Override
	public void cut() {
		System.out.println("µ¿±Û");
		
	}

}
