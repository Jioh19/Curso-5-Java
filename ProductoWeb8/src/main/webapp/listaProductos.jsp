<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fn" uri = "http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista de Productos</title>
</head>
<body>
	<h3>Listado de productos</h3>
	
	<table>
		<tr>
			<td>Nombre producto</td>
			<td>Precio</td>
			<td>Acciones</td>
		</tr>
		<c:forEach var="prod" items="${sessionScope.listaProd}">
			<tr>
				<td> <c:out value="${prod.nombre }"></c:out></td>
				<td> <c:out value="${prod.precio }"></c:out></td>
				<td> <a href="/ProductoWeb8/ProductEliminarServlet?id=${prod.id }">Eliminar</a></td>
			</tr>		
		</c:forEach>
	</table>
</body>
</html>