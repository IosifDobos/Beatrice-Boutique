package com.example.service;

import java.util.ArrayList;

import com.example.business.Product;
import com.example.dao.ProductDao;
import com.example.exceptions.DaoException;

public class ProductService {

	ProductDao dao = new ProductDao();
	
	public ArrayList<Product> getAllProducts() {
		
		ArrayList<Product> product = null;
		
		try {
			product = (ArrayList<Product>) dao.getAllProducts();
		} catch (DaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return product;	
	}
	
}
