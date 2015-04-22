package decoratorPattern;

public class Americano extends Beverage{
	public Americano() {
		// TODO Auto-generated constructor stub
		this.description = "아메리카노";
	}

	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return 1000;
	}
}
