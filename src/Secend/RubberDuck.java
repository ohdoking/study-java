package Secend;

public class RubberDuck extends Duck implements Quackable {
	
	@Override
	public void display(){
		System.out.println("����");
	}

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("Quack");
	}


	
}
