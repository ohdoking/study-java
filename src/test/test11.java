package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class test11 {

	public static void main(String[] args) {
		
		
		Map<String,String> t = new HashMap<String, String>();
		
		t.put("hi", "1");
		t.put("hi1", "2");
		t.put("hi2", "3");
		t.put("hi3", "4");
		
		Iterator<Entry<String, String>> s = t.entrySet().iterator();
		
		
		while(s.hasNext()) {
			System.out.println(s.next());
		}
		
		
		
		
		
		
		
	}
	
	
}
	
