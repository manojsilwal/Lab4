package com.example.validate;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.example.domain.Product;

@Component
public class CustomizeValidation implements Validator{

	@Override
	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void validate(Object target, Errors error) {
		// TODO Auto-generated method stub
		Product product = (Product) target;
		if(!product.getName().equals("manoj")){
			error.rejectValue("name", "validator.message");
		}
	}

}
