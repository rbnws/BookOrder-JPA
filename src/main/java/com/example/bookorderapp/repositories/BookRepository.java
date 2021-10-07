package com.example.bookorderapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bookorderapp.models.Book;
@Repository
public interface BookRepository extends JpaRepository<Book, String> {

}
