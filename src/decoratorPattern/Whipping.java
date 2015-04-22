package decoratorPattern;

public class Whipping extends CondimentDecorator {

	Beverage b;
	
	public Whipping(Beverage b) {
		// TODO Auto-generated constructor stub
		this.b = b;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Whipping " + b.getDescription();
	}

	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return 400 + b.cost();
	}

}
