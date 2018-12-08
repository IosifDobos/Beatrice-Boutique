package com.example.business;

import java.util.ArrayList;

public class ShoppingCart {
	
	int cartID;
	int numberOfitems;
	float cartPrice = 0;
	ArrayList<CartItem> cartItems = new ArrayList<CartItem>();
	
	public ShoppingCart(int cartID, int numberOfitems, float cartPrice){
		this.cartID = cartID;
		this.numberOfitems = numberOfitems;
		this.cartPrice = cartPrice;
	}
	
	public void additem(CartItem cartItem) {
		cartItems.add(cartItem);
	}
	
	public ArrayList<CartItem> showCartItems() {
		return cartItems;
	}
	
	public void removeItem(int cartItemId) {
		
	}
	
	public void calculateTotalPrice(int numberOfItems, float cartItems) {
		cartItems += numberOfitems;  
	}

}
