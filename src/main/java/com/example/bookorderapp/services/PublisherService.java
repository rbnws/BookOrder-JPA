package com.example.bookorderapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bookorderapp.models.Publisher;
import com.example.bookorderapp.repositories.PublisherRepository;

@Service
public class PublisherService {
@Autowired
private PublisherRepository pubRepository;

public List<Publisher> getPublishers() {
	// TODO Auto-generated method stub
	return this.pubRepository.findAll();
}

public Publisher postPublisher(Publisher publisher) {
	// TODO Auto-generated method stub
	this.pubRepository.save(publisher);
	return publisher;
}

public Publisher getPublisherById(String publisher_id) {
	// TODO Auto-generated method stub
	return this.pubRepository.findById(publisher_id).get();
}
}
