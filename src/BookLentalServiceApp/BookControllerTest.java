package BookLentalServiceApp;

import static org.junit.Assert.*;

import org.junit.Test;

public class BookControllerTest {

	@Test
	public void testRequestBookInfo() {
		BookController controller = new BookController();
		
		Book book = controller.requestBookInfo("2");
		
		assertTrue(book.getTitle().equals("Head First Design Patterns1"));
		
//		fail("Not yet implemented");
	}

}
