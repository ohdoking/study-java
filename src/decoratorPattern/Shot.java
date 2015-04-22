package decoratorPattern;

public class Shot extends CondimentDecorator{
   Beverage b;
   
   public Shot(Beverage b) {
	// TODO Auto-generated constructor stub
	   this.b = b;
}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Shot "+b.getDescription();
	}

	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return 500+b.cost();
	}
	
}
