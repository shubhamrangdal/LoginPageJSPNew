<%@page import="javax.jws.soap.SOAPBinding.Use"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="EducationValidate" >
	<table align="center">
  	<br> Please Fill your educational Information <br><br>
  	<tr>
    	<td>College Name : <input type="text" name="collegeName"><br></td>
    </tr>
  <tr>
    <td>Branch Name :   <input type="text" name="branch"><br></td>
  </tr>
  <tr>
    <td>Percentage : <input type="number" name="percentage"><br></td>
  </tr>
  <tr>
    <td> <input type="submit" value="submit" onclick="EducationValidate"><br></td>
  </tr>
  </table>
  </form>
</body>
</html>