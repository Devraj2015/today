package com.hello.pp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hello.pp.model.ProductDto;
import com.hello.pp.model.UserDto;
import com.hello.pp.repository.LoginRepository;
import com.hello.pp.repository.ProductRepo;
import com.hello.pp.repository.RR;

@Service
public class ProductService {

	@Autowired
	private ProductRepo pr;
		
	public boolean  saveServiceResistration(ProductDto dto)
	{
		
		System.out.println("This is Product service page");

		 pr.productR(dto);
		 if(dto!=null){
			 return true;
		 }
		 else{
			 return false;
		 }
	}
	
/*	public boolean displayProductDetails(){
	System.out.println("this is displayProductDetails method");	
	List list=pr.repoGet();
	if(list.size()>0){
		return true;
	}
	else{
		return false;
	}
	}*/

}
