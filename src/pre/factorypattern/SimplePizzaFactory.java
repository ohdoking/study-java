package pre.factorypattern;

public abstract class SimplePizzaFactory {
	
	Pizza pizza;
	
	abstract public  void orderPizza(String type);
	
	public Pizza create(String type){
		
		if(type.equals("cheese"))
		{
			pizza = new CheesePizza(type, 220);
		}
		else if(type.equals("pepperoni"))
		{
			pizza = new PepperoniPizza(type, 320);
		}
		else if(type.equals("thin"))
		{
			pizza = new ThinPizza(type, 20);
		}
		
		return pizza;
		
	}
}
