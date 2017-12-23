package com.hello.pp.ws.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebServiceController {

	@RequestMapping(method=RequestMethod.GET,value="/employee/{id}")
	public ModelAndView getEmployee(@PathVariable String id){
	System.out.println("employee class method invoked...");
	return new ModelAndView();
	}
}
