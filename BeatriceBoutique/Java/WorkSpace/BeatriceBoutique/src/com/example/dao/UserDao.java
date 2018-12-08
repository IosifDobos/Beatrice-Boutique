package com.example.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.example.business.User;
import com.example.exceptions.DaoException;


public class UserDao extends Dao {

    public User findUserByUsernamePassword(String username, String password) throws DaoException {

        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        User u = null;
        try {
            con = this.getConnection();
            
            String query = "SELECT * FROM USER WHERE USERNAME = ? AND PASSWORD = ?";
            ps = con.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, password);
            
            int x = ps.executeUpdate();
            if (x > 0) {
//            	int userId = rs.getInt("ID");
//                String lastname = rs.getString("LAST_NAME");
//                String firstname = rs.getString("FIRST_NAME");
//                String addressline1 = rs.getString("ADDRESS_LINE_1");
//                String addressline2 = rs.getString("ADDRESS_LINE_1");
//                int phoneno = rs.getInt("PHONE_NO");
//                String email = rs.getString("EMAIL");
//                String username1 = rs.getString("USERNAME");
//                String password1 = rs.getString("PASSWORD");
//                
//                u = new User(userId, lastname, firstname, addressline1, addressline2, phoneno, email, username1, password1);
            }
        } catch (SQLException e) {
            throw new DaoException("findUserByUsernamePassword " + e.getMessage());
        } finally {
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
                throw new DaoException("findUserByUsernamePassword" + e.getMessage());
            }
        }
        return u;     // u may be null 
    }
    
    public User registerUserIn(String firstName, String lastName, String addressLine1, String addressLine2, String phoneno2, 
			String email, String username, String password) throws DaoException 
    {
    	Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        User user = null;
        
        try {
			con = this.getConnection();
			String query = "INSERT INTO USER (FIRST_NAME, LAST_NAME, ADDRESS_LINE_1, ADDRESS_LINE_2, PHONE_NO, EMAIL, USERNAME, PASSWORD) VALUES(?,?,?,?,?,?,?,?)";
			ps = con.prepareStatement(query);

				ps.setString(1, firstName);
				ps.setString(2, lastName);
				ps.setString(3, addressLine1);
				ps.setString(4, addressLine2);
				ps.setString(5, phoneno2);
				ps.setString(6, email);
				ps.setString(7, username);
				ps.setString(8, password);
				
			ps.executeUpdate();
			
			rs = ps.getResultSet();
			if(rs.next()) {
				int userId = rs.getInt("ID");
                String lastname = rs.getString("LAST_NAME");
                String firstname = rs.getString("FIRST_NAME");
                String addressline1 = rs.getString("ADDRESS_LINE_1");
                String addressline2 = rs.getString("ADDRESS_LINE_1");
                int phoneno = rs.getInt("PHONE_NO");
                String email1 = rs.getString("EMAIL");
                String username1 = rs.getString("USERNAME");
                String password1 = rs.getString("PASSWORD");
                
                user = new User(userId, lastname, firstname, addressline1, addressline2, phoneno, email1, username1, password1);
			}
		} catch (Exception e) {
			// TODO: handle exception
			throw new DaoException("registerUserIn " + e.getMessage());
		}
        finally {
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
                throw new DaoException("registerUserIn" + e.getMessage());
            }
       }
        
        return user;
       
    }
   
}
