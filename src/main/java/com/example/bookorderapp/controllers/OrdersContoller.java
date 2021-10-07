package com.example.bookorderapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.bookorderapp.models.Orders;
import java.util.List;
import java.util.UUID;

import com.example.bookorderapp.services.OrdersService;

@RestController
public class OrdersContoller {
	@Autowired
	private OrdersService ordersService;
	
	@GetMapping("/orders")
	public List<Orders> getAllOrders(){
		return this.ordersService.getAllOrders();
	}
	
	@PostMapping("/orders/{customer_id}")
	public Orders createNewOrder(@PathVariable String customer_id) {
		Orders o = new Orders();
		o.setId(UUID.randomUUID().toString());
		return this.ordersService.createNewOrder(o, customer_id);
	}
	
	@PutMapping("/orders/addbook/{order_id}/{book_id}")
	public Orders updateOrderAddBook(@PathVariable String order_id, @PathVariable String book_id){
		return this.ordersService.updateOrderAddBook(order_id, book_id);
	}
	
	@GetMapping("/orders/{order_id}")
	public Orders getOrderById(@PathVariable String order_id) {
		return this.ordersService.getOrderById(order_id);
	}
	
	@DeleteMapping("/orders/{order_id}")
	public Orders deleteOrderById(@PathVariable String order_id) {
		return this.ordersService.deleteOrderById(order_id);
	}
}
