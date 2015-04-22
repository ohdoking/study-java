package BookLentalServiceApp;

public interface BookRepository {
	public Book findById(String bookId);

	public void create(Book book);
}
