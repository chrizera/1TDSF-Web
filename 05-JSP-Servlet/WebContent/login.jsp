<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>

	<h1>Entre</h1>
	<% if (request.getAttribute("qualquer") != null ) {%>
		<%= request.getAttribute("qualquer") %>
	<% } %>
	<form action="logar" method="post">
		<div>
			<input type="text" name="login">
			<input type="password" name="senha">
			<input type="submit" value="Enviar">
		</div>
	</form>

</body>
</html>