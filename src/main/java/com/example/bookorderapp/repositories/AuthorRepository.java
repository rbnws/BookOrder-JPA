package com.example.bookorderapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bookorderapp.models.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, String> {

}
