<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login</title>
</head>
<body>


<style>
.styling{
   display: flex;
   flex-flow: row wrap;
   align-items: center;
   background-color: ghostwhite;
    padding: 38px;
    margin: 500px;
    margin-top: 25px;
   
}
.styling input {
  vertical-align: middle;
  margin: 0px 35px 0px 32px;
  padding: 10px;
  
  border: 1px solid #ddd;
  padding-inline: 24px;
  
}
.styling button {
  padding: 10px 20px;
  background-color: dodgerblue;
  border: 2px solid #ddd;
  color: white;
  cursor: pointer;
}
.styling {
    flex-direction: column;
    
  }
  .heading{
  text-align: center;
  }
  .btn{
                          padding: 15px 23px;
                          border-radius: 50px;
                          text-decoration: none; 
                          color: black;
                          background-color: green;
                          
                          
  
  }
  .link{
       font-size: 18px;
       }
</style>

<h2 class="heading">Please login here</h2>
<form class="styling" action="loginpage" method="post">  
UserName:<input type="text" name="userName" style=""/><br/>  
Password:<input type="password" name="userPass"/><br/>  
 

<input class="btn" type="submit" value="login"/> 
<a class="link" href="SignUp.jsp">signup</a> 
</form>  

</body>
</html>