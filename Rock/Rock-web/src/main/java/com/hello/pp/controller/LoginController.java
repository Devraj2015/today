package com.hello.pp.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hello.pp.model.UserDto;
import com.hello.pp.service.LoginService;

@Controller
public class LoginController {

@Autowired
private LoginService loginService;
	
	
@RequestMapping("/loginpage")
public String showLogin(Map<String, Object> map){
	//loginService.serviceMethod();
	UserDto user=new UserDto();
	map.put("list", user);
	return "login";
	
}
/*@RequestMapping(value="/good",method=RequestMethod.POST)
private String showMethod(@ModelAttribute("list")UserDto user){
	System.out.println(user.getEmailId());
	System.out.println(user.getPassword());
	
	System.out.println("This is loginconctroller");
	loginService.serviceMethod(user);
	return "login";
}*/
@RequestMapping(value="/good",method=RequestMethod.POST)
public String loginMethod(@ModelAttribute("list")UserDto dto){
	
	
	System.out.println("we come to controller.....");
	loginService.serviceMethod(dto);
	if(loginService.serviceMethod(dto)){
		System.out.println("welcome page is come");
		
		/*Here is we are perfoming Internization starts */
/*		ModelAndView mv=new ModelAndView("login");
		*/
		/*Here is we are perfoming Internization ends*/
		
		return "welcome";
	}
	else{
		System.out.println("welcome  page is not come....");
		return "login";
	}
}

}
