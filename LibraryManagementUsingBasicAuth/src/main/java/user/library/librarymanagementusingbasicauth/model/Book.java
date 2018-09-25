package user.library.librarymanagementusingbasicauth.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="book")
public class Book {

	@Id
	@GeneratedValue
	@Column(name="bookId")
	private Long bookId;
	
	@Column(name = "bookname")
	private String bookName;
	
	@Column(name = "author")
	private String author;
	
	@Column(name = "genre")
	private String genre;
	
	@Column(name="isbn")
	private String isbn;

	public Book() {
		super();
	}
	
	public Book(Long bookId, String bookName, String author, String genre, String isbn) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
		this.genre = genre;
		this.isbn = isbn;
	}

	public Long getBookId() {
		return bookId;
	}

	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", author=" + author + ", genre=" + genre
				+ ", isbn=" + isbn + "]";
	}
}
