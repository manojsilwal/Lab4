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

import com.example.domain.Customer;
import com.example.service.CustomerService;
import com.example.validate.CustomizeValidation;

@Controller
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private CustomizeValidation validator;
	
	/*product page showing list of products*/
	@RequestMapping(value="/customers", method=RequestMethod.GET)
	public String getAll(Model model){
		model.addAttribute("customers",customerService.findAll());
		return "customers";
	}
	
	/*product detail page*/
	@RequestMapping(value="/customer/{username}", method=RequestMethod.GET)
	public String getProduct(@PathVariable String username, Model model){
		
		Customer customer = customerService.findByUsername(username);
		if(customer!=null){
			model.addAttribute("customer",customer);
		}
		return "customerDetail";
	}
	
	/*addProduct page*/
	@RequestMapping(value="/addCustomer", method=RequestMethod.GET)
	public String addProduct(Model model){
		model.addAttribute("customer", new Customer());
		return "addCustomer";
	}
	
	
	/*save product into storage*/
	@RequestMapping(value="/addCustomer", method=RequestMethod.POST)
	public String saveProduct(@Valid @ModelAttribute("customer") Customer customer, BindingResult result){
		if(result.hasErrors()){
			System.out.println(result);
			return "addCustomer";
		}
		customerService.addProduct(customer);
		return "redirect:/customers";
	}
	
	/*update product page*/
	@RequestMapping(value="/updateCustomer/{username}", method=RequestMethod.GET)
	public String updateProduct(@PathVariable String username, Model model){
		model.addAttribute("customer", customerService.findByUsername(username));
		return "addCustomer";
	}
	
	@RequestMapping(value="/deleteCustomer/{username}", method=RequestMethod.GET)
	public String deleteProduct(@PathVariable String username){
		customerService.remove(customerService.findByUsername(username));
		return "redirect:/customers";
	}
}
