<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Email Verification</title>
<style type="text/css">
.box1 {
	background-color: indianred;
	max-width: 300px;
	position: relative;
	top: 100px;
	left: 1px;
	border-top-radius: 55px;
	text-align: center;
	border-radius: 14px 14px 0px 0px;
}

.box2 {
	background-color: white;
	max-width: 1px;
	position: relative;
	top: 100px;
	left: 0px;
	border-top-radius: 55px;
	text-align: center;
	border-radius: 14px 14px 14px 14px;
}
</style>
</head>

<body>
	<form action="./verification" method="post">

		<div align="center">
			<div class="box1">
				Enter Email-Id : <input type="text" name="username">
			</div>
			<br>
			<div class="box2">
				<input type="submit" value="Submit">
			</div>

		</div>

	</form>


</body>
</html>