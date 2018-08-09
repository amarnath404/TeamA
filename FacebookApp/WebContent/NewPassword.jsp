<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ForgotPassword</title>
<style type="text/css">

.pass1 {
	background-color: LightPink ;
	max-width: 300px;
	position: relative;
	top: 320px;
	left:1px;
	border-top-radius: 55px;
	text-align: center;
	border-radius: 14px 14px 0px 0px;
}

.pass2 {
	background-color: LightPink ;
	max-width: 300px;
	position: relative;
	top: 300px;
	left:1px;
	border-top-radius: 55px;
	text-align: center;
	border-radius: 0px 0px 0px 0px;
}


.pass3 {
	background-color: Olive ;
	max-width: 300px;
	position: relative;
	top: 280px;
	left:1px;
	border-top-radius: 55px;
	text-align: center;
	border-radius: 0px 0px 14px 14px;
}


</style>
</head>
<body>

	<form action="./nPassword" method="post">
		<div align="center">
		
		<div class="pass1">NewPassword<input type="password" name="password"></div><br>
		<div class="pass2">ConformPassword<input type="password" name="cpassword" > </div><br>
		<div class="pass3">	<input type="submit" value="Submit"> </div>
		</div>
	</form>
</body>
</html>