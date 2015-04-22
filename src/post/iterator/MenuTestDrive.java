package post.iterator;

public class MenuTestDrive {

	public static void main(String[] args) {

		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();
		CafeMenu cafeMenu = new CafeMenu();
		
		Waittress waittress = new Waittress(pancakeHouseMenu, dinerMenu, cafeMenu);
		waittress.printMenu();
	}

}
