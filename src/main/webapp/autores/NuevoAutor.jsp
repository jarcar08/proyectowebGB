<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String url = "http://localhost:8080/WebApp1/AutoresController";
	%>

	<h3>Nuevo autor</h3>
	<form role="form" action="<%=url%>AutoresController?op=listar" method="POST">
		<input type="hidden" name="op" value="insertar">
		Nombre del autor: <input type="text" name="nombre" id ="nombre"> <br>
		Nacionalidad: <input type="text" name ="nacionalidad" id = "nacionalidad"><br>
		<input type="submit" name="Guardar" value="Guardar">
		<a href ="<%=url%>?op=listar">Volver</a>
		</form>


</body>
</html>