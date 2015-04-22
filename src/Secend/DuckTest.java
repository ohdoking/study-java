package Secend;

import org.junit.Test;

public class DuckTest {
	
	public static void main(String[] args) {
		new DuckTest().test();
	}
	public void test(){
		Duck md = new MallardDuck();
		Duck rd = new RedheadDuck();
		Duck rrd = new RubberDuck();
		
		md.display();
		rd.display();

		Flyable flyableDuck = (Flyable)md;
		Flyable flyableDuck2 = (Flyable)rd;
		Flyable flyableDuck3 = (Flyable)rrd;

		
		flyableDuck.fly();
		flyableDuck2.fly();
		flyableDuck3.fly();
		
	}
}
