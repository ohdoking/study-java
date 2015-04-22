package post.iterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestIterator {

	public static void main(String[] args) {
		Set<String> inPocket = new HashSet<String>();
		
		inPocket.add("열쇠");
		inPocket.add("스마트폰");
		inPocket.add("돈");
		inPocket.add("지갑");
		inPocket.add("이어폰");
		inPocket.add("동전");
		
		Iterator<String> iterator = inPocket.iterator();
		
		for(int i = 0 ; i < inPocket.size() ; i++){
			System.out.println(iterator.next());
			iterator.hasNext();
		}
		
		
		
		
	}
	
}
