package com.hello.pp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hello.pp.model.UserDto;
import com.hello.pp.repository.LoginRepository;
import com.hello.pp.repository.RR;

@Service
public class RS {

@Autowired
private RR rr;
	
public boolean  saveServiceResistration(UserDto dto)
{
	
	System.out.println("This is RS page");

	 rr.saveResistration(dto);
	 if(dto!=null){
		 return true;
	 }
	 else{
		 return false;
	 }
}

}
