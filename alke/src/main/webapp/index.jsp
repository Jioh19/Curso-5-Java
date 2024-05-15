<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Titulo Alke</title>
</head>
<body>

	<c:out value="Hola mundo"></c:out>

	<c:set var="nombre" value="Profe"></c:set>
	<c:set var="nomMayuscula" value="${fn:toUpperCase(nombre) }"></c:set>
	<c:set var="nomReemplazo"
		value="${fn:replace(nomMayuscula, 'E', '3') }"></c:set>
	<br>
	<c:out value="${nomReemplazo }"></c:out>

	<c:if test="${ fn:contains(nomReemplazo, '2') }">
		<p>Nombre inválido</p>
	</c:if>

	<!-- Manejo de formularios -->
	<form action="procesar-formulario.jsp" method="POST">
		<label for="nombre"> Nombre: </label> <input type="text" id="nombre"
			name="nombre" /> <br /> <label for="edad"> Edad: </label> <input
			type="number" id="edad" name="edad" /> <br /> <input type="submit"
			value="Enviar" /> <br />
	</form>

	Formulario:
	<form action="proceso.jsp" method="post">
		Usuario: <input type="text" name="nombre"> Contraseña: <input
			type="password" name="password"> 
			<br>
			¿Qué desea hacer?: <select
			name="operacion">
			<option value="retirar">Retirar Dinero
			<option value="ingresar" selected>Ingresar Dinero
			<option value="consultar">Consultar Saldo
		</select> 
		<br>
		Elija el tipo de moneda: <input type="Radio" name="moneda"
			value="CLP" checked>Peso Chileno <br /> <input type="Radio"
			name="moneda" value="USD"> Dolar Estadounidense <br /> <input
			type="Radio" name="moneda" value="EUR"> Euro <br /> <input
			type="Radio" name="moneda" value="JPY"> Yen <br />
		<p>
			<input type="submit" value="Enviar">
		</p>
	</form>


</body>
</html>