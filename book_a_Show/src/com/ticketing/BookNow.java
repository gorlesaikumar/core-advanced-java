package com.ticketing;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "booking", urlPatterns = { "/booking" })
public class BookNow extends HttpServlet {
	private static final long serialVersionUID = 1L;

	   String shows=null;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
        String str = request.getParameter("shows");
		
		if(str.contains("@")) {
			pw.print("Thankyou for booking");
			pw.print("your booking for 1917 is "+str);
			
		}
		if(str.contains("#")) {
			pw.print("Thankyou for booking");
			pw.print("your booking for Avathar is "+str);
			
		}
		if(str.contains("$")) {
			pw.print("Thankyou for booking");
			pw.print("your booking for bahubali is "+str);
			
		}
		
			
		
		
		
	}

}
