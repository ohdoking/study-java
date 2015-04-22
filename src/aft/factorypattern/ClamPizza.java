package aft.factorypattern;

public class ClamPizza extends AbstractPizza {
	PizzaIngredientFactory pif;
	
	
	public  ClamPizza(PizzaIngredientFactory pif) {
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
		clam = pif.createClam();
		
		
	}
}
