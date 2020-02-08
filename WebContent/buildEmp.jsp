<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<h2>Build Successfully</h2>
		<jsp:useBean id="e1" class="beans.Employee" scope="application"/>
		<jsp:setProperty property="*" name="e1"/>
		<%
		repository.EmployRepository.addEmployee(e1);
		%>>
		<a href="main.jsp">Back to Main</a>

</body>
</html>