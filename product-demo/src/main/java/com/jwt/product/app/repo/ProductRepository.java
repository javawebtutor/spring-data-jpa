package com.jwt.product.app.repo;

import org.springframework.data.repository.CrudRepository;

import com.jwt.product.app.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {
	
	

}
