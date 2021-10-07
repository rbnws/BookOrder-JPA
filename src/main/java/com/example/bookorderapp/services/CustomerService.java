package com.example.bookorderapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bookorderapp.models.Customer;
import com.example.bookorderapp.repositories.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	private CustomerRepository custRepository;

	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		return custRepository.findAll();
	}

	public Customer postCustomer(Customer customer) {
		// TODO Auto-generated method stub
		custRepository.save(customer);
		return customer;
	}

	public Customer deleteCustomerById(String customer_id) {
		// TODO Auto-generated method stub
		Customer c = this.custRepository.findById(customer_id).get();
		this.custRepository.delete(c);
		return c;
	}
}
