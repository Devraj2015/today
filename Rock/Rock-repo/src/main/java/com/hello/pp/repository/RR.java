package com.hello.pp.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.hello.pp.model.UserDto;



@Repository
public class RR {

@Autowired
private HibernateTemplate hibernateTemplate;


public UserDto saveResistration(@ModelAttribute("list")UserDto dto){
	System.out.println("This is RR page");

	
	if(dto!=null){
		hibernateTemplate.saveOrUpdate(dto);
		return dto;
	}
	else{
		return null;
	}
	

	
}


}
