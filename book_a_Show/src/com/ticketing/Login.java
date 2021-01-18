package com.ticketing;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

/**
 * Servlet implementation class Login
 */
@WebServlet(name = "loginpage", urlPatterns = { "/loginpage" })
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");  
	    PrintWriter pw = response.getWriter();  
	          
	    String n=request.getParameter("userName");  
	    String p=request.getParameter("userPass");  
	          
	    
	    Connection con=(Connection) DBConnection.getConnection();  
        try {
			java.sql.PreparedStatement ps=con.prepareStatement("select * from userdata where username=? and password=?");
		
			ps.setString(1, n);
			ps.setString(2, p);
			
			java.sql.ResultSet resultSet =  ps.executeQuery();
			
			if(resultSet.next()) {
				
				HttpSession session=request.getSession();  
				session.setAttribute("uname",n); 
				RequestDispatcher rd = request.getRequestDispatcher("LoginHome.jsp");
				rd.include(request, response);	
				}
				
					
			else{
					  
					   java.sql.PreparedStatement pst= con.prepareStatement("select * from admindata where username=? and password=?");
						
						pst.setString(1, n);
						pst.setString(2, p);
						
						java.sql.ResultSet rs =  pst.executeQuery();
						
						if(rs!=null) {
						while(rs.next()) {
							
							HttpSession session=request.getSession();  
					        session.setAttribute("uname",n);
					        
								
						} 
						RequestDispatcher rd = request.getRequestDispatcher("Admin.jsp");
						rd.forward(request, response);
						}
						
					 else {
				      
					  pw.print("Sorry UserName or Password Error!"); 
					  RequestDispatcher rd=request.getRequestDispatcher("Loginpage.jsp"); 
					  rd.include(request, response);
					  
					  }
				  
						
				  }
			      
        } 	
            
           catch (SQLException e) {
			e.printStackTrace();
		         }
        }
}
