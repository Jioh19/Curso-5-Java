<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Visualización</title>
</head>
<body>
	<h1>Información de Usuario</h1>
	<p>Nombre: ${sessionScope.nombre}</p>
	<p>Apellido: ${sessionScope.apellido}</p>
	<p>Rut: ${sessionScope.rut}</p>
	<p>Fehca de nacimiento: ${sessionScope.birth}</p>
</body>
</html>