package com.jwt.onetomany.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.onetomany.entity.Customer;
import com.jwt.onetomany.repo.CustomerRepository;

@RestController
public class OnetoManyController {
	
	@Autowired
	CustomerRepository customerRepository;
	
	@PostMapping(path = "/savecustomer", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
		
		customerRepository.save(customer);
		return new ResponseEntity<Customer>(customer , HttpStatus.CREATED );
		
	}
	
	@GetMapping(path = "/customers", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Customer>> getAllCustomer() {
		Iterable<Customer> findAll = customerRepository.findAll();
		List<Customer> customers = (List<Customer>) findAll;
		return new ResponseEntity<List<Customer>>(customers , HttpStatus.OK );
		
	}
	
	

}
