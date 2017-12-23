package com.hello.pp.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hello.pp.model.UserDto;
import com.hello.pp.service.LoginService;
import com.hello.pp.service.RS;
import com.hello.pp.validator.ResistrationValidation;

@Controller
public class RC {

@Autowired
private RS rs;

@Autowired
private ResistrationValidation validation;
	
@RequestMapping("/resistrationpage")
public String showLogin(Map<String, Object> map){
	//loginService.serviceMethod();
	UserDto user=new UserDto();
	map.put("list", user);
	return "resistrationpage";
	
}

/*@RequestMapping(value="/resistrationpage",method=RequestMethod.POST)
public String loginMethod(@ModelAttribute("list")UserDto dto){
	
	System.out.println("This is RC page");
	
	if(rs.saveServiceResistration(dto)){
		System.out.println("if part is running...");
		return "resistrationpage";

	}
	
		else{
			System.out.println("else  part runnning....");

			return "resistrationpage";	
		}
	

	}*/


/*//........logincontroller and validator class  relationship.................

@RequestMapping(value="/resistrationpage",method=RequestMethod.POST)
public String vaildResistrationMethod(@ModelAttribute("list")UserDto dto,BindingResult result){
	System.out.println("we have come to valid resistation method....");
	validation.validate(dto, result);
	
	if(result.hasErrors()){
		System.out.println("Null values in fields......");
		return "resistrationpage";
	}
	else{
		System.out.println("there is 'NO' errors");
		return null;
	}
}*/


@RequestMapping(value="/resistrationpage",method=RequestMethod.POST)
public String loginMethod(@ModelAttribute("list")UserDto dto,BindingResult result){
	
	System.out.println("This is RC page");
	
	if(rs.saveServiceResistration(dto)){
		validation.validate(dto, result);
		System.out.println("if part is running and validation called here.....");
		if(result.hasErrors()){
			System.out.println("Null values in fields......");
	        System.out.println("emai id ok"+dto.getEmailId()+" "+dto.getPassword());

			return "resistrationpage";
		}
		ModelAndView mv=new ModelAndView("resistrationpage");
		System.out.println("no null value");
		return "resistrationpage";

	}
	
		else{
			
			System.out.println("else  part runnning....");

			return "resistrationpage";	
		}
	

	}
}


