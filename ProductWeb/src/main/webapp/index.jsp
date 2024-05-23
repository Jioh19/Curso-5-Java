<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Registro de Productos</title>
</head>
<body>

	<form action="/ProductWeb/ProductCtrl" method="post">
	
		<label for="nombre"> Nombre del producto: </label>
		<input type="text" id="nombre" name="nombre"/>
		<br />
		<label for="edad"> Precio: </label>
		<input type="text" id="precio" name="precio"/>
		<br />
		<input type="submit" value="Enviar" />
	
	</form>
	
	<br />
	<a href="/ProductWeb/ProductCtrl">Ver listado de productos</a>

</body>
</html>