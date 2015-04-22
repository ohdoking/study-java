package aft.factorypattern;

public abstract class AbstractPizza {
	
	String name;
	Dough dough;
	Sauce sauce;
	Veggies Veggies[];
	Cheese cheese;
	Pepperoni pepperoni;
	Clams clam;
	
	
	public abstract void prepare();
	public void bake(){
		System.out.println("350도에서 25분 굽기");
	}
	public void cut(){
		System.out.println("Cut");
	}
	public void box(){
		System.out.println("box");
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	
	public String toString(){
		return name;
	}
	
	
	
	
}
