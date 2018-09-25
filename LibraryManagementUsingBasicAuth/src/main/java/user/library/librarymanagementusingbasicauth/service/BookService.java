package user.library.librarymanagementusingbasicauth.service;

import java.util.List;

import user.library.librarymanagementusingbasicauth.model.Book;

public interface BookService {

	Book getBookById(Long bookId);
	void createBook(Book book);
	void deleteBookById(Long bookId);
	List<Book> getAllBooks();
}
