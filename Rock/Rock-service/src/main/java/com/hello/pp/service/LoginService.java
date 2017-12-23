package com.hello.pp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hello.pp.model.UserDto;
import com.hello.pp.repository.LoginRepository;

@Service
public class LoginService {

@Autowired
private LoginRepository loginRepository;


/*@RequestMapping(value="/good",method=RequestMethod.POST)
public void serviceMethod(@ModelAttribute("list")UserDto ud){
	
	System.out.println("service method starts....");
	System. out.println("user name is : "+ud.getEmailId());
	System.out.println("password is : "+ud.getPassword());
	System.out.println("service method ends....");
	System.out.println("......................");
    loginRepository.loginRepo(ud);
    
	
}
*/
public boolean serviceMethod(UserDto dto)
{
	 boolean flag=false;
	
	 List<UserDto> list = loginRepository.adminSignIn(dto.getEmailId(), dto.getPassword());
	if(list!=null && !list.isEmpty()){
		flag=true;
		System.out.println("coming at login service if cond");

	}
	else
	{
		System.out.println("No Email and password matched");
	}
	return flag;
}

}
