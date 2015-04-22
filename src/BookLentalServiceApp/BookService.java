package BookLentalServiceApp;

public interface BookService {
	public Book getBookInfo(String bookId);

	void createNewBook(Book book);
}
