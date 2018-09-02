package com.jwt.product.app;

import static org.junit.Assert.assertEquals;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.jwt.product.app.entity.Product;
import com.jwt.product.app.repo.ProductRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductDemoApplicationTests {

	@Autowired
	ProductRepository productRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testCreate() {

		Product product = new Product();
		product.setId(1);
		product.setName("Iphone");
		product.setDesc("Awesome");
		product.setPrice(1000d);
		productRepository.save(product);

	}
	
	@Test
	public void testRead() {
		Optional<Product> findById = productRepository.findById(1);
		Product product = findById.get();
		System.out.println(product.getDesc());
		assertEquals("Iphone", product.getName());
	}
	
	@Test
	public void testUpdate() {
		Optional<Product> findById = productRepository.findById(1);
		Product product = findById.get();
		System.out.println(product.getPrice());
		product.setPrice(1200d);
		productRepository.save(product);
		System.out.println(product.getPrice());
	}
	
	@Test
	public void testDelete() {
		productRepository.deleteById(1);
	}

}
