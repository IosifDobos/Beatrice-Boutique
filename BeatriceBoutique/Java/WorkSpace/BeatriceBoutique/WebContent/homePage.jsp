<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import =  "java.util.ArrayList" %>
<%@ page import = "com.example.business.Product"%>

<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="styleSheet.css"> 
<title>BeatriceBoutique</title>
</head>
<body>
	
	<h1>Beatrice's Boutique</h1>
	
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
			<h2>Please select from the left menu the items types you want to see</h2>
		</div>
	
	</div>
	
</body>
</html>