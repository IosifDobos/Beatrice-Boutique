DROP TABLE ShoppingCart;
DROP TABLE CartItem;
DROP TABLE Product;
DROP TABLE User

Create Table User(
	ID int NOT NULL AUTO_INCREMENT,
	FIRST_NAME varchar(50) NOT NULL,
	LAST_NAME varchar(50) NOT NULL,
	ADDRESS_LINE_1 varchar(100) NOT NULL,
	ADDRESS_LINE_2 varchar(100) NOT NULL,
	PHONE_NO number(10) NOT NULL,
	EMAIL number(100) NOT NULL,
	USERNAME varchar(20) NOT NULL,
	PASSWORD varchar(20) NOT NULL,

	PRIMARY KEY (ID)

);

Create Table Product(
	ID int NOT NULL AUTO_INCREMENT,
	PRODUCT_NAME varchar(100) NOT NULL,
	DESCRIPTION varchar(255) NOT NULL,
	QUANTITY number(3) NOT NULL,
	PRICE number(5,2) NOT NULL,
	IMAGE varchar(255) NOT NULL,

	PRIMARY KEY (ID)
);

Create Table ShoppingCart(
	ID int NOT NULL AUTO_INCREMENT,
	USER_SHOPPINGCARTID int NOT NULL,

	PRIMARY KEY (ID),
	FOREIGN KEY FK_ShoppingCart_User(USER_SHOPPINGCARTID) REFERENCES User(ID),
	UNIQUE USER_SHOPPINGCARTID

);

Create Table CartItem(
	ID int NOT NULL AUTO_INCREMENT,
	PRODUCT_NAME varchar(100) NOT NULL,
	QUANTITY number(3) NOT NULL,
	PRICE number(5,2) NOT NULL
	TOTAL_COST number(8,2) NOT NULL,
	PRODUCT_CARTITEMID int NOT NULL,
	SHOPPINGCART_CARTITEMID number NOT NULL,

	PRIMARY KEY(ID),
	FOREIGN KEY FK_Product_CartItem(PRODUCT_CARTITEMID) REFERENCES Product(ID),
	FOREIGN KEY FK_CartItem_ShoppingCart(SHOPPINGCART_CARTITEMID) REFERENCES ShoppingCart(ID)

);

INSERT INTO Product VALUES(null, "Fatih Zeurek Wine", "100% cotton quality",
	20, 150.00, "iosifdobos/Documents/College/Software Engineering III/BeatriceBoutique/Java/Images/download.jpeg");


