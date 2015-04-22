package Secend;

public class RedheadDuck extends Duck implements Flyable,Quackable{
	@Override
	public void display(){
		System.out.println("redheadDuck");
	}
	
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("fly!!");
	}
	
	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("quack!!");
	}
}
