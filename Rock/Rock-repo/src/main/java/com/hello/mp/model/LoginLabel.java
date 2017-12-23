package com.hello.mp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="loginlabel")
public class LoginLabel {

@Id
@Column(name="sno")
private Integer sno;

@Column(name="label_name")
private String labelName;

@Column(name="fk")
private Integer fk;

public Integer getSno() {
	return sno;
}

public void setSno(Integer sno) {
	this.sno = sno;
}

public String getLabelName() {
	return labelName;
}

public void setLabelName(String labelName) {
	this.labelName = labelName;
}

public Integer getFk() {
	return fk;
}

public void setFk(Integer fk) {
	this.fk = fk;
}

}
