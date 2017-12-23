package com.hello.mp.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hello.mp.model.LoginLabel;
import com.hello.pp.model.UserDto;

@Controller
public class AdminController {

/*@RequestMapping(value="/adminpage",method={RequestMethod.GET,RequestMethod.POST})
public String adminMethod(@ModelAttribute("list")LoginLabel label,ModelMap map){
	System.out.println("this is admin controller");

		map.put("list", label);	
		System.out.println("we are in Get method");
		System.out.println(label.getLabelName()+" "+label.getSno()+" "+label.getFk());
		return "admin";
	}
	
	*/
	
	@RequestMapping("/adminpage")
	public String showLogin(Map<String, Object> map){
		//loginService.serviceMethod();
     LoginLabel label=new LoginLabel();
     map.put("list", label);
		return "admin";
		
	}
	@RequestMapping(value="/good",method=RequestMethod.POST)
	public String loginMethod(@ModelAttribute("list")LoginLabel label){
		
		
		System.out.println("we come to Admin controller.....");

			return "admin";
		
		}
	}

