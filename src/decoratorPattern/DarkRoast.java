package decoratorPattern;

public class DarkRoast extends Beverage {
	public DarkRoast() {
		this.description = "��ũ �ν�Ʈ";
	}

	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return 2000;
	}
}
