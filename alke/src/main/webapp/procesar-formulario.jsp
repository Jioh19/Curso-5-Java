<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Procesar Formulario</title>
</head>
<body>
	<h1>Datos del formulario</h1>
	<p>Nombre: ${ param.nombre }</p>
	<p>Edad: ${ param.edad }</p>
</body>
</html>