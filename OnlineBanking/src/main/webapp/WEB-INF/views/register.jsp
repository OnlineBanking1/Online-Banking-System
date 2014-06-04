
<%@ page session="false" language="java" contentType="text/html; charset=ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 



<html>
<head>
<title>Register</title>
</head>
<body>
<h1>Registration Details</h1>
<form:form method="Post" action="register" modelAttribute="customer">
<table>

<tr>
<td>First Name:</td>
<td><form:input path="first_name" /></td>
<td><font color="red"><form:errors path="first_name" /></font></td></tr>
<tr>
<td>Last Name:</td>
<td><form:input path="last_name" /></td>
<td><font color="red"><form:errors path="last_name" /></font></td></tr>
<tr>
<td>Address1:</td>
<td><form:input path="address1" /></td>
<td><font color="red"><form:errors path="address1" /></font></td></tr>
<tr>
<td>Address2:</td>
<td><form:input path="address2" /></td>
<td><font color="red"><form:errors path="address2" /></font></td></tr>
<tr>
<td>City:</td>
<td><form:input path="city" /></td>
<td><font color="red"><form:errors path="city" /></font></td></tr>
<tr>
<td>State:</td>
<td><form:input path="state" /></td>
<td><font color="red"><form:errors path="state" /></font></td></tr>
<tr>
<td>Zip Code:</td>
<td><form:input path="zipCode" /></td>
<td><font color="red"><form:errors path="zipCode" /></font></td></tr>
<tr>
<td>Email:</td>
<td><form:input path="email" /></td>
<td><font color="red"><form:errors path="email" /></font></td></tr>
<tr>
<tr>
<td>Mobile:</td>
<td><form:input path="mobile" /></td>
<td><font color="red"><form:errors path="mobile" /></font></td></tr>

 

<tr>
<td>User Name:</td>
<td><form:input path="user_name" /></td>
<td><font color="red"><form:errors path="user_name" /></font></td></tr>
<tr>
<td>Password:</td>
<td><form:password path="password" /></td>
<td><font color="red"><form:errors path="password" /></font></td></tr>
<tr>
<td>Confirm Password:</td>
<td><form:password path="confirm_password" /></td>
<td><font color="red"><form:errors path="confirm_password" /></font></td></tr>
</table>
<input type="submit" value="Submit" />
</form:form>
</body>
</html>