package com.example.bookorderapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


//import com.example.bookorderapp.models.Author;
import com.example.bookorderapp.models.Book;
//import com.example.bookorderapp.models.Publisher;
import com.example.bookorderapp.repositories.AuthorRepository;
import com.example.bookorderapp.repositories.BookRepository;
import com.example.bookorderapp.repositories.PublisherRepository;

@Service
public class BookService {
	@Autowired
	private BookRepository bookrepo;
	@Autowired
	private AuthorRepository authorRepository;
	@Autowired
	private PublisherRepository publisherRepository;
	
//	AuthorService s = new AuthorService();
//	PublisherService ps = new PublisherService();
	
	public Book postBook(String author_id, String publisher_id, Book book) {
		// TODO Auto-generated method stub
//		
		book.setAuthor(authorRepository.findById(author_id).get());
		book.setPublisher(publisherRepository.findById(publisher_id).get());
//		bookrepo.save(book);
//		Author a = authorRepository.findById(author_id).get();
//		Publisher p = publisherRepository.findById(publisher_id).get();
//		a.addBook(book);
//		p.addBook(book);
//		book.setAuthor(a);
//		book.setPublisher(p);
		bookrepo.save(book);
		return book;
	}
	public List<Book> getBooks() {
		// TODO Auto-generated method stub
		return this.bookrepo.findAll();
	}
	public Book deleteBookById(String book_id) {
		// TODO Auto-generated method stub
		Book b = this.bookrepo.getById(book_id);
		this.bookrepo.delete(b);
		return b;
	}
	public Book getBookById(String book_id) {
		// TODO Auto-generated method stub
		return this.bookrepo.findById(book_id).get();
	}
	
	
}
