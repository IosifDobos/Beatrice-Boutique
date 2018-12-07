# Beatrice-Boutique Online Shop

## Introduction
For this assignment I managed to create an online shop called BeatriceBoutique. For first delivery an design analysis requirement is need in order to create the web server application. Use case are used to show the interaction between user and system itself which describe the activities and shows the possibilities of a goal to be achieved. Customer use case shows the activities and possibilities that user have when access the website.

## Customer use case diagram:

![image](https://user-images.githubusercontent.com/22156333/49641835-383d6f00-fa09-11e8-9109-be76fa62a131.png)

### Use Case Description

1.    Register

•    Register: User access the registration page
•    User is asked to fill the registration form e.g username, full name, email, address, etc
•    User press the signup button
•    The system check if username is not already taken by other user, then check if all details are correct in order to submit the registration.
•    If all criteria are met than user is registered successfully
•    If not the system reports back to the user to fill the form properly.

2.    Login

•    User is asked to provide the username and password details in order to login to the website
•    User press the login button
•    The system checks if all credentials entered are correct:
o    If correct credentials are entered, user is redirected to home page
o    If incorrect credentials, user is asked to re-enter the details
3.    Search and View Items
•    User can search for different items be scrolling up and down on the page and view different items available on the page.
•    Also user can search for a specific item by typing a keyword on the search bar, if matching criteria is found then the item is displayed on the page. If not a message is will be prompt outlining the item was not found.
4.    Add to Cart
•    User can add an item to cart and buy the respective product or more if user wants to.
5.    Edit Shopping Cart
•    Assumption: If user is logged in
•    User can manage the shopping cart by adding more items or delete a specific item if it does not want to buy it anymore.
•    User proceed to checkout
o    User proceed to payment. Third party is accessed to check if user payment details are correct.
o    If correct the order is completed

6.    Guest

•    Can navigate through the webpage, can view items, search for in item
•    If they want to buy an item they have to register, then login using the credentials in order to proceed.

## Admin use case diagram:

![image](https://user-images.githubusercontent.com/22156333/49642468-0af1c080-fa0b-11e8-8fe7-2eff877a51fb.png)

The administrator has the full privilege to manage the website by adding a new item to the page, edit and item, delete an item, update the price of an item and manage a customer order.

### BeatriceBoutique Class Diagram

![image](https://user-images.githubusercontent.com/22156333/49642549-4a201180-fa0b-11e8-8fc4-ab65b1c6a0e8.png)

### Beatrice-Boutiques Online Shop sequence diagram

![image](https://user-images.githubusercontent.com/22156333/49642796-eb0ecc80-fa0b-11e8-9b68-8e0789c0c744.png)

### Sequence diagram for adding a product to the website

![image](https://user-images.githubusercontent.com/22156333/49643020-8607a680-fa0c-11e8-842f-9290d238595c.png)

### Sequence diagram for login user

![image](https://user-images.githubusercontent.com/22156333/49642915-2f9a6800-fa0c-11e8-8c3b-6ddc9008744f.png)



