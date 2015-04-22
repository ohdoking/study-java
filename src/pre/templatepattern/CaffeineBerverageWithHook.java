package pre.templatepattern;

abstract public class CaffeineBerverageWithHook {

	final void prepareRecipe(){
		boilWater();
		brew();
		pourInCup();
		if(customerWantsCondiments()){
			addCondiments();
		}
	}

	boolean customerWantsCondiments() {
		return true;
	}

	abstract void brew();
	abstract void addCondiments();

	public void boilWater(){
		System.out.println("끓이는 중 ..");
		
	}
	public void pourInCup(){
		System.out.println("컵에 부어라");
	}
}
