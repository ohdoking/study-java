package Secend;

public class MallardDuck extends Duck implements Flyable,Quackable{
	@Override
	public void display(){
		System.out.println("MallardDuck");
	}
	
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("fly!!");
	}

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("Quack");
	}
}
