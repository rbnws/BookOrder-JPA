package com.example.bookorderapp.controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookorderapp.models.Book;
//import com.example.bookorderapp.repositories.AuthorRepository;
//import com.example.bookorderapp.repositories.PublisherRepository;
import com.example.bookorderapp.services.BookService;

@RestController
public class BookController {
	@Autowired
	private BookService bs;
	
	
	@PostMapping("/book/{author_id}/{publisher_id}")
	Book postBook(@PathVariable String author_id, @PathVariable String publisher_id, @RequestBody Book book){
		book.setId(UUID.randomUUID().toString());
		return bs.postBook(author_id, publisher_id, book);
	}
	
	@GetMapping("/book")
	List<Book> getBooks(){
		return this.bs.getBooks();
	}
	@GetMapping("/book/{book_id}")
	public Book getBookById(@PathVariable String book_id) {
		return this.bs.getBookById(book_id);
	}
	
	@DeleteMapping("/book/{book_id}")
	public Book deleteBookById(@PathVariable String book_id) {
		return this.bs.deleteBookById(book_id);
	}
}
