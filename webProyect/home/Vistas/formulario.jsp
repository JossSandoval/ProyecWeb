 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="/css/media/style.css">
    <title>formulario</title>
</head>
<body>
	<style type="text/css">
	
</style>


	<div class="container">
      <div class="logoimg">
		<img src="/css/media/logopjmx.png" alt="">
      </div>
      <div id="together">
        <h3>
             Let´s make it happen toggether!
        </h3>
      </div>
    </div> 

   
    <div class="form-container" class="login">
        <span id="singhere">
            Already Have Account? <a href="#"> Sign In Here</a>
        </span>
        <h1 class="count">
            Create An Account
        </h1>
        <form action="<%= request.getContextPath() %>/CountController" method="post">
     <!--   <form action="/CountController" method="post"> -->
      
			<table style="with: 80%">
    			<tr>
                <td> Name</td> 
                <td><input class="box" type="text" name="name"></td>
				</tr>
				
				<tr>
				<td> Last Name </td>
				<td><input class="box" type="text" name="lastName"> </td>
				</tr>	
						
				<tr>
				<td> Email </td>
				<td><input class="box" type="text" name="email"> </td>
				</tr>	
					
				<tr>
				<td> Address </td>
				<td><input class="box" type="text" name="address">  </td>
				</tr>	
						
				<tr>
				<td>Password</td>
				<td><input class="box" type="text" name="password"> </td>
				</tr>	
					
				<tr>
				<td>Confirm</td>
				<td><input id="passwordbox" class="box" type="text" name="passwordConfirm" >
				 </td>
				</tr>	
		</table>
		<input type="submit" value="Submit" />
			</form>
			
			
			
		</div>
	

</body>
</html>