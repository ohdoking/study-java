package post.adapter;

public class TestDuckSet {

	public static void main(String[] args) {
		Duck md = new MallardDuck();
		Duck wt = new TurkeyAdapter(new WildTurkey());
		
		md.fly();
		wt.fly();
		
		md.quack();
		wt.quack();
	}
}
