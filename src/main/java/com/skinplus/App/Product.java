package com.skinplus.App;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;


@Component
@Entity
public class Product {
	@Id
	int productId;
	int productPrice;
	String productName;
//	String productType;
//	String mfDate;
//	String exDate;
//	String productBrand;
	public Product(int productId, int productPrice, String productName) {
	
		this.productId = productId;
		this.productPrice = productPrice;
		this.productName = productName;
	}
  
	public Product()
	{
		
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}
	

}
