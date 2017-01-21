package com.example.repository;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.parsing.Problem;
import org.springframework.stereotype.Repository;

import com.example.domain.Customer;
import com.example.domain.Product;

@Repository
public class CustomerRepo{
	Map<String,Customer> customers = new HashMap<>();

	@SuppressWarnings("deprecation")
	public CustomerRepo(){
		Customer customer = new Customer();
		customer.setUsername("manoj");
		String value="25/04/2013";
		try {
			customer.setBirthdate(new SimpleDateFormat("dd/MM/yyyy").parse(value));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		customer.setPassword("12345");
		customer.setSex("male");
		customers.put(customer.getUsername(),customer);
	}
	
	
	public Customer getCustomer(String username){
		
		return customers.get(username);
		
	}
	public List<Customer> findAll(){
		return new ArrayList<Customer>(customers.values());
	}
	
	public Customer remove(Customer customer){
		return customers.remove(customer.getUsername());
	}
	
	public void addCustomer(Customer customer){
		customers.put(customer.getUsername(), customer);
	}
	public void updateCustomer(Customer customer){
		customers.remove(customer.getUsername());
		customers.put(customer.getUsername(), customer);
	}
	
	
}
