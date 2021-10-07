package com.example.bookorderapp.controllers;


import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookorderapp.models.Customer;
import com.example.bookorderapp.services.CustomerService;

@RestController
public class CustomerController {
	@Autowired
	private CustomerService custService;
	
	@GetMapping("/customers")
	public List<Customer> getCustomers(){
		return this.custService.getCustomers();
	}
	
	@PostMapping("/customers")
	public Customer postCustomer(@RequestBody Customer customer) {
		customer.setId(UUID.randomUUID().toString());
		return this.custService.postCustomer(customer);
	}
	
	@DeleteMapping("/customers/{customer_id}")
	public Customer deleteCustomerById(@PathVariable String customer_id) {
		return this.custService.deleteCustomerById(customer_id);
	}
}
