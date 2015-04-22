package BookLentalServiceApp;

public class BookController extends Controller{
	
	BookService bs = new BookServiceImpl();
	
	public Book requestBookInfo(String bookId)
	{
		return bs.getBookInfo(bookId);
	}
	
	public void createNewBook(Book book) {
		bs.createNewBook(book);
	}
}
