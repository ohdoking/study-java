package decoratorPattern;

public class DarkRoast extends Beverage {
	public DarkRoast() {
		this.description = "다크 로스트";
	}

	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return 2000;
	}
}
