<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="static/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<script src="static/bootstrap/js/bootstrap.bundle.min"></script>
<meta charset="UTF-8">
<title>Registro de productos</title>
</head>
<body>

	<br />

	<div class="container">

		<div class="card mx-auto" style="width: 40%;">
			<div class="card-body">
				<h5 class="card-title">Registro de Productos</h5>
				<form action="/ProductoWeb8/ProductControllerServlet" method="post">
					<div class="mb-3">
						<label for="nombre" class="form-label">Nombre</label> <input
							type="text" class="form-control" name="nombre">
					</div>
					<div class="mb-3">
						<label for="precio" class="form-label">Precio</label> <input
							type="number" class="form-control" name="precio">
					</div>
					<button type="submit" class="btn btn-primary">Ingresar</button>
				</form>

				<br /> <a href="/ProductoWeb8/ProductControllerServlet">Ver listado de
					productos</a>
			</div>
		</div>

	</div>
</body>
</html>