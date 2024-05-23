<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/styles.css">
<title>Mi primer servlet</title>
</head>
<body>
    <h1>Mi primer HTML</h1>
    <section class="card">
        <form action="/Ayudantia_2024-05-22/Parametro" method="get">
            <label for="nombre">Nombre</label>
            <input type="text" name="nombre">
            <label for="precio">Precio</label>
            <input type="text" name="precio">
            <button type="submit" value="Enviar">Enviar</button>

        </form>
    </section>
</body>
</html>