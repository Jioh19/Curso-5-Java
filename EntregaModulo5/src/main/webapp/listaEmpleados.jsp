<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista Empleados</title>
</head>
<body>
	<h1>Lista de Empleados</h1>
	
	<table>
		<tr>
			<td>id</td>
			<td>Nombre</td>
			<td>Primer Apellido</td>
			<td>Segundo Apellido</td>
			<td>Email</td>
			<td>Salario</td>
		</tr>
		<c:forEach var="empleado" items="${sessionScope.empleados}">
			<tr>
				<td> <c:out value="${empleado.id}"></c:out> </td>
				<td> <c:out value="${empleado.nombre}"></c:out> </td>
				<td> <c:out value="${empleado.primerApellido}"></c:out> </td>
				<td> <c:out value="${empleado.segundoApellido}"></c:out> </td>
				<td> <c:out value="${empleado.email}"></c:out> </td>
				<td> <c:out value="${empleado.salario}"></c:out> </td>
			</tr>
		</c:forEach>
	
	</table>
</body>
</html>