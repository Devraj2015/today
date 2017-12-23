package com.hello.pp.repository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.hello.pp.model.ProductDto;


@Repository
public class ProductRepo {

@Autowired
private HibernateTemplate hibernateTemplate;

public ProductDto productR(@ModelAttribute("list")ProductDto dto) 
{
	System.out.println("this is produc repo class");
	
	if(dto!=null){
		hibernateTemplate.saveOrUpdate(dto);
		return dto;
	}
	else{
		return null;
	}
	
}

/*public List<ProductDto> repoGet(int ProductId,String ProductName,int Price,String productCategories){
	
		List<ProductDto> list=hibernateTemplate.find("from ProductDto");
         return (List<ProductDto>) list.get(0);
}*/

public List<ProductDto> repoGet(){

List<ProductDto> list=hibernateTemplate.find("from ProductDto");
 return list;
}

}
