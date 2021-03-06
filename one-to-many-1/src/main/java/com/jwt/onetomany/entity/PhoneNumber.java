package com.jwt.onetomany.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="phone_number")
public class PhoneNumber {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String number;
	private String type;
	
	/*@ManyToOne
	@JoinColumn(name = "customer_id")
	@JsonIgnore
	private Customer customer;*/
	
	

	public PhoneNumber() {
	}

	/*public PhoneNumber(Customer customer) {
		this.customer = customer;
	}*/

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	/*public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}*/
	
	

}
