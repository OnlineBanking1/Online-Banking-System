
<%@ page session="false" language="java" contentType="text/html; charset=ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 



<html>
<head>
<title>Login</title>
</head>
<body>
<h1>Login Details</h1>
<form:form method="Post" action="login" modelAttribute="customer">
<table>
<tr>
<td>User Name:</td>
<td><form:input path="user_name" /></td>
<td><font color="red"><form:errors path="user_name" /></font></td></tr>
<tr>
<td>Password:</td>
<td><form:password path="password" /></td>
<td><font color="red"><form:errors path="password" /></font></td></tr>
</table>
<input type="submit" value="Submit" />
</form:form>
</body>
</html>