package com.example.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.domain.Product;
import com.example.service.ProductService;
import com.example.validate.CustomizeValidation;


@Controller
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@Autowired
	private CustomizeValidation validator;
	
	
	
	/*product page showing list of products*/
	@RequestMapping(value="/products", method=RequestMethod.GET)
	public String getAll(Model model){
		model.addAttribute("products",productService.findAll());
		return "products";
	}
	
	/*product detail page*/
	@RequestMapping(value="/product/{productId}", method=RequestMethod.GET)
	public String getProduct(@PathVariable String productId, Model model){
		
		Product product = productService.findById(productId);
		if(product!=null){
			model.addAttribute("product",product);
		}
		return "productDetail";
	}
	
	/*addProduct page*/
	@RequestMapping(value="/addProduct", method=RequestMethod.GET)
	public String addProduct(Model model){
		model.addAttribute("product", new Product());
		return "addProduct";
	}
	
	
	/*save product into storage*/
	@RequestMapping(value="/addProduct", method=RequestMethod.POST)
	public String saveProduct(@Valid @ModelAttribute("product") Product product, BindingResult result){
		validator.validate(product, result);
		if(result.hasErrors()){
			return "addProduct";
		}
		productService.addProduct(product);
		return "redirect:/products";
	}
	
	/*update product page*/
	@RequestMapping(value="/updateProduct/{productId}", method=RequestMethod.GET)
	public String updateProduct(@PathVariable String productId, Model model){
		model.addAttribute("product", productService.findById(productId));
		return "addProduct";
	}
	
	@RequestMapping(value="/deleteProduct/{productId}", method=RequestMethod.GET)
	public String deleteProduct(@PathVariable String productId){
		productService.remove(productService.findById(productId));
		return "redirect:/products";
	}
	
}
