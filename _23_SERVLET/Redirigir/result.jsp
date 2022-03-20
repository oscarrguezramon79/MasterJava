<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Redirigir y reenviar</title>
</head>
<body>
	<br>
	<%
	String firstName = (String) request.getAttribute("firstName");
	if (firstName == null){
		firstName = "No encontrada solicitud";
	}
	
	String lastName = (String) request.getAttribute("Apellido");
	if (lastName == null){
		lastName = "No encontrada Solicitud";
	}
	%>
	
	<b>Nombre:</b><%=firstName%><br>
	<b>Apellido:</b><%=lastName%><br>
</body>
</html>