package pre.statictest;

import pre.statictest.Singleton.A;
import pre.statictest.Singleton.B;

public class SingletonTest {
	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		
		A a = singleton.new A();
		B b = new Singleton.B();
	}
}
