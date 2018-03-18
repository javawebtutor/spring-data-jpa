package com.jwt.pds.app.repo;

import org.springframework.data.repository.CrudRepository;

import com.jwt.pds.app.entity.Person;

public interface PersonRepository extends CrudRepository<Person, Long> {

}
