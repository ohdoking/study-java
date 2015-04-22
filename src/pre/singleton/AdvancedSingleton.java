package pre.singleton;

public class AdvancedSingleton {
	private AdvancedSingleton() {
		
	}
	
	public static AdvancedSingleton getInstance(){
//		AdvancedSingleton as =  new AdvancedSingleton();
//		as.new SingletonHolder();
//		
//		new SingletonHolder();
//		return null;
		return SingletonHolder.inst;
		
	}
	
	public static void print(){
		System.out.println("Advanced Singleton");
	}
	private static class SingletonHolder{
		
		static{
			System.out.println("d이너클래스");
		}
		static AdvancedSingleton inst = new AdvancedSingleton();
	}
}
