<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<h3>Login Page | Login Here</h3>
<hr>
<form action="verifyLogin" method="post">
<pre>
Email    : <input type = "email" name = "email" />
Password : <input type = "password" name = "password" />
<input type = "submit" value="Login">
</pre>
</form>
${msg}
${error}
</body>
</html>