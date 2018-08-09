<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>

</head>

<body bgcolor="cyan">
<form action="register" method="post">
<div align="center">
<h1 style="color: blue">Registration</h1>
<marquee style="color: green"><h3>*****Register and Get 500 Rs bonus******</h3></marquee>
<pre>
FirstName: <input type="text" name="fname"maxlength="30" id=""><br>
LastName: <input type="text" name="lname" maxlength="30" id="" ><br>
Gender: Male<input type="radio" name="gender" value="Male"> Female <input type="radio" name="gender" value="Female"><br>
EmailID: <input type="text" name="username" maxlength="30" id="" >  Existing MailId<br>
Password:<input type="password" name="password" maxlength="30" id="" ><br>
ConformPassword: <input type="password" name="cpassword" maxlength="30" id="" ><br>
Mobile: <input type="text" name="mobilenumber" maxlength="10" ><br>
 <input type="submit" value="Register" > <input type="reset" value="Reset"> <br>
 <a href=Login.jsp><input type="button"  value="Login" > </a>
</pre>
</div>
</form>
</body>
</html>