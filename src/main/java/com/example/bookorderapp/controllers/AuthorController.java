package com.example.bookorderapp.controllers;

import java.util.List;
//import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookorderapp.models.Author;
import com.example.bookorderapp.services.AuthorService;

@RestController
public class AuthorController {

		@Autowired
		private AuthorService authorService;
		
		@GetMapping("/author")
		public List<Author> getAuthor(){
			return this.authorService.getAuthor();
		}
		
		@PostMapping("/author")
		public Author postAuthor(@RequestBody Author author) {
			author.setId(UUID.randomUUID().toString());
			return this.authorService.postAuthor(author);
		}
		@GetMapping("/author/{author_id}")
		public Author getAuthorById(@PathVariable String author_id) {
			return this.authorService.getAuthorById(author_id);
		}
		
		@DeleteMapping("/author/{id}")
		public Author deleteAuthorById(@PathVariable String author_id) {
			return this.authorService.deleteAuthorById(author_id);
		}
}
