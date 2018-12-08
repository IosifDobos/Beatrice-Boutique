package com.example.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.example.business.CartItem;
import com.example.business.Product;
import com.example.business.ShoppingCart;

public class AddToCartCommand implements Command{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String forwardToJSP = "";
		
		HttpSession session = request.getSession();
		
		
		int quantity = Integer.parseInt(request.getParameter("quantity"));
		int productID = Integer.parseInt(request.getParameter("productToCart"));
		String productName = request.getParameter("productName");
		
		Product product = null; 
		ArrayList<Product> products = (ArrayList<Product>) request.getSession().getAttribute("products"); 
		
		for(int i = 0; i < products.size(); i++) {
			if(products.get(i).getId() == productID) {
				product = products.get(i);
			}
		}
		
		CartItem cartItem = new CartItem(productID, productName, quantity,  product.getPrice());
		
		ShoppingCart shoppingCart = (ShoppingCart)(request.getSession().getAttribute("shoppingCart")); 
		shoppingCart.additem(cartItem);		
		
		session.setAttribute("shoppingCart", shoppingCart);
		
		
		forwardToJSP = "/shoppingCart.jsp";		
		return forwardToJSP;
	}

}
