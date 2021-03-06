package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.Product;
import com.example.repository.ProductRepo;


@Service
public class ProductServiceImpl implements ProductService{
	@Autowired 
	ProductRepo productRepo;
	
	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		
		return productRepo.findAll();
	}

	@Override
	public Product findById(String productId) {
		// TODO Auto-generated method stub
		return productRepo.getProduct(productId);
	}

	@Override
	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		productRepo.addProduct(product);
	}

	@Override
	public void remove(Product product) {
		// TODO Auto-generated method stub
		productRepo.remove(product);
		
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub
		productRepo.updateProduct(product);
	}

	
	
}
