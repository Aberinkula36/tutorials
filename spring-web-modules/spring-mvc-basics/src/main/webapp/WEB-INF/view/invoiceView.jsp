<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Spring MVC Form Handling</title>
</head>
<body>

	<h2>Submitted Invoice Information</h2>
	<h3>${msg}</h3>
	<table>
		<tr>
			<td>Concept:</td>
			<td>${concept}</td>
		</tr>
		<tr>
			<td>Quantity:</td>
			<td>${quantity}</td>
		</tr>
		<tr>
			<td>Retention percentage:</td>
			<td>${retention}</td>
		</tr>
		<tr>
        	<td>TOTAL with retention applied:</td>
        	<td>${totalWithRetention}</td>
        </tr>
	</table>
</body>
</html>