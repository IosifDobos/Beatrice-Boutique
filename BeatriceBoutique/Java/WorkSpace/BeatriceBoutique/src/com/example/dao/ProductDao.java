package com.example.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.example.business.Product;
import com.example.exceptions.DaoException;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class ProductDao extends Dao {

	public ArrayList<Product> getAllProducts() throws DaoException{
		
		Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;    	
    	ArrayList<Product> products = new ArrayList<Product>();
		
    	try {
    		con = (Connection) this.getConnection();
    		
			String query = "SELECT * FROM Product";
			ps = (PreparedStatement) con.prepareStatement(query);
			rs = ps.executeQuery();
			
			while(rs.next()) {
	    		
	    		int productId = rs.getInt("ID");
                String name = rs.getString("PRODUCT_NAME");
                String description = rs.getString("DESCRIPTION");
                int stock = rs.getInt("STOCK");
                double price = rs.getDouble("PRICE");
                //String image = rs.getString("IMG");
                
                Product myProduct = new Product(productId, name,description, stock, price);
                products.add(myProduct);
	    	}
		} catch (Exception e) {
			// TODO: handle exception
			throw new DaoException("getAllProducts() " + e.getMessage());
		}finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    freeConnection(con);
                }
            } catch (SQLException e) {
                throw new DaoException("getAllProducts()" + e.getMessage());
            }
        }
		
		return products;
		
	}
	
}