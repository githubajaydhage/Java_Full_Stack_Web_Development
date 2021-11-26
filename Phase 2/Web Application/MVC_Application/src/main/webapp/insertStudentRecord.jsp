<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Insert Student Record</h2>
<form action="StudentController" method="post">
<label>Student Id</label>
<input type="text" name="sid"><br/>
<label>SName</label>
<input type="text" name="name"><br/>
<label>Age</label>
<input type="text" name="age"><br/>
<input type="submit" value="Store Record">
<input type="reset" value="reset">
</form>
</body>
</html>