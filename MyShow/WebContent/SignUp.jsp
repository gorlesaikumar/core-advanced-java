<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>signup</title>
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
  padding-inline: 28px;
  
}
.styling button {
  padding: 10px 20px;
  background-color: dodgerblue;
  border: 1px solid #ddd;
  color: white;
  cursor: pointer;
}
.styling {
    flex-direction: column;
    
    
  }
  .heading{
  text-align: center;
  padding-top: 50px;
  }
  .btn{
  
             padding: 9px 23px;
             border-radius: 50px;
             text-decoration: none; 
             color: black;
             background-color: green;
  
  }
  
</style>
<h2 class="heading">please Register here</h2>
<form class="styling" action="signup" method="get">
<label>Firstname<input type="text" name="name" placeholder="Name" required> <br></br></label>
<label>Email.......<input type="email" name="email" placeholder="enter email" required><br></br></label>
<label>MobileNo <input type ="tel" name = "mobnumber" placeholder="enter mobile number"><br></br></label>
<label>Username.<input type="text" name = "username" placeholder="choose username" required><br></br></label>
<label>Password.<input type= "password" name= "password" placeholder="choose password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters" required><br></br></label>
<input class="btn" type="submit" value="signup">
</form>
</body>
</html>