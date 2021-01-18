<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<style>
            .headerclass{
                text-align: center;
                background-color: rgb(243, 77, 77);
                padding: 3px;
                font-size: 20px;
            }
            .header{
                text-align: center;
                background-color:white;
                padding: 5px  ;
                overflow: hidden;
                font-size: 24px;
            }
            .headermenu{
                float: left;
                overflow: hidden;
                color:white;
                font-family: Georgia, 'Times New Roman', Times, serif;
                margin-left: 10px;
               
                
            }
            .login{
                text-align: right;
                text-decoration: white;
                float: right;
                margin-right: 15px;

            }
            .footer{
               position: fixed;
               width: 100%;
               background-color:rgb(255, 79, 79);
               left: 0px;
               bottom: 0px;
               text-align: center;
              
            }
            .about ul{
                text-align: center;
               
                width:25%;
	            float:left;
                list-style: none;
                margin-left: 25px;
            }
            .careers ul{
                text-align: center;
                width:25%;
	            float:left;
	            
	            color:white;
                list-style: none;
            }
            .offer ul{
                text-align: center;
                
                width:25%;
	            float:left;
                list-style: none;
                margin-left:125px;
                margin-right:50px;
            }
            .container{
               height: 50px;
               width: 75%;
                
            }
            A {text-decoration: none;
            color: black;}
            .active{
                margin: 10px;
            }
            .content{
                margin-left:750px;
                
                text-align: center;
                font-size: 40px;
                font-style: italic;
                font-weight: bold;
                margin-top: 150px;
}
            }
            

        </style>
        <header>
            <div class="headerclass">
                <h2>Book A Show</h2>
            </div>
        </header>
            
            
        <div class="header">
           
            <div class="headermenu">
                <a href="movies">Movies</a>
                <a href="plays.jsp">plays</a>
                
            </div>
            <div class="login">
            
            <form action="logout" method="post">
            <button type="submit">logout</button>
            </form>
            
                
                
            </div>
        </div>
        <div class="container">
            <img  style="height: 480px;" src="https://i.ytimg.com/vi/EKbH3DjVuko/maxresdefault.jpg" alt="picture" >
            
           

        </div>
        <div class=" content">
            <p>love the movie <br>
            live in the movie 
        </div>
        
        <footer>
        <div class="footer">
            <div class="about">
                <ul>
                <li><a href="#events">Events</a></li>
                <li><a href="#popular">popular</a></li>
                <li><a href="#fun zone">Funzone</a></li>
            </ul>
            </div>
            <div class="careers">
                <ul>
                <li><a href="#watch">watch</a></li>
                
                <li><a href="#present">present</a></li>
                
                <li><a href="#guide">Guide</a></li>
            </ul>
            </div>
            <div class="offer">
                <ul>
               <li><a href="#offers">New Offers</a></li>
                
                <li><a href="#redeem"> Redeem here</a></li>
                
                <li><a href="#invite">Invite friends</a></li>
            </ul> 
            </div>
        </div>
    </footer>

</body>
</html>