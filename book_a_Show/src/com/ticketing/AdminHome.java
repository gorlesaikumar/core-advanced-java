package com.ticketing;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AdminHome
 */
@WebServlet(name = "adminhome", urlPatterns = { "/adminhome" })
public class AdminHome extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	response.setContentType("text/html");
	PrintWriter pw = response.getWriter();
	
	RequestDispatcher dispatcher = request.getRequestDispatcher("Admin.jsp");
	dispatcher.include(request, response);
	    
        
	Scanner sc = new Scanner(new File("C:\\Users\\d1\\eclipse-workspace\\book_a_Show\\WebContent\\bookings.csv")); 

	
	String movie =null;
	String classes =null;
	String show =null;
	String seats =null;
  
	while (sc.hasNext()) 
	{  

		 movie=sc.next();
		
	}  
	sc.close();
	
	String [] m=new String[4];
	m=movie.split(",");
	
	
	pw.print("<html>");
	pw.print("<table border='1' bgcolor='skyblue'>");  
			pw.print("<tr>");
    		pw.print(" <th>Movie name</th>");
    		pw.print(" <th>Class</th>");
    		pw.print(" <th>Show name</th>");
    		pw.print(" <th>no of tickets</th>");
    		pw.print("</tr>");
    		
	pw.print("<tr>");
	pw.print("<td>"+m[0]+"</td>");
	pw.print("<td>"+m[1]+"</td>");
	pw.print("<td>"+m[2]+"</td>");
	pw.print("<td>"+m[3]+"</td>");
	pw.print("</tr>");
	pw.print("</table>");
	pw.print("</html>");
	
 
	
	
	  					
	}

}
