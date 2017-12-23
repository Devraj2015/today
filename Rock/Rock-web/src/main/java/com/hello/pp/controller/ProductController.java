package com.hello.pp.controller;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hello.pp.model.ProductDto;
import com.hello.pp.model.UserDto;
import com.hello.pp.repository.ProductRepo;
import com.hello.pp.service.ProductService;
import com.hello.pp.validator.ProductValidation;

@Controller
public class ProductController {

@Autowired
private ProductService ps;
	

@Autowired
private ProductRepo pr;

/*@Autowired
private ProductValidation pv;
*/
@RequestMapping("/product")
public String showProduct(Map<String, Object> map){
	//loginService.serviceMethod();
	ProductDto product=new ProductDto();
	map.put("list", product);
	return "product";
	
}

@RequestMapping(value="/pro",method=RequestMethod.POST)
public String loginMethod(@ModelAttribute("list")ProductDto dto,BindingResult result,ModelMap model){
	
	
	System.out.println("we come to product controller.....");
    if(ps.saveServiceResistration(dto)){
    	System.out.println("product constroller if part");
    	List<ProductDto> list=pr.repoGet();
    	
    	Iterator<ProductDto> it=list.iterator();
    	while(it.hasNext()){
    		ProductDto pd=it.next();
    		System.out.println(pd.getProductId()+" "+pd.getProductName());
    	}
    	
    	model.addAttribute("productlist",list);
    	
    	/*System.out.println(model.get("productlist"));*/
    	//pv.validate(dto, result);
    	return "product";
    }
    else{
    	
    	System.out.println("product constroller else part");
         return "product";
    }
	
	
}

/*@RequestMapping(value="/productpage",method={RequestMethod.GET,RequestMethod.POST})
public String productControllerMethod(@ModelAttribute("list")ProductDto dto,BindingResult result,ModelMap model){
if(RequestMethod.GET.equals("GET")){
	System.out.println("get method called");
	return "productpage";
}
else if(RequestMethod.POST.equals("POST")){
	System.out.println("post method called");

	return "productpage";

}
else{
	System.out.println("product else part is called....");
	return "productpage";

}

}*/
}
