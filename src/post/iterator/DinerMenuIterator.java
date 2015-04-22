package post.iterator;

public class DinerMenuIterator implements java.util.Iterator<MenuItem> {

	MenuItem[] items;
	int pos = 0;
	
	
	public DinerMenuIterator(MenuItem[] items) {
		this.items = items;
		
	}

	@Override
	public boolean hasNext() {
		if(pos >= items.length || items[pos] == null){
			return false;
		}
		else{
			return true;
		}
	}

	@Override
	public MenuItem next() {
		MenuItem menuItem = items[pos];
		pos= pos+1;
		
		return menuItem;
	}

}
