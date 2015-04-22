package BookLentalServiceApp;

import java.util.HashMap;
import java.util.Map;

public class BookRepositoryImpl implements BookRepository {
	Map<String, Book> bookDb = new HashMap<String, Book>();
	
	public BookRepositoryImpl() {
		bookDb.put("1", new Book("1", "아프니까 청춘이다."));
		bookDb.put("2", new Book("2", "Head First Design Patterns"));
	}
	
	@Override
	public Book findById(String bookId) {
		return bookDb.get(bookId);
	}

	@Override
	public void create(Book book) {
		bookDb.put(book.getId(), book);
	}

}
