package com.example.bookorderapp.models;

//import java.util.List;


import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.persistence.OneToMany;

//import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name="publisher")
public class Publisher {
@Id
private String id;
private String name;
private String location;
//@JsonIgnore
//@OneToMany(mappedBy = "publisher")
//private List<Book> book_list;
//
//
//public List<Book> getBook_list() {
//	return book_list;
//}
//public void setBook_list(List<Book> book_list) {
//	this.book_list = book_list;
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
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
//public void addBook(Book b) {
//	this.book_list.add(b);
//}
@Override
public String toString() {
	return "Publisher [id=" + id + ", name=" + name + ", location=" + location + "]";
}

}
