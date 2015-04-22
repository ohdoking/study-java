package post.iterator2;

import java.util.ArrayList;
import java.util.List;

public class TestRemoveB {
	public static void main(String[] args) {

		List<String> l = new ArrayList<String>();
		
		l.add("apple");
		l.add("banana");
		l.add("can");
		
		int z = l.size();

		for(int i = 0; i < z ; i ++){
			if(l.get(i).startsWith("b")){
				System.out.println(l.get(i)+" 삭제됨");
				l.remove(i);
			}
		}
		
		
		
	}
	
}
