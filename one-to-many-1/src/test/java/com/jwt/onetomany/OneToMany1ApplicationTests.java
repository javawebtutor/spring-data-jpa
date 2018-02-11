package com.jwt.onetomany;

import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.jwt.onetomany.entity.Customer;
import com.jwt.onetomany.entity.PhoneNumber;
import com.jwt.onetomany.repo.CustomerRepository;


@RunWith(SpringRunner.class)
@SpringBootTest
public class OneToMany1ApplicationTests {

	@Autowired
	CustomerRepository repository;

	@Test
	public void testCreateCustomer() {
		Customer customer = new Customer();
		customer.setName("Mukesh new");

		PhoneNumber phoneNumber = new PhoneNumber();
		phoneNumber.setNumber("1234");
		phoneNumber.setType("Home No");

		PhoneNumber phoneNumber1 = new PhoneNumber();
		phoneNumber1.setNumber("5678");
		phoneNumber1.setType("Office No");

		customer.addPhoneNumber(phoneNumber);
		customer.addPhoneNumber(phoneNumber1);

		repository.save(customer);
	}
	
	@Test
	@Transactional
	public void testLoadCustomer() {
		Customer customer = repository.findOne(4L);
		System.out.println(customer.getName());
		
		Set<PhoneNumber> phoneNumbers = customer.getPhoneNumbers();
		phoneNumbers.forEach(number -> System.out.println(number.getNumber()));
	}
	
	@Test
	public void testUpdateCustomer() {
		Customer customer = repository.findOne(4L);
		customer.setName("Ravi");
		
		Set<PhoneNumber> phoneNumbers = customer.getPhoneNumbers();
		phoneNumbers.forEach(number -> number.setNumber("893965"));
		
		repository.save(customer);
	}
	
	

}
