package post.adapter;

public class MallardDuck implements Duck{

	@Override
	public void quack() {
		System.out.println("청둥오리 꿱");
	}

	@Override
	public void fly() {

		System.out.println("청둥오리 날다");
	}

	
}
