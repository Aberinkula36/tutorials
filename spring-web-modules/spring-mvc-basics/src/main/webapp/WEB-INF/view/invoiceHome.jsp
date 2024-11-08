<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Form Example - Register an Invoice</title>
</head>
<body>
	<h3>Welcome, Enter The Invoice Details</h3>

	<form:form method="POST" action="/spring-mvc-basics/addInvoice" modelAttribute="invoice">
		<table>
			<tr>
				<td><form:label path="concept">Concept</form:label></td>
				<td><form:input path="concept" /></td>
			</tr>
			<tr>
				<td><form:label path="quantity">Quantity</form:label></td>
				<td><form:input path="quantity" /></td>
			</tr>
			<tr>
				<td><form:label path="retention">Retention percentage</form:label></td>
				<td><form:input path="retention" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form:form>

</body>

</html>