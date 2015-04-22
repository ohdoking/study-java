package pre.foreach;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ForeachTest {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("1","3", "5", "7");
		
		for(String item : list) {
			System.out.println(item);
		}
		
		Foreachable f = new Foreachable();
		
		for(String name : f) {
			System.out.println(name);
		}
	}
}

class Foreachable implements Iterable<String>{
	String name1 = "이름 1";
	String name2 = "이름 2";
	String name3 = "이름 3";
	
	public static class MyIterator  implements Iterator<String> {
		private int current = -1;
		private Foreachable f;
		
		private MyIterator(Foreachable f) {
			this.f = f;
		}
		@Override
		public boolean hasNext() {
			return current < 3;
		}

		@Override
		public String next() {
			current++;
			if (current == 0) return f.name1;
			else if (current == 1) return f.name2;
			else if (current ==2) return f.name3;
			return null;
		}

		@Override
		public void remove() {
			// TODO Auto-generated method stub
			
		}
		
	}

	@Override
	public Iterator<String> iterator() {
		return new MyIterator(this);
	}
	
}
