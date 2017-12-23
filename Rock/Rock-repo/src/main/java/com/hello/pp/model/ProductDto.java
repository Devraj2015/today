package com.hello.pp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="productdto")
public class ProductDto {

@Id
@Column(name="productId")
private Integer productId;

@Column(name="productName")
private String productName;

@Column(name="price")
private Integer price;

@Column(name="productCategories")
private String productCategories;

public Integer getProductId() {
	return productId;
}

public void setProductId(Integer productId) {
	this.productId = productId;
}

public String getProductName() {
	return productName;
}

public void setProductName(String productName) {
	this.productName = productName;
}

public Integer getPrice() {
	return price;
}

public void setPrice(Integer price) {
	this.price = price;
}

public String getProductCategories() {
	return productCategories;
}

public void setProductCategories(String productCategories) {
	this.productCategories = productCategories;
}

}
