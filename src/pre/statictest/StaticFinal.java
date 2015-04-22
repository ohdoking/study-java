package pre.statictest;

public class StaticFinal {
	
	static int s_value;
	final static int fs_value = ;
	final int f_value;
	int ns_value;
	
	
	public StaticFinal(int f_value)
	{
		this.f_value = f_value;
		System.out.println("constrotor");
	}

	public void methodTest(){
		System.out.println("method");
	}

}
