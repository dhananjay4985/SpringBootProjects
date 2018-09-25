package user.library.librarymanagementusingbasicauth.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import user.library.librarymanagementusingbasicauth.model.Book;
import user.library.librarymanagementusingbasicauth.service.BookService;

@RestController
@RequestMapping("/books")
public class BookController {

	private BookService bookService;

	@PutMapping("/addbook")
	public void addBook(@RequestBody Book book) {
		bookService.createBook(book);
	}

	@GetMapping("/book/{bookId}")
	public Book getBookById(@PathVariable("bookId") Long bookId) {
		return bookService.getBookById(bookId);
	}

	@GetMapping
	public List<Book> getAllBooks(){
		return bookService.getAllBooks();
	}
	
	@DeleteMapping("/books/{bookId}")
	public void deleteBookById(@PathVariable("bookId") Long bookId) {
		bookService.deleteBookById(bookId);
	}
	
	
}
