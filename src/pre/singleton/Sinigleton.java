package pre.singleton;

public class Sinigleton {
	
	private volatile static Sinigleton uniqueInstance;

	private Sinigleton(){
		
	}
	public static Sinigleton getInstance()
	{
		if(uniqueInstance == null)
		{
			//DCL(Double Checking Locking)
			synchronized (Sinigleton.class) {
				if(uniqueInstance == null)
				{
					uniqueInstance = new Sinigleton();
				}				
			}
		}
		return uniqueInstance;
	}

}
