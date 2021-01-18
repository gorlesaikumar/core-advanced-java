package com.myshow;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PrintBooking
 */
@WebServlet(name = "printbooking", urlPatterns = { "/printbooking" })
public class PrintBooking extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		String str1 = request.getParameter("class");
		String str2 = request.getParameter("shows");
		String str3 = request.getParameter("seats");
		
		int n =Integer.parseInt(str3);
		
		int cost = 0;
		
		if(str2.contains("@"))
		{
			if(str1.contains("platinum"))
			{
				pw.print("Thank you for booking");
				pw.print("your booking for 1917 movie is : " + str1 +" "+ str2+ " "+ "number of seats "+str3);
				pw.print("pay "+(cost=n*100));
				
			}
			if(str1.contains("gold"))
			{
				pw.print("Thank you for booking");
				pw.print("your booking for 1917 movie is : " + str1 +" "+ str2+ " "+ "number of seats "+str3);
				pw.print("pay " +(cost=n*80));
				
			}
			if(str1.contains("silver"))
			{
				pw.print("Thank you for booking");
				pw.print("your booking for 1917 movie is : " + str1 +" "+ str2+ " "+ "number of seats "+str3);
				pw.print("pay "+(cost=n*50));
				
			}
			
		}
		
		if(str2.contains("$"))
		{
			if(str1.contains("platinum"))
			{
				pw.print("Thank you for booking");
				pw.print("your booking for avathar movie is : " + str1 +" "+ str2+ " "+ "number of seats "+str3);
				pw.print("pay "+(cost=n*100));
				
			}
			if(str1.contains("gold"))
			{
				pw.print("Thank you for booking");
				pw.print("your booking for avathar movie is : " + str1 +" "+ str2+ " "+ "number of seats "+str3);
				pw.print("pay " +(cost=n*80));
				
			}
			if(str1.contains("silver"))
			{
				pw.print("Thank you for booking");
				pw.print("your booking for avathar movie is : " + str1 +" "+ str2+ " "+ "number of seats "+str3);
				pw.print("pay "+(cost=n*50));
				
			}
			
		}
		
		
		
		if(str2.contains("#"))
		{
			if(str1.contains("platinum"))
			{
				pw.print("Thank you for booking");
				pw.print("your booking for bahubali2 movie is : " + str1 +" "+ str2+ " "+ "number of seats "+str3);
				pw.print("pay "+(cost=n*100));
				
			}
			if(str1.contains("gold"))
			{
				pw.print("Thank you for booking");
				pw.print("your booking for bahubali2 movie is : " + str1 +" "+ str2+ " "+ "number of seats "+str3);
				pw.print("pay " +(cost=n*80));
				
			}
			if(str1.contains("silver"))
			{
				pw.print("Thank you for booking");
				pw.print("your booking for bahubali2 movie is : " + str1 +" "+ str2+ " "+ "number of seats "+str3);
				pw.print("pay "+(cost=n*50));
				
			}
		}
		
		try
		  {
		  
			
		  FileWriter fw = new FileWriter("booking.csv");
		  
		  
		  if(str2.contains("@"))
		  {
			  fw.append("1917");
		  }
		  if(str2.contains("$"))
		  {
			  fw.append("avathar");
		  }
		  if(str2.contains("#"))
		  {
			  fw.append("bahubali-2");
		  }
		  fw.append(',');
		  fw.append(str1);
		  fw.append(',');
		  fw.append(str2);
		  fw.append(',');
		  fw.append(str3);
		  fw.append('\n');
		  
		  
		  
		  
		  
		 
		  fw.close();
		  
		  }
		catch (Exception e) {
			e.printStackTrace();
		}
	
				
			
		}
}


