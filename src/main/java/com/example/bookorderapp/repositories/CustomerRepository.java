package com.example.bookorderapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bookorderapp.models.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer, String> {

}
