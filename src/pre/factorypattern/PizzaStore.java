package pre.factorypattern;

public class PizzaStore extends SimplePizzaFactory {

	Pizza pizza;

	SimplePizzaFactory simplePizzaFactory;
	
	
	@Override
	public void orderPizza(String type) {
		// TODO Auto-generated method stub
		pizza = simplePizzaFactory.create(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		
	}
	
}
