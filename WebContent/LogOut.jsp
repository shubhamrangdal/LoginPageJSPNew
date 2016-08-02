<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Log Out</title>
</head>
<body>
	<%
	
	%>
	<form action="LogOutServlet">
		<c:out value="Now Please Please Login"></c:out> 
		<input type="submit" value="Login" onclick="LogOutServlet">
	
	</form>
	
</body>
</html>