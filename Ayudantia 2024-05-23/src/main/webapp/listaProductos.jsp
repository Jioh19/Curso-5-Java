<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista de prodcutos</title>
</head>
<body>
	<h2>Mi lista de productos</h2>
	<table>
		<tr>
			<td>Nombre Producto</td>
			<td>Precio</td>
			<td>Acciones</td>
		</tr>
		<c:forEach var="prod" items="${sessionScope.productos}">
			<tr>
				<td><c:out value="${prod.nombre}"></c:out></td>
				<td><c:out value="${prod.precio}"></c:out></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>