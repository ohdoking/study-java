package pre.templatepattern;

public class Tea extends CaffeineBeverage{

	@Override
	void brew() {
		System.out.println("Tea Brew");
	}

	@Override
	void addCondiments() {
		System.out.println("Add Lemon");
	}

}
