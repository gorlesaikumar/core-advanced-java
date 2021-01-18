package com.myshow;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "signup", urlPatterns = { "/signup" })
public class SignUpForm extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		String name = request.getParameter("name");
		String name1 = request.getParameter("email");
		String name2 = request.getParameter("username");
		
		String name3 = request.getParameter("mobnumber");
		
		String name4 = request.getParameter("password");
		
		
		System.out.println(name+name1+name2+name3+name4);
		
		UserData ud=new UserData();
		
		ud.setName(name);
		ud.setEmail(name1);
		ud.setMobnumber(name3);
		ud.setUsername(name2);
		ud.setPassword(name4);
		
		 DBConnection db= new DBConnection();
		 db.save(ud);
		
		 pw.print("Thankyou for registering");
		 
		 RequestDispatcher rd=request.getRequestDispatcher("Loginpage.jsp");  
	     rd.include(request, response);
		
		
		
		
		
		
		
		
		
	}

}
