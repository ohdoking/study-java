package post.iterator;

import java.util.Hashtable;
import java.util.Iterator;

public class CafeMenu implements Menu {

	Hashtable<String, MenuItem> menuItems = new Hashtable<String, MenuItem>();
	
	
	
	public CafeMenu() {
	}


	public void addItem(String name, String description, boolean vegetarian, double price) {

		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.put(menuItem.getName() , menuItem);
		
	}


	@Override
	public Iterator<MenuItem> createIterator() {
		return menuItems.values().iterator();
	}

	
}
