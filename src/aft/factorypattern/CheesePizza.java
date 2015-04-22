package aft.factorypattern;

public class CheesePizza extends AbstractPizza {

	PizzaIngredientFactory pif;
	
	
	public CheesePizza(PizzaIngredientFactory pif) {
		super();
		this.pif = pif;
	}


	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println("¡ÿ∫Ò : "+ name);
		dough = pif.createDough();
		sauce = pif.createSauce();
		cheese = pif.createCheese();
		
		
	}

}
