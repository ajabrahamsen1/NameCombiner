<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to the Java EE World!</title>
</head>
<body>
	<h1>Name Combiner</h1>
	<form action="getNameServlet" method="post">
	Enter your first name:
	<input type="text" name="firstName" siza="10">
	<br>Enter your last name:
	<input type="text" name="lastName" siza="10">
	<input type="submit" value="Combine Name" />
	</form>
</body>
</html>