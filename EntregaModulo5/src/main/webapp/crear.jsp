<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.Map"%>
<%
Map<String, String> errores = (Map<String, String>) request.getAttribute("errores");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>
	<form action="/EntregaModulo5/Empleado" method="post" class="p-5 m-5">
		<div class="mb-3">
			<label for="nombre" class="form-label">Nombre</label> <input
				type="text" class="form-control" name="nombre">
			<%
			if (errores != null && errores.containsKey("nombre")) {
				out.println("<div>Error usuario: " + errores.get("nombre") + "</div>");
			}
			%>
		</div>
		<div class="mb-3">
			<label for="primerApellido" class="form-label">Primer
				Apellido</label> <input type="text" class="form-control"
				name="primerApellido">
			<%
			if (errores != null && errores.containsKey("primerApellido")) {
				out.println("<div>Error usuario: " + errores.get("primerApellido") + "</div>");
			}
			%>
		</div>
		<div class="mb-3">
			<label for="segundoApellido" class="form-label">Segundo
				Apellido</label> <input type="text" class="form-control"
				name="segundoApellido">
				<%
			if (errores != null && errores.containsKey("segundoApellido")) {
				out.println("<div>Error usuario: " + errores.get("segundoApellido") + "</div>");
			}
			%>
		</div>
		<div class="mb-3">
			<label for="email" class="form-label">Email</label> <input
				type="text" class="form-control" name="email">
		</div>
		<%
			if (errores != null && errores.containsKey("email")) {
				out.println("<div>Error usuario: " + errores.get("email") + "</div>");
			}
			%>
		<div class="mb-3">
			<label for="salario" class="form-label">Salario</label> <input
				type="number" class="form-control" name="salario">
		</div>
		<%
			if (errores != null && errores.containsKey("salario")) {
				out.println("<div>Error usuario: " + errores.get("salario") + "</div>");
			}
			%>
		<button type="submit" class="btn btn-primary">Ingresar</button>
	</form>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js"
		integrity="sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+"
		crossorigin="anonymous"></script>
</body>
</html>