<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- <!DOCTYPE html>
<html lang="en">
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="bootstrap/css/bootstrap-responsive.min.css" rel="stylesheet">
<script src="bootstrap/js/bootstrap.min.js"></script>
</head>
-->
<head>
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
</head>
<body>

	<div class="container">
		<table class="table">
			<thead>
				<tr>
				</tr>
				<th>Nombre</th>
				<th>Apellido</th>
				<th>Email</th>
				<th>Edad</th>
			</thead>
			<tbody>
				<c:forEach items="${lista}" var="persona">
					<tr>
						<td>${persona.nombre}</td>
						<td>${persona.apellido}</td>
						<td>${persona.email}</td>
						<td>${persona.edad}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<a href="formulario.jsp">Agregar nueva persona</a>
	</div>

</body>

<!--  
<body>

	<div class="container-fluid">
		<h1>My First Bootstrap Page</h1>
		<p>This is some text.</p>

		<h1>Iteracion de una LISTA:</h1>

		<br />

		<table class="table">
			<tr>
				<td><c:forEach items="${lista}" var="persona">

						<br>
					${persona.nombre}
					${persona.apellido}
					${persona.email}
					${persona.edad}
				
			</c:forEach></td>
			</tr>
		</table>
	</div>
</body>
-->
</html>