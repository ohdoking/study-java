package mar20.generic;

import java.util.ArrayList;
import java.util.Collection;

public class TestGeneric<T> {

	private static Collection<?> c;

	public static void main(String[] args) {
		
		String[] sArray = new String[4];
		Collection<String> sArrayList = new ArrayList<String>();
		int i = 0;
		for(String s : sArray){
			String j = String.valueOf(i);
			sArray[i] = j;
			i++;
		}
		
		fromArrayToCollection1(sArray, sArrayList);
		fromArrayToCollection(sArray, sArrayList);
		
		// PECS
		
		Collection<?> collectgion = sArrayList;
		Collection<? extends Object> collection = collectgion;
	}
	
	static void fromArrayToCollection1(Object[] a, Collection<String> c) {
	    
		for (Object o : a) { 
//	        c.add(o); // compile-time error
	    }
	}
	
	static <T> void fromArrayToCollection(T[] a, Collection<T> c) {
	    for (T o : a) {
	        c.add(o); // Correct
	    }
	}
	
	
	//generic general 
	class MyList<E, d> {
		
		E item;
		
		E dd(d ohdoking){
			System.out.println(ohdoking);
			return item;
		}
	}
	
}
