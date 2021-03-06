package com.example.business;


public class CartItem{

	/**
	 * 
	 */
	private int id;
	private String productName;
	private int quantity;
	private double price;
	
	public CartItem(int id, String productName, int quantity, double price) {
		this.setId(id);
		this.setProductName(productName);
		this.setQuantity(quantity);
		this.setPrice(price);
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

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTotalCost() {
		return (double) this.quantity * price;
	}

	
	

}
