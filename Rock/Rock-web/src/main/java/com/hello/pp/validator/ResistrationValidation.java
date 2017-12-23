package com.hello.pp.validator;


import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.hello.pp.model.UserDto;

@Component
public class ResistrationValidation implements Validator{

	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		
		return UserDto.class.isAssignableFrom(clazz);
	}

	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		
		/*Validation for null value check----------->>*/
	
		/*UserDto dto=(UserDto) target;
		ValidationUtils.rejectIfEmpty(errors,"emailId", "emailId", "emailId is required");
		ValidationUtils.rejectIfEmpty(errors,"password", "password", "password is required");
		ValidationUtils.rejectIfEmpty(errors,"name", "name", "name is required");
		ValidationUtils.rejectIfEmpty(errors, "lastname","lastname", "lastname is required");
		ValidationUtils.rejectIfEmpty(errors,"address", "address", "address is required");
		*/
	   /* Form validation starts from here------------>>*/
		
		
		/* Validation With Error properties file starts */
		
		UserDto dto=(UserDto) target;
		ValidationUtils.rejectIfEmpty(errors,"emailId", "error.emailId");
		ValidationUtils.rejectIfEmpty(errors,"password", "error.password");
		ValidationUtils.rejectIfEmpty(errors,"name", "error.name");
		ValidationUtils.rejectIfEmpty(errors, "lastname","error.lastname");
		ValidationUtils.rejectIfEmpty(errors,"address", "error.address");
		
		/* Validation With Error properties  file ends ....*/
		
		
		
		
		
		
		String emailId,password,name,lastname,address;
		
		emailId=dto.getEmailId();
		password=dto.getPassword();
		name=dto.getName();
		lastname=dto.getLastname();
		address=dto.getAddress();
		
		
		if(emailId.trim().length()<9){
			errors.rejectValue("emailId","emailId","length is less than 9");
			}

		else if(emailId.trim().length()>15){
			errors.rejectValue("emailId","emailId","length is greater than 14");
			}
		
		else if(emailId.contains("@") !=true){
		    errors.rejectValue("emailId","emailId","@ is required");
			}
		
		

		if(password.trim().length()<9){
			errors.rejectValue("password","password","length is less than 8");
			}

		if(password.trim().length()>17){
			errors.rejectValue("password","password","length is greater than 17");
			}
		
		}
	
	    }
