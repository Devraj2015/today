package com.hello.pp.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hello.pp.model.UserDto;



@Repository
public class LoginRepository {

@Autowired
private HibernateTemplate hibernateTemplate;

	
/*@RequestMapping(value="/good",method=RequestMethod.POST)
public void loginRepo(@ModelAttribute("list")UserDto udto){

	This is atributes values are called in service method
	System.out.println("Login repository method starts here");
	System.out.println("email name is : "+udto.getEmailId());
	System.out.println("password repo name is : "+udto.getPassword());
	System.out.println("Login repository method ends here");
}
*/
public List<UserDto> adminSignIn(String emailId, String password) 
{
	if (emailId != null && password != null) 
	{
		List<UserDto> login=hibernateTemplate.find("from UserDto al where al.emailId = ? and al.password = ?",emailId,password);
		return login;
	} else 
	{
		return null;
	}
}


}
