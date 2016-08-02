<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="occupation" class="com.bitwise.Login.model.OccupationBean" scope="session"></jsp:useBean>
	<jsp:setProperty property="*" name="occupation"/>
	<form action="ResidentialValidate" >
	
	<br> Please Fill your Residentional Information <br><br>
	
	<table align="center">
  
  	<tr>
    	<td> Name : <input type="text" name="name"><br></td>
    </tr>
  <tr>
    <td>Address :   <input type="text" name="address"><br></td>
  </tr>
  <tr>
    <td>city :   <input type="text" name="city"><br></td>
  </tr>
  <tr>
    <td>pincode : <input type="number" name="pincode"><br></td>
  </tr>
  <tr>
    <td> <input type="submit" value="submit" onclick="ResidentialValidate"><br></td>
  </tr>
  </table>
  
  </form>
</body>
</html>