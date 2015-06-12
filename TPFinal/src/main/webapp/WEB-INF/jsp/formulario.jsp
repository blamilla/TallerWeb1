<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form method="post" action="home.html">
		<div class="form-group">
			<form:label for="nombre">Nombre</form:label>
			<input type="text" class="form-control" id="nombre"
				placeholder="Nombre">
		</div>
		<div class="form-group">
			<form:label>
				<form:label for="apellido">Apellido</form:label>
				<input type="text" class="form-control" id="apellido"
					placeholder="Apellido">
			</form:label>
		</div>
		<div class="form-group">
			<form:label for="email">Email</form:label>
			<input type="email" class="form-control" id="email"
				placeholder="Ingresar Email">
		</div>
		<div class="form-group">
			<form:label for="edad">Edad</form:label>
			<input type="text" class="form-control" id="edad" placeholder="Edad">
		</div>
		<button type="submit" class="btn btn-default">Submit</button>
	</form:form>
</body>
</html>