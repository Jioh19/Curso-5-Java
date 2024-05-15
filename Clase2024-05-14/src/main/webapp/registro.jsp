<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registro</title>
</head>
<body>
	<h1>Bienvenido</h1>
	
	<form action="/Clase2024-05-14/RegistroServlet" method="post">
		<label>Nombre:</label>
		<input type="text" name="nombre">
		<br/>
		<label>Apellido:</label>
		<input type="text" name="apellido">
		<br/>
		<label>Rut:</label>
		<input type="text" name="rut">
		<br/>
		<label>Fecha de nacimiento:</label>
		<input type="text" name="birth">
		<br/>
		<input type="submit" value="Enviar">	
	</form>
</body>
</html>