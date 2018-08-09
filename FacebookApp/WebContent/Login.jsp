<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
<style type="text/css">
body
{
background-image: url("slide1.jpg");
background-repeat: no-repeat;
}
h2 {
	color: green;
}

.image {
	background: url("login.jpg");
	background-size: cover;
}

.login {
	background-color: aqua;
	max-width: 300px;
	position: relative;
	top: 320px;
	left: 550px;
	border-top-radius: 55px;
	text-align: center;
	border-radius: 14px 14px 0px 0px;
}

.box1 {
	background-color: lime;
	max-width: 300px;
	position: relative;
	top: 300px;
	left: 550px;
	text-align: center;
}

.box2 {
	background-color: green;
	max-width: 300px;
	position: relative;
	top: 300px;
	left: 550px;
	text-align: center;
	border-radius: 0px 0px 14px 14px;
}

.box3 {
	background-color: red;
	max-width: 300px;
	position: relative;
	top: 1px;
	left: 1px;
	text-align: center;
	border-radius: 0px 0px 14px 14px;
}

.sign {
	background-color: white;
	max-width: 300px;
	position: relative;
	top: 300px;
	left: 540px;
	text-align: center;
}
</style>
</head>
<body>
	<form action="login" method="post">
		
			<div class="login">
				<h2>LOGIN</h2>
			</div>
			<div class="box1">
				USERNAME<br>
				<input type="text" name="username" value="" maxlength="50">
			</div>
			<div class="box1">
				PASSWORD<br>
				<input type="password" name="password" value="" maxlength="50">
			</div>
			<div class="box2">
				<input type="submit" name="submit" value="Log In"><input
					type="reset" name="reset" value="Reset">
			<div class="box3">
			 <a href="EmailVerification.jsp">	<input type="button" name="forgat" value="ForgotPassword" > </a>
				</div>
				
				<div class="box3">
			 <a href="Registration.jsp">	<input type="button"  value="Register" > </a>
				</div>
				
		</div>
		
	</form>
</body>
</html>