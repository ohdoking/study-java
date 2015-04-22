package post.adapter;

public class TurkeyAdapter implements Duck{

	Turkey t;
	
	public TurkeyAdapter(Turkey t) {
		this.t = t; 
	}
	@Override
	public void quack() {
		t.gooble();
	}

	@Override
	public void fly() {
		t.fly();
	}

}
