<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Name Combiner</title>
<script>
function formValidation() {
  var x = document.forms["nameCombinerForm"]["firstName"].value;
  var y = document.forms["nameCombinerForm"]["lastName"].value;
  if (x == "" && y == "") {
    alert("First and Last name must be filled out");
    return false;
  }else if (x == ""){
	  alert("First name must be filled out");
	  return false;
  }else if (y == ""){
	  alert("Last name must be filled out");
	  return false;
  } 
}
</script>
</head>
<body>
	<h1>Name Combiner</h1>
	<form name="nameCombinerForm" action="getNameServlet" onsubmit="return formValidation()" method="post">
	Enter your first name:
	<input type="text" name="firstName" siza="10">
	<br>Enter your last name:
	<input type="text" name="lastName" siza="10">
	<input type="submit" value="Combine Name" />
	</form>
</body>
</html>