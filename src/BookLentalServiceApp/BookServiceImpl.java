package BookLentalServiceApp;

public class BookServiceImpl implements BookService {
	
	BookRepository br = new BookRepositoryImpl();

	@Override
	public Book getBookInfo(String bookId) {
		return br.findById(bookId);
	}

	@Override
	public void createNewBook(Book book) {
		br.create(book);
	}
}
