package user.library.librarymanagementusingbasicauth.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import user.library.librarymanagementusingbasicauth.exception.ResourceNotFoundException;
import user.library.librarymanagementusingbasicauth.model.Book;
import user.library.librarymanagementusingbasicauth.repository.BookRepository;
import user.library.librarymanagementusingbasicauth.service.BookService;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	private BookRepository bookRepository;

	@Override
	public Book getBookById(Long bookId) {
		return bookRepository.findById(bookId)
				.orElseThrow(()-> new ResourceNotFoundException("bookId", "Book",bookId));
	}

	@Override
	public void createBook(Book book) {
		bookRepository.save(book);
	}

	@Override
	public void deleteBookById(Long bookId) {
		bookRepository.deleteById(bookId);
		
	}

	@Override
	public List<Book> getAllBooks() {
		return bookRepository.findAll();
	}

	
}
