package com.ticketing;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/*
 * Servlet implementation class Movies
 */
@WebServlet(name = "movies", urlPatterns = { "/movies" })
public class Movies extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");  
        
		PrintWriter pw= response.getWriter();
        
        
        
        HttpSession session=request.getSession();  
        
       
        if( session.getAttribute("uname") != null)
          {  
        	
            RequestDispatcher dispatcher = request.getRequestDispatcher("Select.jsp");
			dispatcher.forward(request, response);
        }  
        
        else
        {  
        	
            pw.println("please login first");
            request.getRequestDispatcher("Loginpage.jsp").forward(request, response);  
        }  
        pw.close();  
		
	}

}
