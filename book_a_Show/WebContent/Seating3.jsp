<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Select seats</title>
</head>
<body>
<style>

.image1{
display: block;
  margin-left:560px;
  margin-right: auto;

 
}
.header{
	text-align: center;
}
.options{
padding-top:50px;
text-align: center;
}
</style>
<div class="header">
<h2>Select seats</h2>
</div>


                  <div class="image1">
                    <img src="https://images-na.ssl-images-amazon.com/images/I/61fhQI78YpL._SY550_.jpg" alt="profile pic" class="image-height">
                    
                    </div>
                  
                  <div class="options">
                   <form action=" printbooking" method="post">
                                     
                                     <label for = "class" >select class</label>   
                                     <select id="class" name="class">
                                     <option value ="platinum" >Platinum</option>
                                     <option value ="gold" >Gold</option>
                                     <option value ="silver" >Silver</option>
                                     
                                     </select>    
                                     <label for="shows">Select show:</label>
                                     <select id="shows" name="shows">
                                     <option value="#morning show">10:30 AM</option>
                                     <option value="#matnie show"> 02:30PM</option>
                                     <option value="#first show">05:30 PM</option>
                                     <option value="#second show">08:30PM </option>
                                     </select>
                                     
                                        
                                     <label for="shows">number of seats</label>
                                     <select id="shows" name="seats">
                                     <option value="1">one</option>
                                     <option value="2">two</option>
                                     <option value="3">three</option>
                                     <option value="4">four </option>
                                     </select>
                                     
                                     <input type="submit" value= "BookNow" style="background-color:  rgb(78, 161, 199);;
                                            padding: 9px 11px;
                                            border-radius: 25px;
                                            text-decoration: none; 
                                            color: black;">
                                     
 
                                    </form>
                                
                    </div>


                            
                </div>
                
</body>
</html>