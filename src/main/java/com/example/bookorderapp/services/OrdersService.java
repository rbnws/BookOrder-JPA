package com.example.bookorderapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bookorderapp.models.Orders;
import com.example.bookorderapp.repositories.BookRepository;
import com.example.bookorderapp.repositories.CustomerRepository;
import com.example.bookorderapp.repositories.OrdersRepository;

@Service
public class OrdersService {
	@Autowired
	private OrdersRepository ordersRepository;
	
	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private BookRepository bookRepository;
	
	public List<Orders> getAllOrders() {
		// TODO Auto-generated method stub
		return this.ordersRepository.findAll();
	}

	public Orders createNewOrder(Orders o, String customer_id) {
		// TODO Auto-generated method stub
		o.setCustomer(customerRepository.findById(customer_id).get());
		return this.ordersRepository.save(o);
	}

	public Orders updateOrderAddBook(String order_id, String book_id) {
		// TODO Auto-generated method stub
		Orders o = this.ordersRepository.findById(order_id).get();
		o.addBook(this.bookRepository.findById(book_id).get());
		return this.ordersRepository.save(o);
		
	}

	public Orders getOrderById(String order_id) {
		// TODO Auto-generated method stub
		return this.ordersRepository.findById(order_id).get();
	}

	public Orders deleteOrderById(String order_id) {
		// TODO Auto-generated method stub
		Orders s = this.ordersRepository.findById(order_id).get();
		this.ordersRepository.delete(s);
		return s;
	}
	
}
