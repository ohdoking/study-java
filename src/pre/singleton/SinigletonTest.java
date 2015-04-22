package pre.singleton;

import static org.junit.Assert.*;

import org.junit.Test;

public class SinigletonTest {

	public static void main(String[] args) {
/*new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				long start = System.currentTimeMillis();
				
				
				System.out.println("test");
				Sinigleton s = null;
				for(int i = 0 ; i < 10000000 ; i++){
					s = Sinigleton.getInstance();
					s.toString();
				}
				long end = System.currentTimeMillis();
				
				System.out.println((end-start) / 1000.0);
				
			}
		}).start();
		
	
	new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				long start = System.currentTimeMillis();
				
				
				System.out.println("test");
				Sinigleton s = null;
				for(int i = 0 ; i < 10000000 ; i++){
					s = Sinigleton.getInstance();
					s.toString();
				}
				long end = System.currentTimeMillis();
				
				System.out.println((end-start) / 1000.0);
				
			}
		}).start();*/

		
		AdvancedSingleton.print();
		
		AdvancedSingleton.getInstance();
	}
}
