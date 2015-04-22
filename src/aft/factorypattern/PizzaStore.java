package aft.factorypattern;

public abstract class PizzaStore {
	
	public void orderPizza(String type){
		
		AbstractPizza p = createPizza(type);
		p.prepare();
		p.bake();
		p.box();
		
	}
	public abstract AbstractPizza createPizza(String type);
}
