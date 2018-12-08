package com.example.business;

import java.io.Serializable;

public class Product implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String productName;
	private String description;
	private int stock;
	private double price;
	
	
	public Product(int id, String productName, String description, int stock, double price) {
		setId(id);
		setProductName(productName);
		setDescription(description);
		setStock(stock);
		setPrice(price);
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public int getStock() {
		return stock;
	}


	public void setStock(int stock) {
		this.stock = stock;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
}
