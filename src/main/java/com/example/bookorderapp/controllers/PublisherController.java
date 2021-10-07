package com.example.bookorderapp.controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.bookorderapp.models.Publisher;

import com.example.bookorderapp.services.PublisherService;

@RestController
public class PublisherController {
@Autowired
private PublisherService pubService;

@GetMapping("/publisher")
public List<Publisher> getPublishers(){
	return this.pubService.getPublishers();
}

@PostMapping("/publisher")
public Publisher postPublisher(@RequestBody Publisher publisher) {
	publisher.setId(UUID.randomUUID().toString());
	return this.pubService.postPublisher(publisher);
}

@GetMapping("/publisher/{publisher_id}")
public Publisher getPublisherById(@PathVariable String publisher_id) {
	return this.pubService.getPublisherById(publisher_id);
}

}
