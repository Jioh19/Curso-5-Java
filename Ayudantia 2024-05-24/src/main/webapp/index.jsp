<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.Map" %>
<% Map<String, String> errores = (Map<String, String>)request.getAttribute("errores"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css">

<title>Principal</title>
</head>
<body>
	<form class="card m-5 p-2" action="/Ayudantia_2024-05-24/CrearCliente" method="post">
		<label for="nombre">Nombre</label> 
		<input type="text" name="nombre">
		<% if(errores != null && errores.containsKey("nombre")) {
			out.println( "<div>Error nombre: " + errores.get("nombre")+ "</div>");
			}%>
		<label for="apellido">Apellido</label> 
		<input type="text"name="apellido"> 
		<% if(errores != null && errores.containsKey("apellido")) {
			out.println( "<div>Error apellido: " + errores.get("apellido")+ "</div>");
			}%>
		<label for="rut">Rut</label> 
		<input type="text" name="rut"> 
		<% if(errores != null && errores.containsKey("rut")) {
			out.println( "<div>Error rut: " + errores.get("rut")+ "</div>");
			}%>
		<input class="mt-2" type="submit" value="enviar">

		<script
			src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js"></script>
</body>
</html>