package com.example.bookorderapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bookorderapp.models.Orders;
@Repository
public interface OrdersRepository extends JpaRepository<Orders, String> {

}
