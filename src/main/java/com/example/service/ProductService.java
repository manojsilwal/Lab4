package com.example.service;

import java.util.List;

import com.example.domain.Product;


public interface ProductService {
	public List<Product> findAll();
	public Product findById(String productId);
	public void addProduct(Product product);
	public void remove(Product product);
	public void update(Product product);
}
