package com.jwt.onetomany.repo;

import org.springframework.data.repository.CrudRepository;

import com.jwt.onetomany.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
