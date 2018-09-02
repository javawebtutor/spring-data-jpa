package com.jwt.product.app;

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

}
