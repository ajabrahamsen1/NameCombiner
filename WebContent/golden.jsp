<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Golden Birthday</title>
</head>
<body>
	<h1>Golden Birthday Finder</h1>
	<form action="getGoldenServlet" method="post">
	Enter the name of the month you were born:
	<input type="text" name="monthName" size="10">
	<br>Enter the day of the month you were born:
	<input type="text" name="dayOfMonth" size="10">
	<br>Enter the year you were born:
	<input type="text" name="year" size="10">
	<input type="submit" value="Find Golden Birthday" />
	</form>
</body>
</html>