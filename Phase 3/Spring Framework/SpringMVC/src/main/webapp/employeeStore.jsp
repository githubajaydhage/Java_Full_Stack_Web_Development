<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Store Employee Details</h2>
<spring:form action="storeEmployee" modelAttribute="empRef">
<label>Id</label>
<spring:input path="id"/><br/>
<label>Name</label>
<spring:input path="name"/><br/>
<label>Salary</label>
<spring:input path="salary"/><br/>
<input type="submit" value="submit"/>
<input type="reset" value="reset"/>
</spring:form>
</body>
</html>