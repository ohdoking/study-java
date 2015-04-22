package pre.templatepattern;

public class BeverageTestDrive {

	public static void main(String[] args) {
		CoffeeWithHook ch = new CoffeeWithHook();
		
		System.out.println("prepared to coffee....");
		
		ch.prepareRecipe();
	}
}
