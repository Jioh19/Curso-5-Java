<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Inicio</title>
</head>
<body>

	<form action="/WebDinamica/ValidationServlet" method="post">
		<label>Nombre:</label>
	    <input type="text" name="nombre">
	    <br/>
	    <label>Edad:</label>
	    <input type="number" name="edad">
	    <br/>
		<input type="submit" value="Enviar"/>
	</form>
	
</body>
</html>