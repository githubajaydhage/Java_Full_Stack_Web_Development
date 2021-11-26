<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p>Welcome to JSP </p>
<%
int a=10;
int b=20;
int sum = a+b;
out.println("Welcome to JSP page");
out.println("Sum of two number is "+sum);
out.println("<font color=red>Sum of two number is "+sum+"</font>");
%>
<font color="red">The sum of two number is <%=sum %></font>
</body>
</html>