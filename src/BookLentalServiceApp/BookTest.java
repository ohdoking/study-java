package BookLentalServiceApp;

public class BookTest {
	public static void main(String[] args) {
		BookController controller = new BookController();
		
		System.out.println(controller.requestBookInfo("1"));
	}
}
