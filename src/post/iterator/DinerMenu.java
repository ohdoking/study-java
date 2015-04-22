package post.iterator;

public class DinerMenu implements Menu {

	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	MenuItem[] menuItems;

	
	public DinerMenu() {
	
		menuItems = new MenuItem[MAX_ITEMS];
		addItem("채식주의자용 BLT","통밀 메뉴",true,2.99);
		addItem(" BLT","채식 아님통밀 메뉴",true,2.99);
		addItem("스프","스프 메뉴",true,4.99);
		addItem("핫도그","핫도그 메뉴",true,3.99);
	}


	private void addItem(String name, String description, boolean vegetarian, double price) {

		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		
		if(numberOfItems >= MAX_ITEMS){
			System.out.println("가득참");
			
		}
		else{
			menuItems[numberOfItems] = menuItem;
			numberOfItems = numberOfItems + 1;
			
		}
		
		
	}
	
//	public MenuItem[] getMenuItems(){
//		return menuItems;
//	}
	
	
	public java.util.Iterator<MenuItem> createIterator(){
		return new DinerMenuIterator(menuItems);
	}
	
}
