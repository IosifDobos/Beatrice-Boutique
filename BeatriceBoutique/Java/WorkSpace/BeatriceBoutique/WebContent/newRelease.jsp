<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import =  "java.util.ArrayList" %>
<%@ page import = "com.example.business.Product"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Release</title>
</head>
<body>
	
	<h1>Beatrice's Boutique / New Release</h1>
	
	<ul>
		<li><a href="homePage.html">Home Page</a></li>
		<li><a href="shoppingCart.jsp">Shopping Cart</a></li>
		<li><a href="contact.html">Contact US</a></li>
		<li><a href="login.html">Login/Register</a></li>
	</ul>
	
	
	<div class = "container">
		<!-- left side of the container where menu is displayed -->
		<div id="sidemenu">
			<a href="newRelease.jsp">New Releases</a>
			<a href="womensClothes.jsp">Women's Dress</a>
			<a href="mensClothes.jsp">Men's Dress</a>
		</div>
		<!-- right side of the container -->
		<div id="right-side">
			<h2>New Release</h2>
			
			<br/><br/>
			<% ArrayList<Product> products;
			products = (ArrayList)(request.getSession().getAttribute("allProductsList")); %>
			<table>
				<% for(int i=0; i<products.size(); i++){
					Product product = products.get(i);  %>
				<tr>
					<td><%= products.get(i).getProductName() %></td>
					<td><%= products.get(i).getPrice() %></td>
					<td>	
					<form action="FrontController" method="post">		
					<input type="text" name="quantity"/>
					<input  type="hidden" name="productToCart" value="<%= products.get(i).getId()%>" />
				     <input type="hidden" name="action" value="AddToCart" />
			         <input type="submit" value="action" />
			   		</form>
			   		</td>
				</tr>
				<% } %>
		</table>
			
		</div>
		
		<form action="FrontController" method="post">
	     <input type="hidden" name="action" value="ViewShoppingCart" />
         <input type="submit" value="View Shopping Cart" />
    </form>
	
	</div>

</body>
</html>