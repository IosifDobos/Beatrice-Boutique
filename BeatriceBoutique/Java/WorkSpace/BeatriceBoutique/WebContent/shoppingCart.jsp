<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import =  "java.util.ArrayList" %>
<%@ page import = "com.example.business.ShoppingCart" %>
<%@ page import = "com.example.business.CartItem" %>   
<%@ page import = "java.util.*" %> 

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="styleSheet.css">
<title>Shopping Cart</title>
</head>
<body>

	<h1>Shopping Cart</h1>
	
	<ul>
		<li><a href="homePage.html">Home Page</a></li>
		<li><a href="shoppingCart.html">Shopping Cart</a></li>
		<li><a href="contact.html">Contact US</a></li>
		<li><a href="login.html">Login/Register</a></li>
	</ul>
	
	
	<div class ="container">
		<h1> Shopping Cart Items</h1>
		
		<% 	ArrayList<CartItem> cartItems = (ArrayList<CartItem>) request.getSession().getAttribute("cartItems"); %> --%>
	<table border="1">
		<tr>
			<th>Name</th>
			<th>Quantity</th>
			<th>UnitPrice</th>
			<th>Total Price</th>
		</tr>
		<% for(int i = 0; i < cartItems.size(); i++){ %>
			<td><%= cartItems.get(i).getProductName() %></td>
			<td><%= cartItems.get(i).getQuantity() %></td>
			<td><%= cartItems.get(i).getPrice() %></td>
			<td><%= cartItems.get(i).getTotalCost()%></td>
		<%} %>
	</table>
	
	</div>

</body>
</html>