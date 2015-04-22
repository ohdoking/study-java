package post.iterator;

import java.util.ArrayList;

public class Waittress {

	Menu pancakeHouseMenu;
	Menu dinerMenu;
	Menu cafeMenu;
	
	
	public Waittress(Menu pancakeHouseMenu, Menu dinerMenu,Menu cafeMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
		this.cafeMenu = cafeMenu;
	}

	public void printMenu(){
		PancakeHouseMenu phm = new PancakeHouseMenu();
//		ArrayList<MenuItem> breakfastItems = phm.getMenuItems();
		
		DinerMenu dm = new DinerMenu();
		
		java.util.Iterator<MenuItem> iterator = dm.createIterator();
		java.util.Iterator<MenuItem> iterator2 = phm.createIterator();
		java.util.Iterator<MenuItem> cafeIterator = cafeMenu.createIterator();
		
		
//		MenuItem[] lunchItem = dm.getMenuItems();

//		for(int i = 0 ; i < breakfastItems.size() ; i ++  ){
//			MenuItem menuItem = breakfastItems.get(i);
//			System.out.println(menuItem.getName()+" : ");
//			System.out.println(menuItem.getPrice() + " : ");
//			System.out.println(menuItem.getDescription());
//		}
		
		
		printAll(iterator);
//		printAll(iterator2);
		printAll(cafeIterator);
		
	}

	private void printAll(java.util.Iterator<MenuItem> items){
		while(items.hasNext()){
			MenuItem menuItem = items.next();
			System.out.println(menuItem.getName());
			System.out.println(menuItem.getPrice() + " : ");
			System.out.println(menuItem.getDescription());
			
		}
	}
	public void printBreakfasstMenu(){
		
	}
	
	public void printLunchMenu(){
		
	}
	
	public void printVegetarianMenu(){
		
	}
	
	public boolean isItemVegetarian(String name){
		
		
		return false;
		
	}
	
	
	
}
