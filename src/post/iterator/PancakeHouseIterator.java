package post.iterator;

import java.util.ArrayList;

public class PancakeHouseIterator implements Iterator<MenuItem>{

	ArrayList<MenuItem> items;
	int pos = 0;
	
	
	public PancakeHouseIterator(ArrayList<MenuItem> menuItems) {
		super();
		this.items = menuItems;
	}

	@Override
	public boolean hasNext() {

		if(pos >= items.size()){
			return false;
		}
		else{
			return true;
		}
	}

	@Override
	public MenuItem next() {
		MenuItem menuItem = items.get(pos);
		pos= pos+1;
		
		return menuItem;
	}

}
