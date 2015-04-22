package pre.factorypattern;

public class ThinPizza extends Pizza {

	private String name;
	private int price;
	
	public ThinPizza(String name, int price) {
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
		System.out.println("Á¶±Ý");
	}

	@Override
	public void cut() {
		System.out.println("»ï°¢");
	}


}
