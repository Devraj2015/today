package com.hello.pp.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.hello.pp.model.ProductDto;

public class ProductValidation implements Validator{

	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return ProductDto.class.isAssignableFrom(clazz);
	}

	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		ProductDto dto=(ProductDto) target;
		ValidationUtils.rejectIfEmpty(errors, "productId","productId","ProductId Not Null");
		ValidationUtils.rejectIfEmpty(errors, "productName","productName", "productName Not Null");
		ValidationUtils.rejectIfEmpty(errors, "price","price", "price Not Null");
		ValidationUtils.rejectIfEmpty(errors, "productCategories","productCategories", "productCategories Not Null");

		
	}

}
