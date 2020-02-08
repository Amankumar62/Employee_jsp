<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
        String Empno = request.getParameter("empno");
		int empId = Integer.parseInt(Empno);
		beans.Employee emp = repository.EmployRepository.getEmployee(empId);
%>
<h2>Showing Employee details</h2>
<h2>Employee name:<%=emp.getEmpName() %></h2>
<h2>Employee no:<%=emp.getEmpNo() %></h2>
<h2>Employee department:<%=emp.getDepartment() %></h2>
<h2>Employee designation:<%=emp.getDesignation() %></h2>
<h2>Employee salary:<%=emp.getEmpSalary() %></h2>

</body>
</html>