package pre.factorypattern;

abstract public class Pizza {
	
	
	abstract public void prepare();
	abstract public void bake();
	abstract public void cut();
	
	public void box(){
		System.out.println("ÀÌ»Ú°Ô");
	};
	
	
	
	
}
