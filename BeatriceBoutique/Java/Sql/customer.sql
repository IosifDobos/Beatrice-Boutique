CREATE TABLE 'Customer'(
	'ID' (int) NOT NULL AUTO_INCREMENT,
	'USERNAME' varchar(50) NOT NULL,
	'FIRST_NAME' varchar(50) NOT NULL,
	'LAST_NAME' varchar(50) NOT NULL,
	'ADDRESS_LINE_1' varchar(50) NOT NULL,
	'ADDRESS_LINE_2' varchar(50) NOT NULL,
	'PHONE_NO' int(10) NOT NULL,
	'EMAIL' varchar(100) NOT NULL,
	'PASSWORD' varchar(20) NOT NULL
);



INSERT INTO Customer VALUES(null,	"iosifdobos",	"Iosif",	"Dobos",	"Cedarwood Rise, Glasnevin",	"Dublin 11",	0891234534,	"joesman@gmail.com",	"password");	
INSERT INTO Customer VALUES(null,	"carlosc",	"Carlos"	"Conzales",	"Somewehere in Spain",	"Barcelona", 1234567898,	 "carlos_the_man@gmail.com",	"password");	
INSERT INTO Customer VALUES(null, "darrenb",	"Darren",	"Byrne",	"somewhere in Ireland",	"Dublin -12",	454545459,	"darrenb89@gmail.com",	"password");	
INSERT INTO Customer VALUES(null,	"valentinc",	"Valentin",	"Ciceu",	"Smithfield",	"Dublin none",	1231231239,	"valc@gmail.com",	"password");	
