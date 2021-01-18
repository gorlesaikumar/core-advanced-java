<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>

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
               height: 15px;
               width: 100%;
                
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
            .reels{
               display: block;
               padding-top: 5px;
               margin-left: 22px;
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
                <a href="Loginpage.jsp">Login</a>
                
            </div>
        </div>
        <div class="container">
            <img  style="height: 425px;" src="https://blog.bannersnack.com/wp-content/uploads/2015/08/Top-10-must-see-movies-for-designers-Bannersnack-1-1-1200x675.png" alt="picture" >
            
            <div class=" reels"> <img style="height: 90px; width: 180px; alt="reels" src="https://madaboutmoviez.files.wordpress.com/2015/09/temper-movie-hd-posters-2.jpg?w=1200"> 
            <img  style="height: 90px; width: 180px; alt="reels" src="https://webneel.net/file/images/11-16/8-xmen-movie-poster-design.jpg">
            <img  style="height: 90px; width: 180px; alt="reels" src="https://houseofgeekery.files.wordpress.com/2017/12/the_avengers_poster-banner.jpg">
            <img  style="height: 90px; width: 180px; alt="reels" src="https://aambar.files.wordpress.com/2016/01/therevenant-movie-poster.jpg">
            <img  style="height: 90px; width: 180px; alt="reels" src="https://mir-s3-cdn-cf.behance.net/project_modules/1400/bdd8fb44912715.5821fe577f4ee.jpg">
            <img  style="height: 90px; width: 180px;alt="reels" src="https://4.bp.blogspot.com/--lJ43mrnNJM/VHYVyBoI5KI/AAAAAAAC2Xo/xGSWlvLYU1I/s1600/Kavvintha%2BTelugu%2BMovie%2BPosters-Wallpapers%2B(1).jpg">
            <img  style="height: 90px; width: 180px;alt="reels" src="https://2.bp.blogspot.com/-bAk1I3tuM98/VjxKzIAm1cI/AAAAAAAADTY/3yXiuzSuo3s/s1600/Dhoom3-all-actor-Fire-HD-poster.jpg">
            <img  style="height: 90px; width: 180px;alt="reels" src="https://images.freekaamaal.com/post_images/1570622423.jpg">
            
            
            
            
            </div>
           

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