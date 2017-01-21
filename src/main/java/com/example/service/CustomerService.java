package com.example.service;

import java.util.List;

import com.example.domain.Customer;


public interface CustomerService {
	public List<Customer> findAll();
	public Customer findByUsername(String username);
	public void addProduct(Customer customer);
	public void remove(Customer customer);
	public void updateCustomer(Customer customer);
}
