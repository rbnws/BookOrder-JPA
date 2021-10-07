package com.example.bookorderapp.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity(name = "orders")
public class Orders {

	@Id
	private String id;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="Customer_id", referencedColumnName = "id")
	private Customer customer;
	
	@OneToMany(targetEntity = Book.class)
	private List<Book> book_list;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<Book> getBook_list() {
		return book_list;
	}

	public void setBook_list(List<Book> book_list) {
		this.book_list = book_list;
	}

	@Override
	public String toString() {
		return "Orders [id=" + id + ", customer=" + customer + "]";
	}
	
	
	public void addBook(Book b) {
		this.book_list.add(b);
	}
	
	
}
