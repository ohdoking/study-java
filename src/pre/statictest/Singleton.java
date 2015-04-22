package pre.statictest;

public class Singleton {
	public static Singleton getInstance() {
		return SingletonHolder.instance;
	}
	private Singleton() {
		System.out.println("생성됨");
	}
	
	private static class SingletonHolder {
		public static Singleton instance = new Singleton();
	}
	
	public class A {
		
	}
	
	public static class B {
		
	}
}
