package com.example.bookorderapp.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bookorderapp.models.Author;
import com.example.bookorderapp.repositories.AuthorRepository;

@Service
public class AuthorService {

	@Autowired
	private AuthorRepository authorRepository;

	public List<Author> getAuthor() {
		// TODO Auto-generated method stub
		return this.authorRepository.findAll();
	}

	public Author postAuthor(Author author) {
		// TODO Auto-generated method stub
		authorRepository.save(author);
		return author;
	}

	public Author getAuthorById(String author_id) {
		// TODO Auto-generated method stub
		return this.authorRepository.findById(author_id).get();
	}

	public Author deleteAuthorById(String author_id) {
		// TODO Auto-generated method stub
		Author a = this.authorRepository.findById(author_id).get();
		this.authorRepository.deleteById(author_id);
		return a;
	}
	
	
}
