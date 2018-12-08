package com.example.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.example.business.Product;
import com.example.service.ProductService;



public class ListProductsCommand implements Command {
	
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		
		ProductService productService = new ProductService();
		String forwardToJsp = "";
		
		ArrayList<Product>  allProducts = (ArrayList<Product>) productService.getAllProducts();
		
		if(allProducts != null) {
			HttpSession session = request.getSession();
			
			session.setAttribute("products", allProducts);
			forwardToJsp = "/newRelease.jsp";
		}
		else {
			forwardToJsp = "/errorPage.jsp";
		}
			
		
		return forwardToJsp;
		
	}

}
