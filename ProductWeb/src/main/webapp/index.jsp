<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registro de productos</title>
</head>
<body>
	<form action="/ProductWeb/ProductCtrl" method="post"> 
		<label>Nombre:</label>
	    <input type="text" name="nombre">
	    <br/>
	    <label>Precio:</label>
	    <input type="number" name="precio">
	    <br/>
		<input type="submit" value="Enviar"/>
	</form>
</body>
</html>