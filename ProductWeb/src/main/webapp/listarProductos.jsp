<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listado de productos</title>
</head>
<body>

	<h3>Listado de productos</h3>
	
	<table>
		<tr>
			<td>Nombre Producto</td>
			<td>Precio</td>
			<td>Acciones</td>
		</tr>
		<c:forEach var="prod" items="${sessionScope.listaProd}">
			<tr>
				<td> <c:out value="${prod.nombre}"></c:out> </td>
				<td> <c:out value="${prod.precio}"></c:out> </td>
				<td> <a href="/ProductWeb/ProductoEliminarServlet?id=${prod.id}"> Eliminar </a></td>
			</tr>
		</c:forEach>
	
	</table>

</body>
</html>