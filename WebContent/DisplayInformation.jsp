<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Information</title>
</head>
<form action="Login.jsp">
<body>
<br> Your Information is <br><br>

	<jsp:useBean id="residential" class="com.bitwise.Login.model.Residential" scope="session"></jsp:useBean>
	<jsp:setProperty property="*" name="residential"/>
	<jsp:useBean id="education" class="com.bitwise.Login.model.EducationBean" scope="session"></jsp:useBean>
	Educational Information is : <br>  
<jsp:getProperty property="collegeName" name="education"/><br>  
<jsp:getProperty property="branch" name="education"/><br>  
<jsp:getProperty property="percentage" name="education"  /><br>  

<jsp:useBean id="occupation" class="com.bitwise.Login.model.OccupationBean" scope="session"></jsp:useBean>
	Occupational Information is : <br>  
<jsp:getProperty property="companyName" name="occupation"/><br>  
<jsp:getProperty property="designation" name="occupation"/><br>  
<jsp:getProperty property="salary" name="occupation"  /><br>


	Residential Information is : <br>  
<jsp:getProperty property="name" name="residential"/><br>  
<jsp:getProperty property="address" name="residential"/><br>
<jsp:getProperty property="city" name="residential"/><br>  
<jsp:getProperty property="pincode" name="residential"  /><br>  

<input type="submit" value="LogOut" onclick="Login.jsp">
</body>
</form>
</html>