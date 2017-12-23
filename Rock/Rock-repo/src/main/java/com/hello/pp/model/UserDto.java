package com.hello.pp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="UserDto")
public class UserDto {

@Id
@Column(name="emailId")
private String emailId;

@Column(name="password")
private String password;

@Column(name="name")
private String name;

@Column(name="lastname")
private String lastname;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getLastname() {
	return lastname;
}

public void setLastname(String lastname) {
	this.lastname = lastname;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

@Column(name="address")
private String address;

public String getEmailId() {
	return emailId;
}

public void setEmailId(String emailId) {
	this.emailId = emailId;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

}
