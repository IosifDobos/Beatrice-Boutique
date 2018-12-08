package com.example.command;
//
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//
import com.example.business.User;
import com.example.service.UserService;

public class RegisterUserCommand {
	
	public String execute(HttpServletRequest request, HttpServletResponse repsonse) {
		
		UserService userService = new UserService();
		String forwardToJsp = "";
//		
		String firstname = request.getParameter("firstName");
		String lastname = request.getParameter("lastName");
		String addressline1 = request.getParameter("addressLine1");
		String addressline2 = request.getParameter("addressLine2");
		String phoneno = request.getParameter("phoneNo");
		String email = request.getParameter("email");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String retypepassword = request.getParameter("retypePassword");

		
		
		if(firstname != null && lastname != null && addressline1 != null && addressline2 != null && phoneno != null
				&& email != null && username != null && password != null ) 
		{
			//Make call to the 'Model' using the UserServive class to login...
			User registerUserIn = userService.register(firstname, lastname,
					addressline1, addressline2,phoneno, email, username, password);

			if (registerUserIn != null && password == retypepassword)
			{

				forwardToJsp = "/login.html";	
			}
			else
				System.out.println("Password doesn't match!");
				forwardToJsp = "/registerFailure.jsp";
		}
		else
		{	
			System.out.println("Fields cannot be blank");
			forwardToJsp = "/registerFailure.jsp";		
			
		}
		
		return forwardToJsp;
	}
}
