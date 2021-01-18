package com.myshow;
import java.sql.*;
import java.util.*;

public class DBConnection 
{
	public static Connection getConnection()
	{  
        Connection con=null;  
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bookashow","root","techouts");  
           }
        catch(Exception e)
        {
        	System.out.println(e);
        }
       
	
        return con;
	}


public  int save(UserData e){  
    int status=0;  
    try{  
        Connection con=DBConnection.getConnection();  
        PreparedStatement ps=con.prepareStatement(  
                     "insert into userdata values (?,?,?,?,?)");  
        ps.setString(1,e.getName());  
         
        ps.setString(2,e.getEmail());  
        ps.setString(3,e.getUsername());
        ps.setString(4,e.getPassword());
        ps.setString(5,e.getMobnumber());  
        status=ps.executeUpdate();  
        System.out.println(status);  
        con.close();  
    }catch(Exception ex){ex.printStackTrace();}  
      
    return status;
} 
}