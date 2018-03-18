package com.jwt.pds.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.pds.app.entity.Person;
import com.jwt.pds.app.repo.PersonRepository;

@RestController
public class PersonController {

	@Autowired
	PersonRepository personRepository;

	@PostMapping(path = "/addperson")
	public ResponseEntity<?> addPerson(@RequestBody Person person) {
		Person savePerson = personRepository.save(person);
		return new ResponseEntity<>(savePerson, HttpStatus.CREATED);

	}

}
