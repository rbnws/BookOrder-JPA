package com.example.bookorderapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bookorderapp.models.Publisher;

@Repository
public interface PublisherRepository extends JpaRepository<Publisher, String> {

}
