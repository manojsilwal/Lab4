package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.Customer;
import com.example.repository.CustomerRepo;


@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired 
	CustomerRepo customerRepo;
	
	@Override
	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		
		return customerRepo.findAll();
	}

	@Override
	public Customer findByUsername(String username) {
		// TODO Auto-generated method stub
		return customerRepo.getCustomer(username);
	}

	@Override
	public void addProduct(Customer customer) {
		// TODO Auto-generated method stub
		customerRepo.addCustomer(customer);
	}

	@Override
	public void remove(Customer product) {
		// TODO Auto-generated method stub
		customerRepo.remove(product);
		
	}

	@Override
	public void updateCustomer(Customer product) {
		// TODO Auto-generated method stub
		customerRepo.updateCustomer(product);
	}

	
	
}
