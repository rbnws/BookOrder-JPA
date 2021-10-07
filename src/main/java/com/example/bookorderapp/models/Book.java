package com.example.bookorderapp.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="book")
public class Book {
	@Id
	private String id;
	private String name;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="author_id", referencedColumnName = "id")
	private Author author;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="publisher_id", referencedColumnName = "id")
	private Publisher publisher;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public Publisher getPublisher() {
		return publisher;
	}
	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", publisher=" + publisher + "]";
	}
	
}
