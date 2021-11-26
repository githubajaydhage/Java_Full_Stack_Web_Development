<%@page import="java.util.Iterator"%>
<%@page import="com.entity.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Student Details</h2>
<table border="1">
<tr>
	<th>SId</th>
	<th>SName</th>
	<th>Age</th>
</tr>
<%
Object obj = request.getAttribute("obj");
List<Student> listOfStd = (List<Student>)obj;
Iterator<Student> li = listOfStd.iterator();
while(li.hasNext()){
		Student ss = li.next();
		%>
		
		<tr>
		<td><%=ss.getSid() %></td>
		<td><%=ss.getName() %></td>
		<td><%=ss.getAge() %></td>
		</tr>
		
		<%	
}
%>

</table>
</body>
</html>