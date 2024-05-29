<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>


	<form action="crear" method="post">
		<div class="mb-3">
			<label for="nombre" class="form-label">Nombre</label> 
			<input type="text"  class="form-control"name="nombreUsuario" id="nombreUsuario">
		</div>
		<div class="mb-3">
			<label for="password" class="form-label">Password</label> 
			<input type="text" class="form-control" name="password" id="password">
		</div>
		<div class="mb-3">
			<label for="email" class="form-label">Email</label> 
			<input type="text" class="form-control" name="email" id="email">
		</div>
		<button type="submit" class="btn btn-primary">Ingresar</button>
	</form>
</body>
</html>