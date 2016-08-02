<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="education" class="com.bitwise.Login.model.EducationBean" scope="session"></jsp:useBean>
	<jsp:setProperty property="*" name="education"/>
	<form action="OccupationValidate" >
	<br> Please Fill your Occupational Information <br><br>
	
	<table align="center">
  	<tr>
    	<td>Company Name : <input type="text" name="companyName"><br></td>
    </tr>
  <tr>
    <td>Designation :   <input type="text" name="designation"><br></td>
  </tr>
  <tr>
    <td>salary : <input type="number" name="salary"><br></td>
  </tr>
  <tr>
    <td> <input type="submit" value="submit" onclick="OccupationValidate"><br></td>
  </tr>
  </table>
  
  </form>
</body>
</html>