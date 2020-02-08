<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/WEB-INF/tlds/departmentAvgSalary.tld" prefix="show" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%String dept = request.getParameter("department"); %>
    <pre>	
	<show:deptAvg name="dept" ></show:deptAvg>
	<a href="main.jsp">Back to main</a>
	</pre>
</body>
</html>