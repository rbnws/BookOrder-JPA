package com.example.bookorderapp.models;

//import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.persistence.OneToMany;

//import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name="author")
public
class Author {
@Id
private String id;
private String name;

//@JsonIgnore
//@OneToMany(mappedBy = "author")
//private List<Book> book_list;
//
//
//public List<Book> getBook_list() {
//	return book_list;
//}
//public void setBook_list(List<Book> book_list) {
//	this.book_list = book_list;
//}

//public void addBook(Book b) {
//	this.book_list.add(b);
//}
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
@Override
public String toString() {
	return "Author [id=" + id + ", name=" + name + "]";
}

}
